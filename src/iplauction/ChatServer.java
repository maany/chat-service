/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package iplauction;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author MAYANK
 */
public class ChatServer {
    private ArrayList<String> connectionList = new ArrayList<String>();
    private ArrayList<String> messageList = new ArrayList<String>();
    private final String name;
    String method; // message or create or recieve
    String pattern = "(.*):(.*):(.*)"; // regex matcher pattern
    private String message;
    public ChatServer(String name)
    {
        connectionList.add(name); // 0th position is server
        this.name = name;
        /*routing system*/
        while(true)
        {
            try {
                /*read message from client*/
                ServerSocket server = new ServerSocket(4201);// listen on port 4201
                Socket client = server.accept();
                InputStream clin = client.getInputStream();
                DataInputStream din = new DataInputStream(clin);
                message = din.readUTF();
                //use regex to decode
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(message);
                // now m contains 3 groups as method : name : message ; 
                checkAndAdd(m.group(1));
                if(m.group(0).compareToIgnoreCase(message)==0)
                {
                    recieve(client,m.group(1),m.group(2));
                    messageList.add(m.group(1)+" : "+m.group(2));
                }
            } catch (IOException ex) {
                Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    public void checkAndAdd(String name)
    {
        boolean matchFound = false;
        for(String e :connectionList)
        {
            if(e.equalsIgnoreCase(name))
               matchFound = true;
               break;
        }
        if(matchFound == false)
        {
            connectionList.add(name);
        }
    }
    public void createConnection(Socket client,String name)
    {
        connectionList.add(name);
        send(client,name," has just joined chat");
    }
    public void send(Socket client,String name,String message)
    {
        
       // for(int i=0;i<connectionList.size();i++)
       // {
            try {
                //ServerSocket server = new ServerSocket(4200);
                //Socket client = server.accept();
                
                OutputStream clout = client.getOutputStream();
                PrintWriter clprint = new PrintWriter(clout);
                for(String e: messageList)
                {
                     clprint.write(e);
                }
                } catch (IOException ex) {
                Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
            }
      //  }
        
    }
    public void recieve(Socket client,String name,String message)
    {
        try {
           
            // no need of code below as connection is already established
            /*ServerSocket server = new ServerSocket(4201); // port 4201 recieves messages
            Socket client = server.accept();
            InputStream clin = client.getInputStream();
            DataInputStream din = new DataInputStream(clin);
            message = din.readUTF();*/
            /**
             * add code here for keeping track of messages sent by each user. eg -> create
             * a String array for each user that stores the messages sent by them.
             */
            send(client,name,message);
        } catch (Exception ex) {
            Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
