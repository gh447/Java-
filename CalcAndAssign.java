public class CalcAndAssign {
    public static void main(String[] args) {
        int a = 16;

        a >>= 2;//a = a >> 2;a右移两位相当于除4；
        System.out.println(a);
        //此时a = 4；

        a *= 9;
        System.out.println(a);
    }
}
