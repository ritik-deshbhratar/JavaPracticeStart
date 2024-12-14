import java.util.Scanner;

public class ReverseTheNum {
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
    System.out.println(rev);
  }
}
