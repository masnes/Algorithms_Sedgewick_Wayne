public class Chap_1_2_7 {
    public static void main(String[] args) {
        String s = args[0];
        StdOut.println(mystery(s));
    }

    public static String mystery(String s) {
        int n = s.length();
        if (n <= 1) return s;
        String a = s.substring(0, n/2);
        String b = s.substring(n/2, s.length());
        return mystery(a) + mystery(b);
    }
}
