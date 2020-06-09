package com.company;

public class Challenge3 {
    public static final int SIZE = 5;
    public static final char letter = 65;
    public static void main(String[] args) {
        Top();
        Bottom();
    }

    public static void Top() {
        for (int line = 1; line <= SIZE; line++) {
            for (byte count = 0; count <= SIZE - line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();
        }
    }
    public static void Bottom() {
        for (int line = SIZE; line >= 1; line--) {
            for (byte count = 0; count <= SIZE - line; count++) {
                System.out.print((char) (letter + count) + " ");
            }
            System.out.println();
        }
    }
}