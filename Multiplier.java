public class Multiplier {
    public static int multiply(int a, int b) {
        if (b > 1) {
            b--;
            a += multiply(a, b);
        }
        return a;
    }
}