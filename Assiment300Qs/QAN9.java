package Assiment300Qs;

import java.util.Scanner;

public class QAN9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input name
    System.out.println("Enter your name:");
    String name = sc.nextLine();

    // Input date of birth
    System.out.println("Enter your date of birth (e.g., DD-MM-YYYY):");
    String birthdate = sc.nextLine();

    // Input mobile number
    System.out.println("Enter your mobile number:");
    String mobileNumber = sc.nextLine();

    // Output the collected details
    System.out.println("\n--- Your Details ---");
    System.out.println("Name: " + name);
    System.out.println("Date of Birth: " + birthdate);
    System.out.println("Mobile Number: " + mobileNumber);

    sc.close();
  }
}
