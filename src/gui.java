import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class gui {
    public static void main(String[] args) {
        JFrame frame=new JFrame("GUI project");
        JLabel label=new JLabel("Simple GUI project");
        JButton button=new JButton("Click here");

        JButton press=new JButton("Press here");//new button


        label.setBackground(new Color(128, 212, 255));
        label.setOpaque(true);
        frame.getContentPane().setBackground(Color.GRAY);

        press.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button is clicked");
                label.setForeground(Color.orange);
                                    }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked");
                label.setForeground(Color.CYAN);
            }

        });


        frame.add(label);
        frame.add(press);
        frame.add(button);


        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        label.setSize(40,30);

    }
}
