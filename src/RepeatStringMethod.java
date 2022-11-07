public class RepeatStringMethod {


    public static void main(String[] args) {
        repeatStr(3, "Kids");
        System.out.println(repeatStr(3, "Kids "));

    }

    public static String repeatStr(final int n, final String s) {
        return s.repeat(n);
    }

}

