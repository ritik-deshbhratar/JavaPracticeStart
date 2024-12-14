import java.util.Scanner;

public class PalindromeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your Numebr ");
    int num = sc.nextInt();
    int temp = num;
    int rev = 0;

    while (temp != 0) {
      int last = temp % 10;
      rev = rev * 10 + last;
      temp /= 10;

    }
    if (num == rev) {
      System.out.println("its pallindrom");

    } else {
      System.out.println("Its not a palindrome");
    }

  }
}
