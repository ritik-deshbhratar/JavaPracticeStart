import java.util.Scanner;

public class Powerwhiless {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your base ");
    int base = sc.nextInt();
    System.out.println("Eneter your Rise ");
    int Rise = sc.nextInt();
    int pow = 1;
    int i = 0;
    while (i < Rise) {
      pow = pow * base;
      i++;
    }

    System.out.println(pow);
  }
}
