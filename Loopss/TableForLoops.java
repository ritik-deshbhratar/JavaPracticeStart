import java.util.Scanner;

public class TableForLoops {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = sc.nextInt(); // Use lowercase 'num' for consistency with conventions.

    System.out.println("Multiplication table for " + num + ":");
    for (int i = 1; i <= 10; i++) {
      int product = i * num; // Calculate product without modifying 'num'.
      System.out.println(num + " x " + i + " = " + product);
    }
  }
}
