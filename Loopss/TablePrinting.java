import java.util.*;

public class TablePrinting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter yoru num which table you want to nprintln");

    int num = sc.nextInt();
    int i = 1;
    while (i <= 10) {
      System.out.println(num + " * " + i + "=" + (num * i));
      i++;
    }
  }
}
