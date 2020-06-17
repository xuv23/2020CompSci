//Valerie Xu
// Create main function
//      Input scanner
//      print a line that says "meal cost:"
//      create a double variable and initialize it so that it equals the next imputed value
//      print line that says "tip percent:"
//      create a double variable called "tipPercent" and initialize it so that it equals the next imputed value
//      create a double variable called "tip" and initialize it so that it equals to "tipPercent/100*mealCost"- this basically tells you the value of the tip
//      print line that says "tax percent:"
//      create a double variable called "taxPercent" and initialize it so that it equals the next imputed value
//      create a double variable called "tax" and initialize it so that it equals to "taxPercent/100*mealCost"- this basically tells you the value of the tax
//      create an integer called "totalCost" and initialize it to "(int)Math.round(mealCost+tip+tax)"- which basically is the tip, tax, and meal cost added together, rounded to a whole number, and converted into an integer(gives you total cost of meal including tax and tip)
//      print a line that says "totalCost"
package com.company;
import java.util.*;
public class MealChallenge {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("meal cost:");
        Double mealCost= input.nextDouble();

        System.out.println("tip percent:");
        Double tipPercent= input.nextDouble();
        double tip= tipPercent*mealCost/100;

        System.out.println("tax percent:");
        Double taxPercent= input.nextDouble();
        double tax= (taxPercent/100)*mealCost;

        int totalCost= (int)Math.round(mealCost+tip+tax);
        System.out.print(totalCost);

    }
}
