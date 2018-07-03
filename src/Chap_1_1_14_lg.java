public class Chap_1_1_14_lg {
    public static void main(String[] args) {
        StdOut.println("testing");
        StdOut.printf("%d\n", lg(1000));
        StdOut.printf("%d\n", lg(-5));
        StdOut.printf("%d\n", lg(12));
        StdOut.printf("%d\n", lg(2));
        StdOut.printf("%d\n", lg(5));
        StdOut.println("done.");
    }

    private static int lg(int n) {
        int base = 2;

        if (n < 2) {
            return 0;
        }

        int count = 0;
        int total = 1;

        while (total <= n) {
            total *= 2;
            count++;
        }
        return count - 1;
    }
}
