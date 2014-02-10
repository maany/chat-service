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

public class Console extends Thread
{

    public void run()
    {
        while(true)
            try
            {
                String s;
                do
                    s = in.readLine();
                while(s == null || !s.equalsIgnoreCase("exit"));
                System.exit(0);
            }
            catch(IOException ioexception)
            {
                System.out.println(ioexception.getMessage());
            }
    }

    public Console()
    {
        in = new BufferedReader(new InputStreamReader(System.in));
        (new Thread(this)).start();
    }

    BufferedReader in;
}

