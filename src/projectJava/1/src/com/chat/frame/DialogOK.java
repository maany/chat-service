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

public class DialogOK extends Frame
    implements ActionListener
{

    public void actionPerformed(ActionEvent actionevent)
    {
        parent.setEnabled(true);
        dispose();
    }

    public DialogOK(Client client, String s, String s1)
    {
        super(s);
        parent = client;
        lblChatterExits = new Label(s1, 1);
        btnOk = new Button("Ok");
        btnOk.addActionListener(this);
        pnlBottom = new Panel(new GridLayout(1, 3));
        pnlBottom.add(new Label(""));
        pnlBottom.add(btnOk);
        pnlBottom.add(new Label(""));
        add(lblChatterExits, "Center");
        add(pnlBottom, "South");
        setResizable(false);
        parent.setEnabled(false);
        addWindowListener(new _cls1());
    }

    private Button btnOk;
    private Label lblChatterExits;
    private Panel pnlBottom;
    private Client parent;


    private class _cls1 extends WindowAdapter
    {

        public final void windowClosing(WindowEvent windowevent)
        {
            parent.setEnabled(true);
            dispose();
        }

        private final void constructor$0(DialogOK dialogok)
        {
        }

        _cls1()
        {
            constructor$0(DialogOK.this);
        }
    }

}

