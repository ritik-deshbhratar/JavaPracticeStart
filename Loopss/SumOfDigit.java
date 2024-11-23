import java.util.*;

public class SumOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter Your Number ");
    int Num = sc.nextInt();
    int sum = 0;
    int count = 0;
    while (Num != 0) {
      int lastDigit = Num % 10;
      sum = sum + lastDigit;
      count++;
      Num /= 10;
    }
    System.out.println("sum of digit is " + sum);
    System.out.println("Count of digit is " + count);
  }
}
