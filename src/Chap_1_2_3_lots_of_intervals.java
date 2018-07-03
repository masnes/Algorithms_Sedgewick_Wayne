public class Chap_1_2_3_lots_of_intervals {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        StdOut.printf("%d, %f, %f\n", n, min, max);
        Interval2D[] intervals = uniformlyDistributedIntervals(n, min, max);
        StdOut.printf("Intersections: %d, Intervals containing another: %d\n",
                numberOfIntersections(intervals),
                numberOfIntervalsContainingAnother(intervals));
    }

    private static void drawInterval2D(Interval2D interval) {
        double x[] = new double[2];
        double y[] = new double[2];
    }

    /**
     * Draw the uniformly distributed intervals, then return them in a list.
     *
     * @param n
     * @param min
     * @param max
     * @return
     */
    private static Interval2D[] uniformlyDistributedIntervals(int n, double min, double max) {
        if (min >= max) {
            throw new RuntimeException("Error. min is equal to max.");
        }
        Interval2D[] intervals = new Interval2D[n];
        for (int i = 0; i < n; i++) {
            double[] xs = new double[4];
            double[] ys = new double[4];
            for (int j = 0; j < 4; j++) {
                xs[j] = StdRandom.uniform(min, max);
                ys[j] = StdRandom.uniform(min, max);
            }
            double x_min = Math.min(xs[0], xs[1]);
            double x_max = Math.max(xs[0], xs[1]);
            double y_min = Math.min(ys[0], ys[1]);
            double y_max = Math.max(ys[0], ys[1]);
            Interval a = new Interval(x_min, x_max);
            Interval b = new Interval(y_min, y_max);
            intervals[i] = new Interval2D(a, b);

            StdOut.printf("Args to rectangle: %f, %f, %f, %f\n", x_min, x_max, y_min, y_max);
            StdOut.printf("Drawing rectangle: %f, %f, %f, %f\n", (x_min + x_max) / 2.0, (y_min + y_max) / 2.0, (x_max - x_min) / 2.0, (y_max - y_min) / 2.0);
            StdOut.println();
            StdDraw.filledRectangle((x_min + x_max) / 2.0, (y_min + y_max) / 2.0, (x_max - x_min) / 2.0, (y_max - y_min) / 2.0);
        }
        return intervals;
    }

    private static int numberOfIntersections(Interval2D[] intervals) {
        int intersections = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[i].intersects(intervals[j])) {
                    intersections++;
                    StdOut.printf("%s, %s\n", intervals[i], intervals[j]);
                }
            }
        }
        return intersections;
    }

    private static int numberOfIntervalsContainingAnother(Interval2D[] intervals) {
        int contains = 0;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (
                        intervals[i].contains(intervals[j].intervalX.min(), intervals[j].intervalY.min()) &&
                        intervals[i].contains(intervals[j].intervalX.min(), intervals[j].intervalY.max()) &&
                        intervals[i].contains(intervals[j].intervalX.max(), intervals[j].intervalY.min()) &&
                        intervals[i].contains(intervals[j].intervalX.max(), intervals[j].intervalY.max())
                        ) {
                    contains++;
                }
            }
        }
        return contains;
    }
}
