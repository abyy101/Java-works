import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JOptionPane.showMessageDialog;


public class Click implements ActionListener
{

    public void actionPerformed(ActionEvent event)
    {
        showMessageDialog(Newgui.frame,"This button has been clicked");
//another class
    }
}
