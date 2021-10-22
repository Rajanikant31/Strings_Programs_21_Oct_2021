public class Count {
    static int out = 0;
    static int in = 1;

    static int countwords(String Str) {
        int state = out;
        int wc = 0;
        int i = 0;
        while (i < Str.length()) {
            if (Str.charAt(i) == ' ' || Str.charAt(i) == '\n' || Str.charAt(i) == '\t') {
                state = out;
            }
            else if (state == out) {
                state = in;
                ++wc;

            }
            i++;
        }
        return wc;
    }

    public static void main(String[] args) {
        String Str="Rajanikant\tPawar\nBE Mechanical";
        System.out.println("No of words="+countwords(Str));

    }
}