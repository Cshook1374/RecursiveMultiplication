import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      scanner.close();
      System.out.printf("%d * %d = %d\n", a, b, Multiplier.multiply(a, b));
  }
}