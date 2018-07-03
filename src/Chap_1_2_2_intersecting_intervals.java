public class Chap_1_2_2_intersecting_intervals {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[n];
        for (int i = 0; i < n; i++) {
            StdOut.println(n);
            intervals[n] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    StdOut.printf("%s, %s", intervals[i], intervals[j]);
                }
            }
        }
    }

}
