import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
public class Newgui
{
static JFrame frame;
    public static void main(String[] args)
    {
        frame = new JFrame();
        JPanel panel = new JPanel();

        JButton button1 = new JButton("Click here");
        panel.add(button1);
        JButton button2 = new JButton("Click here");
        panel.add(button2);
        frame.add(panel);

        ActionListener listener1 = new Click();
        button1.addActionListener(listener1);
        ActionListener listener2 = new Click();
        button2.addActionListener(listener2);


        panel.setBackground(new Color(128, 212, 255));
        frame.getContentPane().setBackground(Color.GRAY);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
            }
}