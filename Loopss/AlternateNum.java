import java.util.Scanner;

public class AlternateNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        while (num != 0) {
            num += 2; // Add 2
            num /= 10; // Divide by 10
            System.out.println("Updated number: " + num);
        }

        System.out.println("Final value of num is 0. Exiting...");
        sc.close();
    }
}
