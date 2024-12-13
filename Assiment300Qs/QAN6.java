/*Write a java  program to enter lensth in centimeter and convert it into meter and kilometer. */
package Assiment300Qs;

import java.util.Scanner;

public class QAN6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the length in centimeters
        System.out.print("Enter length in centimeters: ");
        double centimeters = scanner.nextDouble();

        // Convert centimeters to meters and kilometers
        double meters = centimeters / 100; // 1 meter = 100 centimeters
        double kilometers = centimeters / 100000; // 1 kilometer = 100,000 centimeters

        // Display the results
        System.out.printf("Length in meters: %.2f meters%n", meters);
        System.out.printf("Length in kilometers: %.5f kilometers%n", kilometers);

        scanner.close();
    }
}
