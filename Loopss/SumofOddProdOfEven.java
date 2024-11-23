import java.util.*;

public class SumofOddProdOfEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number");
    int num = sc.nextInt();
    int SumOfOdd = 0;
    int ProductOfEven = 1;
    while (num != 0) {
      int last = num % 10;
      if (last % 2 == 0) {
        ProductOfEven = ProductOfEven * last;
      } else {
        SumOfOdd = SumOfOdd + last;
      }
      num /= 10;
    }
    System.out.println("SumOfOdd:" + SumOfOdd);
    System.out.println("ProductOfEven:" + ProductOfEven);

  }
}