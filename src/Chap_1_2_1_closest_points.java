public class Chap_1_2_1_closest_points {
    public static void main(String[] args) {
        Point2D[] points = randomPoints(22);
        PointsAndDistance pAndD = minDistanceOfClosestPoints(points);
        pAndD.getA().draw();
        pAndD.getB().draw();
        StdOut.println(pAndD.distance);
    }

    private static Point2D[] randomPoints(int n) {
        Point2D[] points = new Point2D[n];
        for (int i = 0; i < n; i++) {
            double x = StdRandom.uniform(0.0, 1.0);
            double y = StdRandom.uniform(0.0, 1.0);
            points[i] = new Point2D(x, y);
        }
        return points;
    }

    private static PointsAndDistance minDistanceOfClosestPoints(Point2D[] points) {
        if (points.length < 2) return new PointsAndDistance(null, null, -1);

        Point2D a;
        Point2D b;
        double distance;

        Point2D minA = null;
        Point2D minB = null;
        double minDistance = Double.POSITIVE_INFINITY;
        for (int i = 0; i < points.length; i++) {
            a = points[i];
            for (int j = i + 1; j < points.length; j++) {
                b = points[j];
                distance = a.distanceTo(b);
                if (distance < minDistance) {
                    minA = a;
                    minB = b;
                    minDistance = distance;
                }
            }
        }

        return new PointsAndDistance(minA, minB, minDistance);
    }

    private static class PointsAndDistance {
        private final Point2D a;
        private final Point2D b;
        private final double distance;

        PointsAndDistance(Point2D a, Point2D b, double distance) {
            this.a = a;
            this.b = b;
            this.distance = distance;
        }

        public Point2D getA() {
            return a;
        }

        public Point2D getB() {
            return b;
        }

        public double getDistance() {
            return distance;
        }
    }
}
