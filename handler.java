import java.util.Scanner;

public class ComprehensiveUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Comprehensive Unit Converter Menu:");
        System.out.println("1. Feet to Meters");
        System.out.println("2. Meters to Feet");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Celsius to Fahrenheit");
        System.out.println("6. Fahrenheit to Celsius");
        System.out.println("7. Kilometers to Miles");
        System.out.println("8. Miles to Kilometers");
        System.out.println("9. Gallons to Liters");
        System.out.println("10. Liters to Gallons");
        System.out.println("11. Inches to Centimeters");
        System.out.println("12. Centimeters to Inches");
        System.out.println("13. Miles per Hour to Kilometers per Hour");
        System.out.println("14. Kilometers per Hour to Miles per Hour");
        System.out.println("15. Pounds per Square Inch to Kilopascals");
        System.out.println("16. Kilopascals to Pounds per Square Inch");
        System.out.println("Enter the option number:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                feetToMeters();
                break;
            case 2:
                metersToFeet();
                break;
            case 3:
                poundsToKilograms();
                break;
            case 4:
                kilogramsToPounds();
                break;
            case 5:
                celsiusToFahrenheit();
                break;
            case 6:
                fahrenheitToCelsius();
                break;
            case 7:
                kilometersToMiles();
                break;
            case 8:
                milesToKilometers();
                break;
            case 9:
                gallonsToLiters();
                break;
            case 10:
                litersToGallons();
                break;
            case 11:
                inchesToCentimeters();
                break;
            case 12:
                centimetersToInches();
                break;
            case 13:
                mphToKph();
                break;
            case 14:
                kphToMph();
                break;
            case 15:
                psiToKPa();
                break;
            case 16:
                kPaToPsi();
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }

    private static void litersToGallons() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the volume in liters:");
        double liters = scanner.nextDouble();
        double gallons = liters / 3.78541;
        System.out.println(liters + " liters is equal to " + gallons + " gallons.");
    }

    private static void inchesToCentimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in inches:");
        double inches = scanner.nextDouble();
        double centimeters = inches * 2.54;
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters.");
    }

    private static void centimetersToInches() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length in centimeters:");
        double centimeters = scanner.nextDouble();
        double inches = centimeters / 2.54;
        System.out.println(centimeters + " centimeters is equal to " + inches + " inches.");
    }

    private static void mphToKph() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed in miles per hour:");
        double mph = scanner.nextDouble();
        double kph = mph * 1.60934;
        System.out.println(mph + " miles per hour is equal to " + kph + " kilometers per hour.");
    }

    private static void kphToMph() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the speed in kilometers per hour:");
        double kph = scanner.nextDouble();
        double mph = kph / 1.60934;
        System.out.println(kph + " kilometers per hour is equal to " + mph + " miles per hour.");
    }

    private static void psiToKPa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pressure in pounds per square inch:");
        double psi = scanner.nextDouble();
        double kPa = psi * 6.89476;
        System.out.println(psi + " pounds per square inch is equal to " + kPa + " kilopascals.");
    }

    private static void kPaToPsi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pressure in kilopascals:");
        double kPa = scanner.nextDouble();
        double psi = kPa / 6.89476;
        System.out.println(kPa + " kilopascals is equal to " + psi + " pounds per square inch.");
    }
}

// there was definitely a better and a more efficient way to write down all off this but i'm just tryna expand what i can do with java
