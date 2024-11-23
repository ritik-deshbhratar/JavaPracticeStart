import java.util.Scanner;

public class Num1To100 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your start number ");
    int start = sc.nextInt();
    System.out.println("enter your end number ");
    int end = sc.nextInt();
    while (start <= end) {
      System.out.println(start);
      start++;
    }

  }
}
