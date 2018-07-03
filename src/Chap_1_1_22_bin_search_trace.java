public class Chap_1_1_22_bin_search_trace {
    public static void main(String[] args) {
        int[] a = {1, 1, 3, 6, 7, 7, 9, 10, 11, 11, 14, 17, 19, 22};
        indexOf(a, 7);
    }

    public static int indexOf(int[] a, int key) {
        return indexOf(a, key, 0, a.length - 1, 0);
    }

    public static int indexOf(int[] a, int key, int lo, int hi, int depth) {
        for (int i = 0; i < depth; i++) {
            StdOut.print(" ");
        }
        StdOut.printf("low: %d, hi: %d", lo, hi);
        StdOut.println();
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if      (key < a[mid])  return indexOf(a, key, lo, mid - 1, depth + 1);
        else if (key > a[mid])  return indexOf(a, key, mid + 1, hi, depth + 1);
        else                    return mid;
    }
}
