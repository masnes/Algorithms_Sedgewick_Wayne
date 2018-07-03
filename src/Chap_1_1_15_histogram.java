public class Chap_1_1_15_histogram {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 2, 3};
        printArr(histogram(a, 6));
    }

    static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            StdOut.printf("%d ", arr[i]);
        }
    }

    static int[] histogram(int a[], int m) {
        int ret[] = new int[m];

        for (int i = 0; i < a.length; i++) {
            if (a[i] < m) {
                ret[a[i]]++;
            }
        }

        return ret;
    }
}
