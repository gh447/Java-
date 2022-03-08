public class IfElseNest {
    public static void main(String[] args) {
        int a = 9;
        int b = 99;
        int c = 99;

        if (a == b && a == c) {
            System.out.println("abc等大，为" + a);
        } else if (a > b && a > c) {
            System.out.println("a是最大的数，为" + a);
        } else if (a > b && a < c) {
            System.out.println("c是最大的数，为" + c);
        } else if (a < b && c < b) {
            System.out.println("b是最大的数，为" + b);
        } else if (a == b && a > c) {
            System.out.println("a和b是最大的数，为" + a);
        } else if (a == c && a > b) {
            System.out.println("a和c是最大的数，为" + a);
        } else if (b == c && b > a) {
            System.out.println("b和c是最大的数，为" + b);
        }
    }
}
