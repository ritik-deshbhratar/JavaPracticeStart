import java.util.*;

public class AccuranceOfDigit {
  public static void main(String[] args) {
    Scanner Sc = new Scanner(System.in);
    System.out.println("eneter your Number");
    int num = Sc.nextInt();
    System.out.println("eneter Your Number Accurance");
    int Accurancenum = Sc.nextInt();
    int Accurance = 0;
    while (num != 0) {
      int last = num % 10;
      if (last == Accurancenum) {
        Accurance++;
      }
      num /= 10;
    }
    System.out.println("Your Number " + " = " + Accurancenum + " " + "is Accured " + Accurance + " = " + "Times");
  }
}
