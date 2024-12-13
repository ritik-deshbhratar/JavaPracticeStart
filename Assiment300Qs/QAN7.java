/*7. Write a java program to enter temperature in Celsius and convert it into Fahrenheit. 
*/
package Assiment300Qs;

import java.util.Scanner;

public class QAN7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;

        // Display the result
        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);

        scanner.close();
    }
}
