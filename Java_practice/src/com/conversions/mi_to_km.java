package com.conversions;

import java.util.Scanner;
import java.text.DecimalFormat;
public class mi_to_km {

    private static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {

        boolean operatinoIsActive = true;
        boolean continueOperation;
        boolean inOperation;

        Scanner chooseConversion = new Scanner(System.in);
        String conversion;

        Scanner userContinues = new Scanner(System.in);
        String userCon;

        /*
            ------------ Run the conversion program -------------
        */
        while (operatinoIsActive){
            /*
            ------------ Check to see which conversion the user wants to make -------------
            */
            inOperation = true;
            while (inOperation){
                System.out.println("Choose to convert miles or kilometers");
                System.out.println("Enter mi/km: ");
                conversion = chooseConversion.next();
                switch (conversion){
                    case "mi":
                        Convert_mi_km();
                        inOperation = false;
                        break;
                    case "km":
                        Convert_km_mi();
                        inOperation = false;
                        break;
                    default:
                        System.out.println("Incorrect input, please try again");
                }
            }


            /*
                ------------ Check to see if the user wants to make another conversion -------------
            */
            continueOperation = true;
            while (continueOperation){
                System.out.println("Would you like to make another conversion? y/n");
                userCon = userContinues.next();
                switch (userCon){
                    case "y":
                        System.out.println("Great Lets make another conversion!");
                        continueOperation = false;
                        break;
                    case "n":
                        System.out.println("Thank you for using our converter!");
                        operatinoIsActive = false;
                        continueOperation = false;
                        break;
                    default:
                        System.out.println("Incorrect input, please try again");
                }

            }

        }
    }
    /*
        ------------ convert Miles to Kilometers -------------
    */
    static void Convert_mi_km(){

        double diffMiToKm = 1.609344f;
        Scanner mi = new Scanner(System.in);
        double numMi;



        System.out.println("Enter the number of miles you would like to convert to kilometers");
        numMi = mi.nextDouble();

        System.out.println(numMi + "mi is: " + df.format(numMi * diffMiToKm) + "km");

    }
    /*
        ------------ convert Kilometers to Miles -------------
    */
    static void Convert_km_mi(){

        double diffMiToKm = 1.609344;
        Scanner km = new Scanner(System.in);
        double numKm;

        System.out.println("Enter the number of kilometers you would like to convert to miles");
        numKm = km.nextDouble();

        System.out.println(numKm + "km is: " + df.format(numKm / diffMiToKm) + "mi");
    }
}
