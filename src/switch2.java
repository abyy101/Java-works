import java.util.Scanner;

//using switch and scanner to validate username and password
public class switch2 {
    public static void main(String[] args) {

        Scanner student = new Scanner(System.in);//accept user input.
        System.out.println("Enter username:");//prompt user to enter name
        String name = student.next();//stores input string to String Name

        String teacher = student.nextLine();


        switch (name) {//condition for input entered as the username
            case "Mary@usiu.ac.ke"://when username is given as Mary@usiu.ac.ke,
                System.out.println("Please Enter password:");//system will ask user to put in password
                String password = student.next();//stores input password in String password
                switch (password) {//condition for password entered

                    case "anwambua" ->//when password is given as anwambua,
                            System.out.println("Welcome Mary");//it prints welcome Mary

                    default ->//when password is not anwambua,
                            System.out.println("Wrong password");//it prints wrong password
                }
                break;
            case "AbigaelWambui"://when username is given as AbigaelWambui
                System.out.println("Welcome Abigael Wambui,please proceed");//prints out Welcome message
                System.out.println("Enter coursename:");//promts user to insert course name
                String course = student.next();//receive input in String course
                switch (course) {
                    case "CMS001" -> System.out.println("Community service class is occupied, choose another course");//when course chosen is CMS001
                    case "APT1020" -> System.out.println("Course is available");//when course input is APT1020
                    default -> System.out.println("Course is not available");//any other input apart from the two above
                }
                break;

            default://when the username is not Mary@usiu.ac.ke or AbigaelWambui
                System.out.println("Wrong username");
        }
        }
    }



