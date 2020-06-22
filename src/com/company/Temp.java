package com.company;
/* Emma Nguyen, Lily Thieberg, Valerie Xu
Pseudocode:
Import java util
start main function
    declare an integer variable "days"
    print a line that says "How many days' temperature?:"
    initialize "days" to next input value
    declare an array "temp" of size "days"
    declare an integer variable called "sum" and initialize it to 0
    import random object called "randy"
    begin for loop on integer "index", which starts at 0 and increases at an increment of 1 all the way to the integer "days"-1
            set array "temp" at integer "index" equal to a random integer between 25- 110 inclusive
            print  "(index + 1)"-th Day's high temperature: "temp[index]"
            add "temp[index]" to "sum"
    end for loop
    declare a double called "average" and initialize it to "sum" divided by "days"
    declare an integer called "count" and initialize it to 0
    begin for loop on integer "i", which starts at 0 and increases at an increment of 1 all the way to the integer "days"-1
            if "temp" at "(i+1)"-th day is greater than "average"
                    then increase "count" by 1
            end if statement
    end for loop
    Print double "average" with one decimal point
    Print integer "count", which shows the number of days "temp" is larger than "average"
end main function
 */

import java.util.*;
    public class Temp {
        public static void main (String[] main){

            //declare variable
            Scanner console = new Scanner(System.in);
            System.out.println("How many days' temperature?:");
            int days = console.nextInt();

            // making array
            int [] temp = new int[days];
            int sum = 0;
            //add random
            Random randy = new Random();

            //for loop
            for (int index = 0; index < days; index++) {
                temp[index] = randy.nextInt(86) + 25;
                System.out.println("Day " + (index + 1) + "'s high temperature: " + temp[index]);
                //equation: name.nextInt(size of range) + min, where (size of range) is (max - min + 1)

                //getting sum
                sum += temp[index];
            }
            //getting average
            double average = (double) sum/days;

            //finding out how many days are above average
            int count = 0;
            for (int i=0; i<days; i++){
                if (temp[i]>average){
                    count++;
                }
            }
            //prints out the lines we need.
            System.out.printf("The average temperature = %.1f\n", average);
            System.out.println("There were "+ count +" days above average.");
        }
    }