package com.company;

public class EvenOdd {
    public static void main(String[] args) {
        Even();
        System.out.println();
        Odd();
    }

    public static void Even() {
        for (int even = 0; even <= 100; even += 2) {
            System.out.print(even + " ");
        }
    }

    public static void Odd() {
        for (int odd = 1; odd <= 100; odd += 2) {
            System.out.print(odd + " ");
        }
    }
}
