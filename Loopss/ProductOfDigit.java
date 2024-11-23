import java.util.*;

public class ProductOfDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter Your Number ");
    int Num = sc.nextInt();
    int Product = 1;
    int count = 0;
    while (Num != 0) {
      int lastDigit = Num % 10;
      Product = Product * lastDigit;
      count++;
      Num /= 10;
    }
    System.out.println("sum of digit is " + Product);
    System.out.println("Count of digit is " + count);
  }

}