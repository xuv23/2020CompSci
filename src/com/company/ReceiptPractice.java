package com.company;

public class ReceiptPractice {
    public static void main (String[] args){
        int subtotal= 38+40+30;
        double tax = subtotal * .08;
        double tip = subtotal * .15;
        double total = subtotal + tax + tip;

        System.out.println("Subtotal:");
        System.out.println (subtotal);
        System.out.println("Tax:");
        System.out.println(tax);
        System.out.println("Tip:");
        System.out.println(tip);
        System.out.println("Total:");
        System.out.println(total);
    }
}
