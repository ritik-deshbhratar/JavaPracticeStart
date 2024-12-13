/* Week 1(Day 1-6) 
we a C program to enter twonumbers and find their sum. */
package Assiment300Qs;

import java.util.Scanner;

public class QAN1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number 1 = ");
    int num1 = sc.nextInt();
    System.out.println("enter your number 2 = ");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println("num1: " + num1 + " + num2: " + num2 + " sum is " + " = " + (sum));

  }
}
