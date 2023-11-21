package Converter;

import Converter.converter.*;

public class MainApp {

    public static void main(String[] args) {
        ///the methods are static and hence we are referencing them with the class name
        // Distance Converter
        System.out.println("Distance Converter:");
        System.out.println("10 meters is " + DistanceConverter.metersToKilometers(10) + " kilometers");
        System.out.println("5 kilometers is " + DistanceConverter.kilometersToMeters(5) + " meters");
        System.out.println("2 miles is " + DistanceConverter.milesToKilometers(2) + " kilometers");
        System.out.println("3 kilometers is " + DistanceConverter.kilometersToMiles(3) + " miles");

        // Time Converter
        System.out.println("Time Converter:");
        System.out.println("2 hours is " + TimeConverter.hoursToMinutes(2) + " minutes");
        System.out.println("120 minutes is " + TimeConverter.minutesToHours(120) + " hours");
        System.out.println("1 hour is " + TimeConverter.hoursToSeconds(1) + " seconds");
        System.out.println("3600 seconds is " + TimeConverter.secondsToHours(3600) + " hours");
    }
}
