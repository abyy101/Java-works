import java.util.Scanner;

public class example{
    public static void birthday() {
        String name="Abigael";
        int age=20;
        System.out.println("My name is"+name+age);
        Scanner scanner=new Scanner(System.in);
        int Ra=scanner.nextInt();
        if(Ra==20){
            System.out.println("Try again");
        }
    }
}