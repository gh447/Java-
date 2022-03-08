public class ifElseBaozi {
    public static void main(String[] args) {
        int baozi = 3;

        boolean baozigangchulong = false;

        if (baozigangchulong){
            baozi = baozi + 2;
            System.out.println("包子刚出笼，买了" + baozi + "个肉包子");
        }else {
            System.out.println("买了" + baozi + "个肉包子");
        }
    }
}
