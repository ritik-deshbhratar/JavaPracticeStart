import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Power {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your base ");
    int base = sc.nextInt();
    System.out.println("Eneter your Rise ");
    int Rise = sc.nextInt();
    int pow = 1;
    for (int i = 0; i < Rise; i++) {
      pow = pow * base;
    }
    System.out.println(pow);
  }
}
