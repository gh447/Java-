public class IncreaseDecrease {
    public static void main(String[] args) {
        int a = 1;
        System.out.println("a++=" + a++);
        //表示先用再加加
        //System.out.println("a++=" + a);
        //a += 1;
        System.out.println("a = " + a);
        a = 1;
        System.out.println("++a="+(++a));
        System.out.println("a=" + a);
        //++a和a++之后a的值都会加一，不同的是（a++）是先使用a的值再加一；++a是先加一，再使用a的值。


        int b = 10;
        System.out.println("b--=" + b--);
        System.out.println("b=" + b);

        b = 10;
        System.out.println("--b=" + --b);
        System.out.println("b=" + b);
    }
}
