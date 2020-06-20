package com.company;
// Valerie Xu
// Create main function
//      Import Scanner
//      Create a string array called stringArray that has a size of 10.
//      Print a line that says "Input number of Strings btw 1 and 10: "
//      Create a integer called "T" and initialize it so that it is equaled to the next input value
//      for every integer i which starts at 0, is less than "T", and increases at an increment of 1
//              print a line that says "Type input string #i"
//              initialize "stringArray[i] to the next input value
//      end for loop
//      for every integer i which starts at 0, is less than "T", and increases at an increment of 1
//              declare a string called "finalAnswer" and initialize it to return value of function "evenOdd" with input "stringArray[i]
//              print string "finalAnswer"
//      end for loop
// end "main" function
//
// Create a function "evenOdd" with one input String type parameter: "str"
//      declare a string variable called "even"
//      declare a string variable called "odd"
//      for every integer i from 0 to the length of "str", increasing at an increment of 2
//          Set string "even" to string "even" + the character at position i on string "str"
//      end for loop
//      for every integer i from 1 to the length of "str", increasing at an increment of 2
//          set string "odd" to string "odd" + the character at position i on string "str"
//      end for loop
//      declare a string called "answer" which equals "even"+" "+"odd"
//      return string "answer"
//end "evenOdd" function
import java.util.*;
public class StringChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringArray= new String[10];
        System.out.print("Print the number of strings you want to print btw 1 and 10: ");
        int T= input.nextInt();
        input.nextLine();
        for(int i=0; i<T; i++){
                System.out.print("Type input string #"+(i+1)+":");
                stringArray[i]= input.nextLine();
        }

        for(int i=0; i<T; i++){
            String finalAnswer=evenOdd(stringArray[i]);
            System.out.println(finalAnswer);
        }

    }
    public static String evenOdd (String str) {
        String evens= "";
        String odds= "";
            for (int i = 0; i < str.length(); i+=2) {
            evens= evens+str.charAt(i);
        }
            for (int i = 1; i < str.length(); i+=2) {
            odds= odds+str.charAt(i);
        }
        String answer= evens+" "+ odds;
        return answer;
    }
}