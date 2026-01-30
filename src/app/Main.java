package app;

public class Main {
    private static final double MILES_TO_KM = 1.60934;
    private static final double KM_TO_MILES = 0.621371;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("Miles ↔ Kilometers");

        double miles = 5;
        double kilometers = convMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers");

        double km = 8;
        double milesResult = convKilometersToMiles(km);
        System.out.println(km + " kilometers = " + milesResult + " miles");
    }

    private static double convMilesToKilometers(double miles) {
        return miles * MILES_TO_KM;
    }

    private static double convKilometersToMiles(double kilometers) {
        return kilometers * KM_TO_MILES;
    }
}

