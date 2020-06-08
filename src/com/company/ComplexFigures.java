//package com.company;
//
//public class ComplexFigures {
//
//    public static String[] mstr =
//                    {"<><>",
//                    "<>....<>",
//                    "<>........<>",
//                    "<>............<>",
//                    "<>................<>",
//                    "<>....................<>",
//                    "<>........................<>"};
//    public static void main (String[] args){
//        int size= 4;
//        showall(size);
//    }
//    public static void Top(int size) {
//        int i;
//        for (i = 0; i < size; i++) {
//            System.out.print("|");
//            int j;
//            for (j = 0; j < 2 * (size - 1 - i); j++)
//                System.out.print(" ");
//            System.out.print(ComplexFigures.mstr[i]);
//            for (j=0; j<2*(size-1-i);j++)
//                System.out.print(" ");
//            System.out.println("|");
//        }
//    }
//
//    public static void Bottom(int size) {
//        int i;
//        for (i = size - 1; i >= 0; i--) {
//            System.out.print("|");
//            int j;
//            for(j=0; j<2 * (size - 1 - i);j++)
//                System.out.print(" ");
//            System.out.print(ComplexFigures.mstr[i]);
//            for(j=0; j<2 * (size - 1 - i);j++)
//                System.out.print(" ");
//            System.out.println("|");
//        }
//    }
//
//    public static void showall(int size){
//            Top(size);
//            Bottom(size);

