package com.company;

public class ComplexFigureAssignment {
    public static void main(String[] args){
        Top();
        Bottom();
    }
    public static void Line () {
        System.out.print("#");
        for (int i = 0; i < 16; i++)
            System.out.print("=");
        System.out.println("#");
    }
    public static void Row1 (){
        System.out.print("|");
        for (int i=0; i<6;i++)
            System.out.print(" ");
        System.out.print("<><>");
        for (int i=0; i<6;i++)
            System.out.print(" ");
        System.out.println("|");
    }
    public static void Row2 () {
        System.out.print("|");
        for (int i = 0; i < 4; i++)
            System.out.print(" ");
        System.out.print("<>");
        for (int j = 0; j < 4; j++)
            System.out.print(".");
        System.out.print("<>");
        for (int j = 0; j < 4; j++)
            System.out.print(" ");
        System.out.println("|");
    }
    public static void Row3 () {
        System.out.print("|");
        for (int i = 0; i < 2; i++)
            System.out.print(" ");
        System.out.print("<>");
        for (int j = 0; j < 8; j++)
            System.out.print(".");
        System.out.print("<>");
        for (int j = 0; j < 2; j++)
            System.out.print(" ");
        System.out.println("|");
    }
    public static void Row4 () {
        System.out.print("|");
        System.out.print("<>");
        for (int j = 0; j < 12; j++)
            System.out.print(".");
        System.out.print("<>");
        System.out.println("|");
    }
    public static void  Top(){
        Line();
        Row1();
        Row2();
        Row3();
        Row4();
    }
    public static void Bottom(){
        Row4();
        Row3();
        Row2();
        Row1();
        Line();
    }
}
