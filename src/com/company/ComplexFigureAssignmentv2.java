//Valerie Xu
package com.company;
public class ComplexFigureAssignmentv2 {
public static final int SIZE=3; // Declaring a global constant
    public static void main(String[] args) {
        Line();
        Top();
        Bottom();
        Line();
    }

    public static void Line() {
        System.out.print("#");
        for (int i = 0; i < 4*SIZE; i++)
            System.out.print("=");
        System.out.println("#");
    }

    public static void Top() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 0; space <= 2*SIZE-2*line-1; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 0; dot <4*(line-1); dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 0; space < 2*SIZE-2*line; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void Bottom() {
        for (int line = 1; line < SIZE+1; line++) {
            System.out.print("|");
            for (int space = 0; space <= 2*(line-1)-1; space++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int dot = 0; dot < (4 * SIZE) -(4*line); dot++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space = 0; space <= 2 * (line-1)-1; space++) {
                System.out.print(" ");
            }
            System.out.println("|");
            }
        }
    }




