// Valerie Xu
// Create main function
//      import scanner
//      print a line that says "Please type number between 1 and 137: "
//      create an integer called "n" and initialize it so that it is equaled to the next input value
//      if n is less than 1 or greater than 137 (n<1 || n>137)
//              then print a line that says "Please run again and type in number between 1 and 137"
//      else if n divided by 2 has a remainder that is not 0 (basically if n is between 1 and 137 and is odd)
//              then print a line that says "Weird"
//      else (basically if n is between 1 and 137 and is even)
//              if n is greater and equal to 2 but less than and equal to 5
//                      then print a line that says "Not Weird"
//              if n is greater and equal to 6 but less than and equal to 20
//                      then print a line that says "Weird"
//              if n is greater than 20
//                      then print a line that says "Not Weird"

package com.company;
import java.util.*;
public class ConditionalStatementsChallenge {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Please type number between 1 and 137: ");
        int n= input.nextInt();

        if (n<1 || n>137){
            System.out.print ("Please run again and type in number between 1 and 137");
        }else if (n%2!=0){
            System.out.print("Weird");
        }else{
            if(n>=2 && n<=5){
                System.out.print("Not Weird");
            }else if(n>=6 && n<=20){
                System.out.print("Weird");
            }else{
                System.out.print("Not Weird");
            }
        }
    }
}
