/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project Java.1.src.com.chat.frame;

/**
 *
 * @author Sudipta Bera
 */
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextComponent;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

// Referenced classes of package sukhwinder.chat:
//            CanvasLogin, DialogOK, DialogReconnect

public class Client extends Applet
    implements Runnable
{
    public class EventProcessor
        implements ActionListener, KeyListener
    {

        public void actionPerformed(ActionEvent actionevent)
        {
            if(actionevent.getActionCommand().equalsIgnoreCase("Send"))
                sendMessage();
            else
            if(actionevent.getActionCommand().equalsIgnoreCase("Login"))
                login();
            else
            if(actionevent.getActionCommand().equalsIgnoreCase("Connect"))
                login();
            else
            if(actionevent.getActionCommand().equalsIgnoreCase("Logout"))
            {
                stopped = true;
                logout();
            }
        }

        public void keyTyped(KeyEvent keyevent)
        {
            if(keyevent.getSource() == txtLogin)
            {
                if(keyevent.getKeyChar() == KeyEvent.VK_ENTER)
                    login();
            } else
            if(keyevent.getSource() == txtMessageBox && keyevent.getKeyChar() == KeyEvent.VK_ENTER)
                sendMessage();
        }

        public void keyReleased(KeyEvent keyevent)
        {
        }

        public void keyPressed(KeyEvent keyevent)
        {
        }

        public EventProcessor()
        {
        }
    }


    public void init()
    {
        runIt = true;
        stopped = false;
        setBackground(new Color(255, 251, 249));        
        setLayout(new BorderLayout());
        setSize(300, 70);
        listener = new EventProcessor();
        pnlLoginCenter = new Panel(new BorderLayout());       
        pnlLoginBottom = new Panel(new FlowLayout());
        pnlLoginBottom.setBackground(Color.white);
       // canLogin = new CanvasLogin();
       // pnlLoginCenter.add(canLogin, "Center");
        lblNickName = new JLabel("User Name");
        txtLogin = new JTextField(20);
        txtLogin.addKeyListener(listener);
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(listener);
        pnlLoginBottom.add(lblNickName);
        pnlLoginBottom.add(txtLogin);
        pnlLoginBottom.add(btnLogin);
        pnlChatCenter = new Panel(new FlowLayout());
        pnlChatRight = new Panel(new BorderLayout());
        txtDisplay = new JTextArea("", 15, 50);
    // txtDisplay.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        //txtDisplay.setEditable(false);
       // txtDisplay.setCursor(null);
        txtDisplay.setBackground(Color.white);
        txtDisplay.setForeground(Color.blue);
        txtDisplay.setFont(new Font("Arial", 1, 13));
        lblChatters = new JLabel("Chatters");
        lblChatters.setFont(new Font("Arial", 1, 18));
        lblChatters.setForeground(Color.red);
        lstChatterList = new List(15);
        txtMessageBox = new JTextField(35);
        txtMessageBox.addKeyListener(listener);
        btnSend = new JButton("Send");
        btnSend.addActionListener(listener);
        btnConnect = new JButton("Connect");
        btnConnect.addActionListener(listener);
        btnConnect.setVisible(false);
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(listener);
        pnlChatCenter.add(txtDisplay);
        pnlChatBottom = new Panel(new FlowLayout(0, 31, 10));
        pnlChatBottom.add(txtMessageBox);
        pnlChatBottom.add(btnSend);
        pnlChatBottom.add(btnLogout);
        pnlChatBottom.add(btnConnect);
        pnlChatRight.add(lblChatters, "North");
        pnlChatRight.add(lstChatterList, "Center");
        pnlChatRight.add(new Label(" "), "East");
       // add(pnlLoginCenter, "Center");
        add(pnlLoginBottom, "Center");
        txtLogin.requestFocus();
        
    }

    public boolean connect()
    {
        try
        {
            String s = getParameter("server");
            if(s == null || s.equals(""))
                s = getCodeBase().getHost();
            int i;
            if(getParameter("port") == null || getParameter("port").equals(""))
                i = 5000;
            else
                try
                {
                    i = Integer.parseInt(getParameter("port"));
                }
                catch(NumberFormatException numberformatexception)
                {
                    System.out.println("Invalid port number trying default 5050");
                    i = 5000;
                }
            socket = new Socket(s, i);
            connected = true;
            System.out.println("Connected to: " + socket);
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
            showStatus("Connected...");
            return true;
        }
        catch(IOException ioexception)
        {
            connected = false;
        }
        if(!autoConnect)
        {
            dok = new DialogOK(this, "Error", "Unable to connect to server");
            dok.setSize(260, 90);
            dok.setLocation(300, 300);
            dok.setVisible(true);
        } else
        {
            showStatus("Could not connect");
        }
        return false;
    }

    public void sendMessage()
    {
        try
        {
            String s = txtMessageBox.getText();
            if(s != "" && !s.equals(""))
            {
                out.writeUTF(s);
                txtMessageBox.setText("");
            }
        }
        catch(IOException ioexception)
        {
            System.out.println("Error occurred: " + ioexception.getMessage());
        }
    }

    public void login()
    {
        Object obj = null;
        String s1 = txtLogin.getText();
        stopped = false;
        runIt = true;
        txtDisplay.setText("");
        txtMessageBox.setText("");
        if(s1 == null || s1.equals(""))
        {
            dok = new DialogOK(this, "Error", "Please specify a nick name");
            dok.setSize(260, 90);
            dok.setLocation(300, 300);
            dok.setVisible(true);
            return;
        }
        if(!connected)
            connect();
        if(connected && !loggedIn)
            try
            {
                out.writeUTF("Login:" + s1);
                String s = in.readUTF();
                if(s.equalsIgnoreCase("Login:0"))
                {
                    dok = new DialogOK(this, "Chatter Exists", "Name alredy taken please specify some other name.");
                    dok.setSize(260, 90);
                    dok.setLocation(300, 300);
                    dok.setVisible(true);
                } else
                if(s.equalsIgnoreCase("Login:1"))
                {
                    remove(pnlLoginCenter);
                    remove(pnlLoginBottom);
                    add(pnlChatCenter, "Center");
                    add(pnlChatRight, "East");
                    add(pnlChatBottom, "South");
                    btnSend.setEnabled(true);
                    btnConnect.setVisible(false);
                    txtMessageBox.setEnabled(true);
                    txtMessageBox.requestFocus();
                    validate();
                    loggedIn = true;
                    (new Thread(this)).start();
                     setSize(800, 400);
                }
            }
            catch(IOException ioexception)
            {
                System.out.println("Login Exception " + ioexception.getMessage());
                loggedIn = false;
                return;
            }
    }

    public void refreshChatterList(String s)
    {
        java.util.StringTokenizer stringtokenizer = new java.util.StringTokenizer(s, ":");
        lstChatterList.removeAll();
        for(; stringtokenizer.hasMoreTokens(); lstChatterList.add(stringtokenizer.nextToken()));
    }

    public void logout()
    {
        if(socket != null)
            try
            {
                socket.close();
            }
            catch(Exception exception)
            {
                System.out.println(exception.getMessage());
            }
        add(pnlLoginCenter, "Center");
        add(pnlLoginBottom, "South");
        remove(pnlChatCenter);
        remove(pnlChatRight);
        remove(pnlChatBottom);
        txtLogin.requestFocus();
        validate();
        loggedIn = false;
        connected = false;
        stopped = true;
        autoConnect = false;
        runIt = false;
    }

    public void setAutoConnect(boolean flag)
    {
        autoConnect = flag;
    }

    public boolean getAutoConnect()
    {
        return autoConnect;
    }

    public void stop()
    {
        try
        {
            runIt = false;
            stopped = true;
            if(socket != null)
                socket.close();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    public void run()
    {
        try
        {
            while(runIt)
            {
                String s = in.readUTF();
                int i;
                if((i = s.indexOf("ChatterList:")) != -1)
                {
                    s = s.substring(i + "ChatterList".length());
                    refreshChatterList(s);
                } else
                {
                    txtDisplay.append(s + "\n");
                }
            }
        }
        catch(IOException ioexception)
        {
            connected = false;
            loggedIn = false;
            if(!stopped)
            {
                setEnabled(false);
                DialogReconnect dialogreconnect = new DialogReconnect(this, "Disconnection detected", "Do you want to try to reconnect automatically?");
                dialogreconnect.requestFocus();
                dialogreconnect.setLocation(300, 300);
                dialogreconnect.setSize(260, 90);
                dialogreconnect.setVisible(true);
                btnSend.setEnabled(false);
                txtMessageBox.setEnabled(false);
                while(dialogreconnect.isVisible()) ;
                setEnabled(true);
                if(getAutoConnect())
                {
                    while(!loggedIn && runIt)
                    {
                        showStatus("Trying to re-connect");
                        login();
                        try
                        {
                            Thread.sleep(5000L);
                        }
                        catch(InterruptedException interruptedexception)
                        {
                            System.out.println("Thread Interrupted: " + interruptedexception.getMessage());
                        }
                    }
                } else
                {
                    btnConnect.setVisible(true);
                    validate();
                }
            }
        }
    }

    public Client()
    {
       // init();
        //this.setSize(700, 300);
    }

    private Panel pnlLoginBottom;
    private Panel pnlLoginCenter;
   // private CanvasLogin canLogin;
    private JLabel lblNickName;
    private JTextField txtLogin;
    private JButton btnLogin;
    private DialogOK dok;
    private JTextArea txtDisplay;
    private List lstChatterList;
    private JTextField txtMessageBox;
    private JButton btnSend;
    private JLabel lblChatters;
    private JButton btnConnect;
    private JButton btnLogout;
    private Panel pnlChatCenter;
    private Panel pnlChatBottom;
    private Panel pnlChatRight;
    private DataOutputStream out;
    private DataInputStream in;
    private Socket socket;
    private boolean connected;
    private boolean loggedIn;
    private boolean autoConnect;
    private volatile boolean runIt;
    private volatile boolean stopped;
    private EventProcessor listener;




/*
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client().setVisible(true);
            }
        });
    }
*/
}

