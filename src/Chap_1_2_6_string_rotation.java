public class Chap_1_2_6_string_rotation {
    public static void main(String[] args) {
        String s = args[0];
        String t = args[1];

        if ((t + t).contains(s)) {
            StdOut.println("True!");
        } else {
            StdOut.println("False!");
        }
    }
}
