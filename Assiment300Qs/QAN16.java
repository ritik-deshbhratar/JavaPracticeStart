/*
 * 16. Write a C program to convert specified days into Note: years, weeks and
 * days. lgnore leap year. Test Data
 * Number of days 1329
 * Expected Output: Years:3
 * Weeks: 33
 * Days:3
 */

package Assiment300Qs;

public class QAN16 {
  public static void main(String[] args) {
    // Total number of days
    int totalDays = 1329;

    // Converting days to years, weeks, and remaining days
    int years = totalDays / 365; // 1 year = 365 days
    int remainingDaysAfterYears = totalDays % 365;

    int weeks = remainingDaysAfterYears / 7; // 1 week = 7 days
    int days = remainingDaysAfterYears % 7; // Remaining days

    // Displaying the results
    System.out.println("Years: " + years);
    System.out.println("Weeks: " + weeks);
    System.out.println("Days: " + days);
  }
}
