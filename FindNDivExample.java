public class FindNDivExample {
    public static void main(String[] args) {
        int dividend = 5;
        int divisor = 30;
        int found = 0;
        int toBefound = 10;

        for (int i = 0; i < 1000 && found < 10; i++) {
            if (dividend < divisor) {
                System.out.println(dividend+"小于" + divisor + ",循环跳出");
                dividend++;
                continue;

            }
            if (dividend % divisor == 0) {
                System.out.println(dividend + "可以整除" + divisor + "，商为" + dividend / divisor);
                found++;
            }
            if (found >= toBefound) {
                System.out.println("已找到" + found + "个值,循环退出");
                found++;
                break;
            }
            dividend++;


        }
    }
}
