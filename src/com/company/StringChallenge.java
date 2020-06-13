package com.company;
import java.util.*;
public class StringChallenge {
    public static void main(String[] args) {
        System.out.print("Type phrase here: ");
        Scanner input = new Scanner(System.in);
        String phrase = input.nextLine();
        letters(phrase);
        System.out.println();

    }

    public static void letters(String phrase) {
        ;
        String firstword = phrase.substring(0, phrase.indexOf(" "));
        int count = 0;
        while(firstword.length()>0) {
            char letters = firstword.charAt(0);
            int pos= phrase.indexOf(letters,0);
            while (pos >= 0) {
                count++;
                pos= phrase.indexOf(letters,pos+1);
            }
            System.out.println(letters+" "+count);
            count=0;
            firstword=firstword.replaceAll(letters+"","");
        }
    }
}
