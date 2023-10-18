import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the exchange rates (you should fetch these from an API in a real application)
        double usdToEuroRate = 0.85;
        double usdToGBP = 0.75;

        System.out.println("Currency Converter");
        System.out.println("Available Currencies:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");

        System.out.print("Select the base currency (1/2/3): ");
        int baseCurrencyChoice = scanner.nextInt();

        System.out.print("Enter the amount in the base currency: $");
        double amount = scanner.nextDouble();

        System.out.print("Select the target currency (1/2/3): ");
        int targetCurrencyChoice = scanner.nextInt();

        double convertedAmount = 0.0;
        String targetCurrencySymbol = "";

        // Perform the currency conversion based on user choices
        if (baseCurrencyChoice == 1) {
            if (targetCurrencyChoice == 2) {
                convertedAmount = amount * usdToEuroRate;
                targetCurrencySymbol = "EUR";
            } else if (targetCurrencyChoice == 3) {
                convertedAmount = amount * usdToGBP;
                targetCurrencySymbol = "GBP";
            } else {
                System.out.println("Invalid target currency selection.");
                return;
            }
        } else {
            System.out.println("Invalid base currency selection.");
            return;
        }

        System.out.println("Converted amount: " + convertedAmount + " " + targetCurrencySymbol);
    }
}
