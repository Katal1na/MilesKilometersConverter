package app;

public class Main {
    private static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("Miles ↔ Kilometers");

        double miles = 5;
        double kilometers = convMilesToKilometers(miles);
        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }

    private static double convMilesToKilometers(double miles) {
        return miles * MILES_TO_KM;
    }
}
