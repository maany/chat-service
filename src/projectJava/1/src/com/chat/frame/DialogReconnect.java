/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Project Java.1.src.com.chat.frame;

/**
 *
 * @author Sudipta Bera
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// Referenced classes of package sukhwinder.chat:
//            Client

public class DialogReconnect extends Frame
    implements ActionListener
{

    public void actionPerformed(ActionEvent actionevent)
    {
        if(actionevent.getActionCommand().equalsIgnoreCase("ok"))
        {
            parent.setAutoConnect(true);
            dispose();
        } else
        if(actionevent.getActionCommand().equalsIgnoreCase("cancel"))
        {
            parent.setAutoConnect(false);
            dispose();
        }
    }

    public DialogReconnect(Client client, String s, String s1)
    {
        super(s);
        parent = client;
        lblReconnect = new Label(s1);
        btnOk = new Button("Ok");
        btnOk.addActionListener(this);
        btnCancel = new Button("Cancel");
        btnCancel.addActionListener(this);
        pnlCenter = new Panel(new GridLayout());
        pnlCenter.add(btnOk);
        pnlCenter.add(btnCancel);
        add(lblReconnect, "North");
        add(pnlCenter, "Center");
        setResizable(false);
        addWindowListener(new _cls1());
    }

    private Button btnOk;
    private Button btnCancel;
    private Label lblReconnect;
    private Panel pnlCenter;
    private Client parent;

    private class _cls1 extends WindowAdapter
    {

        public final void windowClosing(WindowEvent windowevent)
        {
            dispose();
        }

        private final void constructor$0(DialogReconnect dialogreconnect)
        {
        }

        _cls1()
        {
            constructor$0(DialogReconnect.this);
        }
    }

}

