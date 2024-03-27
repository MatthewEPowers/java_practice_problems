package com.conversions;

import java.util.Scanner;
public class mi_to_km {

    //import java.util.Scanner;
    public static void main(String[] args) {

        float diffMiToKm = 1.609344f;

        float mi = 10;
        float km = 1;

        Scanner myObj = new Scanner(System.in);
        int convert;

        System.out.println("Enter 1 to convert mi to km or 2 to convert km to mi");
        convert = myObj.nextInt();
        System.out.println("You Entered " + convert);


        if(convert == 1){
            System.out.println( mi +" Mile is = " + mi * diffMiToKm + " Km");
        } else if (convert == 2) {
            System.out.println(km + " Km is = " + km / diffMiToKm + " mi");
        }
        else {
            System.out.println("Incorrect input");
            System.out.println("Terminating program");
        }


    }
}
