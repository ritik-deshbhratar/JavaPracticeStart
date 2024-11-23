import java.util.Scanner;

public class OddEvenCount {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your number");
    int num = sc.nextInt();
    int OddCount = 0;
    int EvenCount = 0;
    while (num != 0) {
      int last = num % 10;
      if (last % 2 == 0) {
        EvenCount++;

      } else {
        OddCount++;
      }
      num /= 10;
    }
    System.out.println(" OddCount:" + OddCount);
    System.out.println("EvenCount:" + EvenCount);

  }
}
