import java.util.Scanner;

public class LastDigitWithoutLoops {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number:");
    int num = sc.nextInt();

    // Calculate the last digit
    int lastDigit = num % 10;

    // Display the last digit
    System.out.println("The last digit is: " + lastDigit);
  }

}
