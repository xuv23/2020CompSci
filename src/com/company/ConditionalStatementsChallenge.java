// Valerie Xu
// Create main function
//      import scanner
//      Print a line that says "Do you want to play the game(Y or N): "
//      create a string called "play" and initialize it so that it is equaled to the next input value
//      While string "play" equals "Y"
//              then call function "playGame"
//              Print a line that says "Do you want to play the game(Y or N): "
//              initialize string "play" again to the next input value
//      end while loop
//      Print a line that says "Have a great day!"
//Create a function called "playGame"
//      print a line that says "Please type number between 1 and 137: "
//      create an integer called "n" and initialize it so that it is equaled to the next input value
//      if n is less than 1 or greater than 137 (n<1 || n>137)
//              then print a line that says "Please run again and type in number between 1 and 137"
//      else if n divided by 2 has a remainder that is not 0 (basically if n is between 1 and 137 and is odd)
//              then print a line that says "Weird"
//      else (basically if n is between 1 and 137 and is even)
//              if n is greater and equal to 2 but less than and equal to 5
//                      then print a line that says "Not Weird"
//              else if n is greater and equal to 6 but less than and equal to 20
//                      then print a line that says "Weird"
//              else (basically if n is greater than 20)
//                      then print a line that says "Not Weird"

package com.company;
import java.util.*;
public class ConditionalStatementsChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play the game(Y or N): ");
        String play = input.next();
        input.nextLine();
        while (play.toUpperCase().equals("Y")) {
            playGame(input);
            System.out.print("Do you want to play the game(Y or N): ");
            play = input.next();
        }

        System.out.println("Have a great day! bye!");
    }
    public static void playGame(Scanner input){
        System.out.println("Please type number between 1 and 137: ");
        int n = input.nextInt();
        if (n < 1 || n > 137) {
            System.out.println("Please run again and type in number between 1 and 137");
        } else if (n % 2 != 0) {
            System.out.println("Weird");
        } else {
            if (n >= 2 && n <= 5) {
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                System.out.println("Weird");
            } else {
                System.out.println("Not Weird");
            }
        }
    }
}
