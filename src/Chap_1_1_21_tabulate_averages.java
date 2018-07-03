public class Chap_1_1_21_tabulate_averages {
    public static void main(String[] args) {
        while (StdIn.hasNextLine()) {
            String line = StdIn.readLine();
            String[] res = line.split("\\s+");
            for (int i = 0; i < res.length; i++) {
                StdOut.print(res[i]);
                StdOut.println();
            }
        }
    }
}
