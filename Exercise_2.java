import java.util.Scanner;

public class Exercise_2 {

    // Fahrenheit to Celsius Conversion
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit Conversion
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in degrees Fahrenheit: ");

        double fahrenheitInput = scnr.nextDouble();

        double celsiusOutput = fahrenheitToCelsius(fahrenheitInput);

        System.out.printf("%.2f degrees Fahrenheit is equal to %.2f degrees Celsius.%n", fahrenheitInput,
                celsiusOutput);

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in degrees Celsius: ");

        double celsiusInput = scnr.nextDouble();

        double fahrenheitOutput = celsiusToFahrenheit(celsiusInput);

        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit.%n", celsiusInput,
                fahrenheitOutput);

        scnr.close();
    }
}