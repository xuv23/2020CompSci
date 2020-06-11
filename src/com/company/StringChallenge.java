package com.company;
import java.util.*;
public class StringChallenge {
    public static void main(String[] args) {
        System.out.print("Type phrase here: ");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        letters(phrase);
        System.out.println();
//        System.out.print("Number of E's: ");
//        E(phrase);

    }

    public static void letters(String phrase) { ;
        String firstword = phrase.substring(0, phrase.indexOf(" "));
        char letters[]= new char[firstword.length()];
        for (int i = 0; i < firstword.length(); i++) {
            letters[i]=firstword.charAt(i);
            int count=0;
            for(int j=0; j<phrase.length();j++)
            if (letters[i] == phrase.charAt(j)) {
                count++;
            }
            System.out.println(letters[i]+" "+count);
        }
    }
}
