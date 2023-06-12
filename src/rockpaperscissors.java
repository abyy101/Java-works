import java.util.Random;
import java.util.Scanner;

public class rockpaperscissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//accept input
        String playerMove;

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];//give a random letter from the array.


            while (true) {//to prevent incorrect input


                System.out.println("Please enter your move");
                playerMove = scanner.nextLine();//get input from user

                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println("Enter valid move");
            }
            System.out.println("Computer played" + " " + computerMove);

            if (computerMove.equals(playerMove)) {
                System.out.println("It is a tie");
            } else if (playerMove.equals("r")) {

                if (computerMove.equals("p")) {
                    System.out.println("You loose");
                } else if (computerMove.equals("s")) {
                    System.out.println("You have won");
                }

            } else if (playerMove.equals("p")) {

                if (computerMove.equals("s")) {
                    System.out.println("You loose");
                } else if (computerMove.equals("r")) {
                    System.out.println("You have won");
                }

            } else if (playerMove.equals("s")) {

                if (computerMove.equals("r")) {
                    System.out.println("You loose");
                } else if (computerMove.equals("p")) {
                    System.out.println("You have won");
                }

            }

            System.out.println("Play again?/n Y/N");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("Y")) {
                break;
            }
            scanner.close();

        }
    }

        }



