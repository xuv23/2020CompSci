//Bridget Hill and Valerie Xu
// import java.util.*
//create random object
//declare my int variable for the size
//declare my array of int type
//use randomObject.nextInt for it
//for loop with the size
//      create each element randomObject.nextInt
//end for loop
//create 2 random integer variables called a and b
// Do a while loop for when a and b are the same
//      set another random number to a
//end while loop
//call your swap (array, i1, i2)
//p s int[] swap(int [] name, int1, int2) {
//return swapped array
// print swapped array
package com.company;
import java.util.*;
public class SwitchChallenge {
    public static void main(String[] args){
        Random randy = new Random();
        int size = randy.nextInt(5) + 5;
        int[] number = new int[size];
        for (int j = 0; j < size; j++) {
            number[j] = randy.nextInt(100);
        }
        System.out.println("Original Array \n"+Arrays.toString(number));
        int a= randy.nextInt(number.length);
        int b= randy.nextInt(number.length);
        while (a == b) {
            a= randy.nextInt(number.length);
        }

        int[] number2 = swap(number, a, b);
        System.out.println("\nSwapped Array between "+ (a+1)+"th # and "+(b+1)+"th # \n"+Arrays.toString(number2));
    }

    public static int[] swap (int [] num, int j,int i) {
        int temp= num[j];
        num[j]= num[i];
        num[i]= temp;
        return num;
    }
}
