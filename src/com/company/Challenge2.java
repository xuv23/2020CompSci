package com.company;
public class Challenge2 {
public static final int SIZE=5; // Declaring a global constant
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
        Bottom();
        Top();
        Line();
    }

    public static void Top() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 0; space <= SIZE-line; space++) {
                System.out.print(" ");
            }
            for (int slash = 0; slash <= line - 2; slash++) {
                System.out.print("/");
            }
            System.out.print("*");
            for (int bslash = 0; bslash <= line - 2; bslash++) {
                System.out.print("\\");
            }
            for (int space = 0; space <= SIZE-line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
            }
        }
    public static void Bottom() {
        for (int line = 1; line <= SIZE; line++) {
            System.out.print("|");
            for (int space = 0; space <= line-1; space++) {
                System.out.print(" ");
            }
            for (int slash = 0; slash <= SIZE-line-1; slash++) {
                System.out.print("\\");
            }
            System.out.print("*");
            for (int bslash = 0; bslash <= SIZE-line-1; bslash++) {
                System.out.print("/");
            }
            for (int space = 0; space <= line-1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Line(){
        System.out.print("+");
        for(int dash=0; dash<=SIZE*2; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
