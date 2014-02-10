/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project Java.1.src.com.chat.frame;

/**
 *
 * @author Sudipta Bera
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class Chatter
{

    public String getName()
    {
        return name;
    }

    public void setName(String s)
    {
        name = s;
    }

    public Socket getSocket()
    {
        return socket;
    }

    public DataInputStream getDIS()
    {
        return dis;
    }

    public DataOutputStream getDOS()
    {
        return dos;
    }

    public Chatter(Socket socket1, DataInputStream datainputstream, DataOutputStream dataoutputstream)
    {
        this("", socket1, datainputstream, dataoutputstream);
    }

    public Chatter(String s, Socket socket1, DataInputStream datainputstream, DataOutputStream dataoutputstream)
    {
        name = s;
        socket = socket1;
        dis = datainputstream;
        dos = dataoutputstream;
    }

    private String name;
    private Socket socket;
    private DataInputStream dis;
    private DataOutputStream dos;
}

