import java.util.*;

public class PrintNumberusinginput {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number start");
    int start = sc.nextInt();

    System.out.println("Enter your Number End");
    int End = sc.nextInt();
    System.out.println("==========");
    while (start <= End) {
      System.out.println(start);
      start++;
    }

  }
}
