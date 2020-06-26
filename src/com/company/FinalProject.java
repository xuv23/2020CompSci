package com.company;
//import scanner
//create a method "Welcome" for a welcome screen with welcome message and  instructions
//create a main method
//      declare an integer that shows the user's score and initialize it to 0
//      declare an integer that shows the number of rounds the user played and initialize it to 0
//      create an array "scoreRound" of size 2  that shows the round count and score of the user
//      ask the user whether they want to play
//      while the user says yes to play the game
//              print a statement asking the user whether they want to guess a food or number
//              if the user wants to guess a food
//                      ask user to enter a food
//                      declare a string variable called answer and initialize it to the next input value
//                      call "reader" method
//                      print out the score and round number
//                      ask if the user wants to play again
//              end if statement
//              if the user wants to guess a number
//                      ask user to enter a number between 1 and 50 inclusive
//                      declare a string variable called answer2 and initialize it to the next input value
//                      while the number is not between 1-50 inclusive
//                              ask user to re-enter a number between 1 and 50 inclusive
//                              set "number" to input number
//                      end while loop
//                      call "reader" method
//                      ask if the user wants to play again
//              end if statement
//              else
//                      Tell the user to choose either a word or a number
//                      sk if the user wants to play again
//              end else statement
//      end while loop
//      call "close" method
//create a method called "reader"
//      create file reader
//      create scanner to read file
//      while the file is not finished
//          if token (the next string) equals the answer the user inputs
//              print out that the user guessed correctly
//              Increase the score and round count by 1 respectively
//              return the score and round count to main function
//          end if statement
//      end while loop
//      print out that the user guessed incorrectly
//      increase rounds count by 1
//      then return score and round count
// end method "reader"
//create a method called "close" which basically thanks the user for playing the game and displays the final round and score count
import java.util.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FinalProject {

    public static String input_file_name = "c:/temp/info.txt";// the file

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Welcome();
        System.out.print("Do you want to play (Y or N): ");
        String play = input.next();
        int score = 0;// initialize score
        int roundNum = 0;// initialize round#
        int[] scoreRound = {score, roundNum};
        while (play.toUpperCase().equals("Y")) {
            System.out.print("Do you want to guess a type of food (F) or a number (N):");
            String wordType = input.next();
            if (wordType.toUpperCase().equals("F")) {// user input equals f (K insensitive)
                System.out.print("Type a food you want to guess:");
                String answer = input.next();
                scoreRound = Reader(answer, scoreRound);// call return method to set score and round number
                System.out.println("Score: " + scoreRound[0] + "\nRounds: " + scoreRound[1]);
                System.out.print("Do you want to play again(Y or N): ");
                play = input.next();
            } else if (wordType.toUpperCase().equals("N")) {
                System.out.print("Type a number between 1-50 inclusive that you want to guess (both decimals and integers work): ");
                String answer2 = input.next();
                double num = Double.parseDouble(answer2);// converts String to Double
                while (num < 1 || num > 50) {// if number not btw 1-50
                    System.out.println("You can only guess numbers between 1-50 inclusive (both decimals and integers work)");
                    System.out.print("Guess another number here: ");
                    answer2 = input.next();
                    num = Double.parseDouble(answer2);
                }
                scoreRound = Reader(answer2, scoreRound);// call return function to set score and round number
                System.out.println("Score: " + scoreRound[0] + "\nRounds: " + scoreRound[1]);
                System.out.print("Do you want to play again(Y or N): ");// ask user if they want to play again
                play = input.next();
            } else {
                System.out.println("You can only choose between a number and a food");
                System.out.print("Do you want to play (Y or N): ");
                play = input.next();
            }
        }
        Close(scoreRound);
    }

    public static int[] Reader(String answer, int[] scoreRound) throws IOException {
        FileReader readF = new FileReader(input_file_name);
        Scanner myScanner = new Scanner(readF);
        int [] initial= scoreRound;
        while (myScanner.hasNext()) {// file not finished
            String token = myScanner.next();
            if (token.toUpperCase().equals(answer.toUpperCase())) {// if next token equals input value (K insensitive)
                scoreRound[0] = scoreRound[0] + 1;// add 1 point
                scoreRound[1] = scoreRound[1] + 1;// add 1 to round count
                System.out.println("Guess is correct!");
                return scoreRound;
            }
        }
        System.out.println("Guess is incorrect!");// if input value not found in file
        scoreRound[1] = scoreRound[1] + 1;
        return scoreRound;
    }

    public static void Welcome() {// welcome sign with instructions
        System.out.println("*----------------------------------------*");
        System.out.println("|                                        |");
        System.out.println("|      Welcome to our guessing game!     |");
        System.out.println("|                                        |");
        System.out.println("*-------------Instructions---------------*");
        System.out.println("|Try to guess as many types of food and  |");
        System.out.println("|numbers (decimals or integers) between  |");
        System.out.println("|1-50 as possible.                       |");
        System.out.println("|Everytime you get a word or number right|");
        System.out.println("|you get 1 point.                        |");
        System.out.println("|You can play as many times as you want  |");
        System.out.println("*----------------------------------------*");
    }
    public static void Close(int scoreRound[]){// closing sign with displayed final score and round count
        String space=" ";
        System.out.println("*----------------------------------------*");
        System.out.println("| Thanks for playing                     |");
        System.out.printf("|Final Score #:%2d%4s                    |\n", scoreRound[0], space);
        System.out.printf("|Final Round #:%2d%4s                    |\n", scoreRound[1],space);
        System.out.println("|Bye!                                    |");
        System.out.println("*----------------------------------------*");
    }
}
