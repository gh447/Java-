public class WhileExample {
    public static void main(String[] args) {
        int n = 10;
        int dividend = 100;
        int divisor = 5;
        int found = 0;

        while (found < n) {
            if (dividend % divisor == 0) {
                found++;
                System.out.println(dividend + "可以整除" + divisor + ",商为" + dividend / divisor);
            }
            dividend++;

        }
    }
}
