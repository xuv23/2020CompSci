package com.company;
//        Valerie Xu
//        Create main function
//        Create integer called i and initialize it to 4
//        Create double called d and set it to 4.0
//        Create string called s which says “Greenhill”
//        Import Scanner
//        Print line that says “Enter an integer: “
//        Create integer called int1 that is equal to the next input value
//        Print line that says “Enter a double: “
//        Create integer called doub1 that is equal to the next input value
//        Print line that says “Enter a string: “
//        Create integer called str1 that is equal to the next input value
//        Create integer called sumInt which equals to i+int1
//        Create double called sumDoub which equals to d+doub1
//        Create string called sumStr which equals to s+str1
//        Use Printf to print “sumStr”,  “sumDoub”,  “sumInt” and format it so that “sumDoub” only has one decimal place and that after each variable is printed, it returns to a new line ("%d\n%.1f\n%s\n").
import java.util.*;
public class DataTypeChallenge {
    public static void main (String args[]){
        Scanner input= new Scanner (System.in);
        int i = 4;
        double d = 4.0;
        String s = "Greehill ";
        System.out.print("Enter an integer: ");
        Integer int1= input.nextInt();
        System.out.print("Enter an double: ");
        Double doub1= input.nextDouble();
        input.nextLine();
        System.out.print("Enter an string: ");
        String str1= input.nextLine();
        int sumInt= i+int1;
        double sumDoub= d+doub1;
        String sumStr= s+ str1;
        System.out.printf("%d\n%.1f\n%s\n",sumInt,sumDoub,sumStr);
    }

}
