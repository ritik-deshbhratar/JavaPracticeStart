/* Write a C program to enter temperarure in Fahrenheit and convert to Celsius */
package Assiment300Qs;

import java.util.Scanner;

public class QAN8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter the temperature in Fahrenheit
    System.out.print("Enter temperature in Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();

    // Convert Fahrenheit to Celsius
    double celsius = (fahrenheit - 32) * 5 / 9;

    // Display the result
    System.out.printf("Temperature in Celsius: %.2f%n", celsius);

    scanner.close();
  }
}
