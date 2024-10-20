import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Currency Converter");
        System.out.println("------------------");

        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        System.out.println("From:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. INR (Indian Rupee)");
        System.out.println("5. JPY (Japanese Yen)");
        System.out.print("Choose currency (1-5): ");
        int fromCurrency = scanner.nextInt();

        System.out.println("To:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. INR (Indian Rupee)");
        System.out.println("5. JPY (Japanese Yen)");
        System.out.print("Choose currency (1-5): ");
        int toCurrency = scanner.nextInt();

        double exchangeRate = getExchangeRate(fromCurrency, toCurrency);
        double convertedAmount = amount * exchangeRate;

        System.out.println(amount + " " + getCurrencySymbol(fromCurrency) + " = " + convertedAmount + " " + getCurrencySymbol(toCurrency));
    }
    private static double getExchangeRate(int fromCurrency, int toCurrency) {
        // Approximate exchange rates (may vary depending on current rates)
        double[][] exchangeRates = {
            // USD, EUR, GBP, INR, JPY
            {1, 0.88, 0.76, 74.83, 109.33}, // USD
            {1.14, 1, 0.86, 85.21, 124.11}, // EUR
            {1.32, 1.16, 1, 98.51, 144.41}, // GBP
            {0.013, 0.012, 0.010, 1, 1.46}, // INR
            {0.0091, 0.0081, 0.0069, 0.068, 1}  // JPY
        };

        return exchangeRates[fromCurrency - 1][toCurrency - 1];
    }

    private static String getCurrencySymbol(int currency) {
        switch (currency) {
            case 1: return "USD ($)";
            case 2: return "EUR (€)";
            case 3: return "GBP (£)";
            case 4: return "INR (₹)";
            case 5: return "JPY (¥)";
            default: return "Unknown";
        }
    }
}
