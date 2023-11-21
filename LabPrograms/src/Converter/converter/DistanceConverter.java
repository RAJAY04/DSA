package Converter.converter;

public class DistanceConverter {
    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }

    public static double kilometersToMeters(double kilometers) {
        return kilometers * 1000;
    }

    public static double milesToKilometers(double miles) {
        return miles * 1.609;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.609;
    }
}
