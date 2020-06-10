//Valerie Xu
package com.company;
import java.util.*;
public class GanstaNameChallenge {
    public static void main(String[] args){
        System.out.println("Type your name, playa: ");
        Scanner input= new Scanner(System.in);
        String name= input.nextLine();
        int spacepos= name.indexOf(" ");
        String first= name.substring(0,spacepos);
        String last= name.substring(spacepos+1, name.length());
//        String []names= name.split(" ");
//        String first= names[0];
//        String last= names[1]; (different way to do it)
        String lastUpper= last.toUpperCase();
        char initial1 = name.charAt(0);
        System.out.print("Your gangsta name is \""+ initial1+".Diddy "+lastUpper+" "+ first+"-izzle\"");
    }
}

