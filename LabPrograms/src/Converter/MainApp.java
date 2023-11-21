package Converter;

import Converter.converter.DistanceConverter;
import Converter.converter.TimeConverter;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 1 for Distance converter OR Enter 2 for time converter");
        int choice1 = in.nextInt();
        switch(choice1){
            case 1:{
                System.out.println("Enter 1 for meters to kilometers conversion");
                System.out.println("Enter 2 for Kilometers to Meters coversion");
                System.out.println("Enter 3 for Kilometers to miles conversion");
                System.out.println("Enter 4 for miles to kilometer coversion");
                int choice2 = in.nextInt();

                switch(choice2){
                    case 1:
                }


            }
        }
        System.out.println("10 meters is " + DistanceConverter.metersToKilometers(10) + " kilometers");
        System.out.println("5 kilometers is " + DistanceConverter.kilometersToMeters(5) + " meters");
        System.out.println("2 miles is " + DistanceConverter.milesToKilometers(2) + " kilometers");
        System.out.println("3 kilometers is " + DistanceConverter.kilometersToMiles(3) + " miles");

        System.out.println("2 hours is " + TimeConverter.hoursToMinutes(2) + " minutes");
        System.out.println("120 minutes is " + TimeConverter.minutesToHours(120) + " hours");
        System.out.println("1 hour is " + TimeConverter.hoursToSeconds(1) + " seconds");
        System.out.println("3600 seconds is " + TimeConverter.secondsToHours(3600) + " hours");
    }
}
