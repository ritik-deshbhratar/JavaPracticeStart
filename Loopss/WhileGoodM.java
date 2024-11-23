import java.util.Scanner;

class WhileGoodM {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your your number ");
    int num = sc.nextInt();
    int start = 0;
    while (start < num) {
      System.out.println(" good mornig ");
      start++;
    }

  }
}