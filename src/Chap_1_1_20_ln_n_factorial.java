public class Chap_1_1_20_ln_n_factorial {
    public static void main(String[] args) {
        StdOut.println(ln_factorial(3));
    }

    public static int ln_factorial(int n) {
        return ln_factorial(n, 1);
    }

    public static int ln_factorial(int n, long acc) {
        if (n == 0) return ln(acc);
        return ln_factorial(n-1, acc *= n);
    }

    public static int ln(long n) {
        double base = Math.E;

        if (n < base) {
            return 0;
        }

        int count = 0;
        int total = 1;

        while (total <= n) {
            total *= base;
            count++;
        }
        return count - 1;
    }
}
