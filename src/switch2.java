import java.util.Scanner;

public class ass3 {
    public static void main(String[] args) {

        Scanner student=new Scanner(System.in);
        System.out.println("Enter username:");//prompt user to enter name
        String name=student.next();
        String Name="Mary@usiu.ac.ke";


      switch (Name) {
            case "Mary@usiu.ac.ke":
                System.out.println("Please Enter password:");
                String password = student.next();
                switch (password) {
                    case "anwambua":
                        System.out.println("Welcome Mary");
                        break;

                    default:
                        System.out.println("Wrong username and password");
                }
                break;

        }
                }
            }


