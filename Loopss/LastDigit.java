import java.util.Scanner;

public class LastDigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("entr your Nunmber");
    int Num = sc.nextInt();

    while (Num != 0) {
      int LastDigit = Num % 10;
      Num /= 10;
      System.out.println("Last Digit is " + LastDigit);

    }
  }
}
