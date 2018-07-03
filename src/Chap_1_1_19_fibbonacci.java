public class Chap_1_1_19_fibbonacci {
    public static void main(String[] args) {
        StdOut.println(fibbonacci(97));
    }

    /** Fibonacci sequence using an array to save values
     *
     * @param n Fibbonnaci of n
     * @return  Fibbonacci of n
     */
    public static long fibbonacci(int n) {
        int[] computed = new int[n];
        if (n <= 0) return 0;
        if (n == 1) return 1;
        computed[0] = 0;
        computed[1] = 1;

        for (int i = 2; i < n; i++) {
            computed[i] = computed[i-1] + computed[i-2];
        }
        return computed[computed.length - 1];
    }

}
