package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args)  throws IOException {
	// write your code here
        {
            System.out.print("Enter Your Name:");
            BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
            String name= reader.readLine();

            for(int i=1;i<=10;i++){
                System.out.print(i+" ");
            }
            System.out.println("");

            int j=0;
            while (j<3) {
                System.out.println("Greenhill is aweso=ome:" + j);
                if(j<2) {
                    System.out.println("little j");
                }else{
                    System.out.println("large j");
                }

                j++; // j=j+1
            }
        }
    }
}
