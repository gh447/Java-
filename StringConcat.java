public class StringConcat {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b ;
        System.out.println("a + b=" + c);//字符串加法是拼接

        boolean aBiggerThanb = a > b;
        System.out.println("a > b 是" + aBiggerThanb + "的");

        System.out.println("a + b=" + a + b);

        System.out.println("a + b =" + (a + b));

        System.out.println("a * b=" + a * b);
    }
}
