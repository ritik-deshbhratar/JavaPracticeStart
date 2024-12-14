public class Fibonachi {
  public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3;
    int i = 1;
    int num = 5;
    while (i <= num) {

      n3 = n1 + n2;
      System.out.println(n1);
      n1 = n2;
      n2 = n3;
      i++;
    }
  }
}
