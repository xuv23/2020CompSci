//Valerie Xu
// Create main function
//      Input scanner
//      print a line that says "meal cost:"
//      create a double variable and initialize it so that it equals the next imputed value
//      print line that says "tip percent:"
//      create a integer variable called "tipPercent" and initialize it so that it equals the next imputed value
//      print line that says "tax percent:"
//      create a integer variable called "taxPercent" and initialize it so that it equals the next imputed value
//      call function "solve"
//      end main function
//Create a function called "solve" and insert variables "mealCost", "tipPercent", and "taxPercent" into it
//      begin function solve
//              create a double variable called "tip" and initialize it so that it equals to "tipPercent/100*mealCost"- this basically tells you the value of the tip
//              create a double variable called "tax" and initialize it so that it equals to "taxPercent/100*mealCost"- this basically tells you the value of the tax
//              create an integer called "totalCost" and initialize it to "(int)Math.round(mealCost+tip+tax)"- which basically is the tip, tax, and meal cost added together, and rounded to the nearest integer(gives you total cost of meal including tax and tip)
//              print a line that says "totalCost"
//      end function
package com.company;
import java.util.*;
public class MealChallenge {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("meal cost:");// value of the meal
        Double mealCost= input.nextDouble();

        System.out.println("tip percent:");
        int tipPercent= input.nextInt();

        System.out.println("tax percent:");
        int taxPercent= input.nextInt();

        solve(mealCost, tipPercent, taxPercent);

    }
    public static void solve(double mealCost, int tipPercent, int taxPercent){
        double tip= tipPercent*mealCost/100;// value of the tip
        double tax= taxPercent*mealCost/100;// value of tax
        int totalCost= (int)Math.round(mealCost+tip+tax);// gives total cost and rounds it to an integer value
        System.out.print("Total Cost: "+totalCost);

    }
}

