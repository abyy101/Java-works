import java.util.Random;
import java.util.Scanner;

public class guessgame {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println("Enter your guess(1-100)");
        //ACCEPTING THEIR INPUT
        Scanner scanner = new Scanner(System.in);
        //STORE IN A VARIABLE
        while (true) {
            int playerguess = scanner.nextInt();//input is put here
            //to check
            if (playerguess == randomNumber) {
                System.out.println("Correct you win!");
                break;
            } else if (randomNumber > playerguess) {
                System.out.println("Number is higher, try again");
            } else {
                System.out.println("Number is less, try again");
            }
        }
    }
    }
