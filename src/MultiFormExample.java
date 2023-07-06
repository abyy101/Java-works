import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiFormExample extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField agenameField;
    private JTextField yearnammeField;
    private JTextField occupationField;

    private JTextField emailnameField;

   // private JButton validateButton;
    private JButton clearButton;
    private JButton validateButton;
    private static final String regex="^(.+)@(.+)$";




    public MultiFormExample() {
        // Set up the frame
        setTitle("Multi-Form Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Create the first name label and text field
        JLabel firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();
        panel.add(firstNameLabel);
        panel.add(firstNameField);

        //creating an age field and label
        JLabel agenameLabel=new JLabel("age");
        agenameField=new JTextField();
        panel.add(agenameLabel);
        panel.add(agenameField);

        //creating an year name field and label
        JLabel yearnameLabel=new JLabel("Year date");
        yearnammeField=new JTextField();
        panel.add(yearnameLabel);
        panel.add(yearnammeField);

        //creating an occupation field and label
        JLabel occupationLabel=new JLabel("Occupation title");
        occupationField=new JTextField();
        panel.add(occupationLabel);
        panel.add(occupationField);

        // Create the last name label and text field
        JLabel lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();
        panel.add(lastNameLabel);
        panel.add(lastNameField);

        //create an email label and field
        JLabel emailnameLabel=new JLabel("Enter your email");
        emailnameField=new JTextField();
        panel.add(emailnameLabel);
        panel.add(emailnameField);


        // Create the submit button
        //submitButton = new JButton("Submit");
       // submitButton.addActionListener(new SubmitButtonListener());
       // panel.add(submitButton);

        // Create the clear button
        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ClearButtonListener());
        panel.add(clearButton);

        //create a validate button
        validateButton=new JButton("validate");
        validateButton.addActionListener(new validateButtonListener());
        panel.add(validateButton);

        // Add the panel to the frame
        add(panel);
    }

   // public abstract class SubmitButtonListener implements ActionListener {
          //  public void actionPerformed(ActionEvent e) {
               // String firstName = firstNameField.getText();
             //   String lastName = lastNameField.getText();
             //   String yearName = yearnammeField.getText();
             //   String occupationname = occupationField.getText();
           //     String ageName = agenameField.getText();
             //   String email=emailnameField.getText();

       //     }
       // }
  //  }


    public class ClearButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            firstNameField.setText(" ");
            lastNameField.setText(" ");
        }
    }
    public class validateButtonListener implements ActionListener {

        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String yearName = yearnammeField.getText();
        String occupationname = occupationField.getText();




        Pattern pattern = Pattern.compile(regex);

        @Override
        public void actionPerformed(ActionEvent e) {
            String email = emailnameField.getText();

            if(!firstName.equals("") || !lastName.equals("") ||!yearName.equals("") || !occupationname.equals("") || !email.equals("")){

                Matcher matcher = pattern.matcher(email);
                if (pattern.matcher(email).matches()) {
                    JOptionPane.showMessageDialog(null, "valid Email");
                    JOptionPane.showMessageDialog(null, "validation successful");

                } else {
                    JOptionPane.showMessageDialog(null, "invalid email");
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "enter missing spaces");

            }

        }
    }



    public static void main(String[] args) {
        // Create and display the form
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MultiFormExample().setVisible(true);
            }
        });
    }
}