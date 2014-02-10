/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

//package Project Java.1.src.com.chat.frame;

/**
 *
 * @author Sudipta Bera
 */
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;

// Referenced classes of package sukhwinder.chat:
//            Console, ServerThread, Chatter

public class Server
{

    public static void main(String args[])
    {
        int i = 0;
        try
        {
            i = Integer.parseInt(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            i = 5000;
        }
        catch(NumberFormatException numberformatexception)
        {
            i = 5000;
        }
        finally
        {
            new Server(i);
        }
    }

    private final void listen(int i)
    {
        try
        {
            ss = new ServerSocket(i);
            System.out.println("Listening on " + i);
            new Console();
            do
            {
                s = ss.accept();
                System.out.println("Connection from " + s);
                new ServerThread(this, s);
            } while(true);
        }
        catch(IOException ioexception)
        {
            System.out.println("IO Exception: " + ioexception.getMessage());
        }
    }

    void sendToAll(String s1)
    {
        synchronized(chatters)
        {
            for(Iterator iterator = getChatters(); iterator.hasNext();)
                try
                {
                    chatter = (Chatter)iterator.next();
                    chatter.getDOS().writeUTF(s1);
                }
                catch(IOException ioexception)
                {
                    System.out.println("Error while sending message" + ioexception.getMessage());
                }
                catch(Exception exception)
                {
                    System.out.println("Exception while sending message: " + exception.getMessage());
                }

        }
    }

    public void removeChatter(String s1)
    {
        System.out.println("Removing chatter " + s1);
        Socket socket = getChatter(s1).getSocket();
        synchronized(chatters)
        {
            chatters.remove(s1);
        }
        try
        {
            socket.close();
        }
        catch(IOException ioexception)
        {
            System.out.println("Error closing socket: " + ioexception.getMessage());
        }
    }

    public boolean chatterExists(String s1)
    {
        return chatters.containsKey(s1);
    }

    public Iterator getChatters()
    {
        return chatters.values().iterator();
    }

    public Chatter getChatter(String s1)
    {
        return (Chatter)chatters.get(s1);
    }

    public void putChatter(Chatter chatter1)
    {
        chatters.put(chatter1.getName(), chatter1);
    }

    public Server(int i)
    {
        chatters = new HashMap();
        listen(i);
    }

    private ServerSocket ss;
    private Socket s;
    private DataInputStream dis;
    private DataOutputStream dos;
    private Map chatters;
    private Chatter chatter;
}
