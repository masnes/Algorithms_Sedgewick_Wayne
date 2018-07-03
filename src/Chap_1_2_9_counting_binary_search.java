import java.util.Arrays;

public class Chap_1_2_9_counting_binary_search {
    public static int indexOf(int[] a, int key, Counter counter) {
        // Array must be sorted
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            counter.increment();
            int mid = lo + (hi - lo) / 2;
            if      (key > a[mid])  lo = mid + 1;
            else if (key < a[mid])  hi = mid - 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            // Read key, print if not in whitelist.
            Counter counter = new Counter();
            int key = StdIn.readInt();
            StdOut.printf("read int %d\n", key);
            if (indexOf(whitelist, key, counter) != -1)
                StdOut.printf("Found %d\n", key);
            else
                StdOut.printf("Couldn't find %d\n", key);
            StdOut.println(counter.getCount());
        }
    }

    private static class Counter {
        private long count;

        Counter() {
            this.count = 0;
        }

        public void increment() {
            this.count++;
        }

        public long getCount() {
            return this.count;
        }
    }

}
