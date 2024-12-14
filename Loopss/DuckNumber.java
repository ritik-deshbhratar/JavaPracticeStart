
import java.util.*;

public class DuckNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number");
    int num = sc.nextInt();
    while (num != 0) {
      if (num % 10 == 0) {

        break;

      }
      num /= 10;
    }

    if (num == 0) {
      System.out.println("num is not a duck ");
    } else {
      System.out.println("Your number is duck number ");
    }
  }
}
