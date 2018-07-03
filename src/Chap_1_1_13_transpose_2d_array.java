/* Print the transposition of a 2 dimensional array */
public class Chap_1_1_13_transpose_2d_array {
    public static void main(String[] args) {
        int row = StdRandom.uniform(1, 20);
        int column = StdRandom.uniform(1, 20);
        Boolean[][] arr = new Boolean[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (StdRandom.uniform() > 0.5) {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                };
            }
        }

        StdOut.print("   "); // Room for row numbers
        for (int i = 0; i < column; i++) {
            StdOut.printf("%d ", i);
        }
        StdOut.println();
        for (int i = 0; i < row; i++) {
            StdOut.printf("%2d ", i);
            for (int j = 0; j < column; j++) {
                if (arr[i][j]) {
                    StdOut.print("* ");
                } else {
                    StdOut.print("  ");
                }
            }
            StdOut.println();
        }

        StdOut.println();
        StdOut.println("Transposed:");
        StdOut.println();

        StdOut.print("   "); // Room for row numbers
        for (int i = 0; i < row; i++) { // Transpose row for column
            StdOut.printf("%d ", i);
        }
        StdOut.println();
        for (int i = 0; i < column; i++) {
            StdOut.printf("%2d ", i);
            for (int j = 0; j < row; j++) {
                if (arr[j][i]) {
                    StdOut.print("* ");
                } else {
                    StdOut.print("  ");
                }
            }
            StdOut.println();
        }
    }
}
