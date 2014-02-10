/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project Java.1.src.com.chat.frame;

/**
 *
 * @author Sudipta Bera
 */
import java.io.*;
import java.net.Socket;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;

// Referenced classes of package sukhwinder.chat:
//            Server, Chatter

public class ServerThread extends Thread
{

    public void run()
    {
        try
        {
            dos = new DataOutputStream(socket.getOutputStream());
            dis = new DataInputStream(socket.getInputStream());
            do
            {
                name = dis.readUTF();
                name = name.substring(name.lastIndexOf(":") + 1);
                if(!server.chatterExists(name))
                    break;
                dos.writeUTF("Login:0");
            } while(true);
            chatter = new Chatter(name, socket, dis, dos);
            dos.writeUTF("Login:1");
            server.sendToAll(name + " joined");
            server.putChatter(chatter);
            dos.writeUTF("Welecome " + name + " !");
            server.sendToAll("ChatterList:" + prepareChatterList());
            do
            {
                Date date = new Date();
                DateFormat dateformat = DateFormat.getTimeInstance(3);
                String s = dateformat.format(date);
                message = dis.readUTF();
                server.sendToAll(name + " (" + s + "): " + message);
            } while(true);
        }
        catch(EOFException eofexception) { }
        catch(IOException ioexception) { }
        finally
        {
            if(chatter != null)
            {
                server.removeChatter(name);
                server.sendToAll("ChatterList:" + prepareChatterList());
                server.sendToAll(name + " left");
            } else
            {
                try
                {
                    System.out.println("Removed connection: " + socket);
                    socket.close();
                }
                catch(Exception exception1)
                {
                    System.out.println(exception1.getMessage());
                }
            }
        }
    }

    public String prepareChatterList()
    {
        StringBuffer stringbuffer = new StringBuffer("");
        for(Iterator iterator = server.getChatters(); iterator.hasNext(); stringbuffer.append(((Chatter)iterator.next()).getName() + ":"));
        return stringbuffer.toString();
    }

    public ServerThread(Server server1, Socket socket1)
    {
        server = server1;
        socket = socket1;
        start();
    }

    private Server server;
    private Chatter chatter;
    private String name;
    private String message;
    private DataInputStream dis;
    private DataOutputStream dos;
    private Socket socket;
}
