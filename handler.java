import java.util.Scanner;

public class ComprehensiveUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Unit Converter Menu:");
        System.out.println("1. Feet to Meters");
        System.out.println("2. Meters to Feet");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Kilometers to Miles");
        System.out.println("6. Miles to Kilometers");
        System.out.println("7. Gallons to Liters");
        System.out.println("8. Liters to Gallons");
        System.out.println("9. Inches to Centimeters");
        System.out.println("10. Centimeters to Inches");
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
                kilometersToMiles();
                break;
            case 6:
                milesToKilometers();
                break;
            case 7:
                gallonsToLiters();
                break;
            case 8:
                litersToGallons();
                break;
            case 9:
                inchesToCentimeters();
                break;
            case 10:
                centimetersToInches();
                break;
            default:
                System.out.println("Invalid option");
        }

        scanner.close();
    }

    private static void feetToMeters() {
        promptAndConvert("feet", "meters", 0.3048);
    }

    private static void metersToFeet() {
        promptAndConvert("meters", "feet", 1 / 0.3048);
    }

    private static void poundsToKilograms() {
        promptAndConvert("pounds", "kilograms", 0.453592);
    }

    private static void kilogramsToPounds() {
        promptAndConvert("kilograms", "pounds", 1 / 0.453592);
    }

    private static void kilometersToMiles() {
        promptAndConvert("kilometers", "miles", 0.621371);
    }

    private static void milesToKilometers() {
        promptAndConvert("miles", "kilometers", 1 / 0.621371);
    }

    private static void gallonsToLiters() {
        promptAndConvert("gallons", "liters", 3.78541);
    }

    private static void litersToGallons() {
        promptAndConvert("liters", "gallons", 1 / 3.78541);
    }

    private static void inchesToCentimeters() {
        promptAndConvert("inches", "centimeters", 2.54);
    }

    private static void centimetersToInches() {
        promptAndConvert("centimeters", "inches", 1 / 2.54);
    }

    private static void promptAndConvert(String fromUnit, String toUnit, double conversionFactor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value in " + fromUnit + ":");
        double fromValue = scanner.nextDouble();
        double toValue = fromValue * conversionFactor;
        System.out.println(fromValue + " " + fromUnit + " is equal to " + toValue + " " + toUnit + ".");
    }
}
