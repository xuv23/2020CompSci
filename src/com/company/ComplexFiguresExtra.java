package com.company;

public class ComplexFiguresExtra {
    public static void main(String[] args){
        Top();
        Bottom();
    }
    public static void Line () {
        System.out.print("#");
        display(16,'-');
        System.out.println("#");
    }
    public static void Row(int r) {
        System.out.print("|");
        display(6 - (2 * r), ' ');
        System.out.print("<>");
        display(4 * r, '.');
        System.out.print("<>");
        display(6 - (2 * r), ' ');
        System.out.println("|");
    }
    public static void  Top(){
        Line();
        for(int i=0; i<4;i++)
            Row(i);
    }
    public static void Bottom() {
        for(int i=3; i>=0;i--)
            Row(i);
        Line();
    }
    public static void display(int len, char ch) {
        for(int i=0;i<len;i++)
            System.out.print(ch);
    }
}
