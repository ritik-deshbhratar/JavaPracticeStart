/* 2. Write a program to enter twe naumbers and perform all arithmetic operations. */

package Assiment300Qs;

import java.util.Scanner;

public class QAN2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number 1 = ");
    int num1 = sc.nextInt();
    System.out.println("enter your number 2 = ");
    int num2 = sc.nextInt();

    System.out.println("  Sum is  + " + (num1 + num2));
    // System.out.println(" Sum is + " + num1 - num2 );
    // its giving eroor becouse we cant pass - as same
    System.out.println("minus is: " + (num1 - num2));
    System.out.println(" multiplyis  + " + (num1 * num2));
    System.out.println(" divide is  + " + (num1 / num2));
    System.out.println(" modulasis  + " + (num1 % num2));

  }
}
