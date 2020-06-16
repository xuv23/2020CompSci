package com.company;
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
