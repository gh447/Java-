public class SuperMarket {
    public static void main(String[] args) {
        //创建一个Merchandise实例，用m1指向它
        Merchandise m1 = new Merchandise();
        //使用点操作符，给m1指向的实例赋值
        m1.name = "茉莉花茶20包";
        m1.Id = "000099518";
        m1.count = 1000;
        m1.price = 99.9;

        Merchandise m2 = new Merchandise();
        m2.name = "可口可乐 330ml";
        m2.Id = "000099519";
        m2.count = 1000;
        m2.price = 3.00;

        //卖出一个商品
        int m1ToSold = 1;
        System.out.println("感谢购买" + m1ToSold + "个" + m1.name +
                "。商品单价为" + m1.price + "。消费总价为" + m1.price * m1ToSold + "。");
        m1.count -= m1ToSold;
        System.out.println(m1.Id + "剩余库存为" + m1.count);

        //卖出三个物品二
        int m2ToSold = 3;
        System.out.println("感谢购买" + m2ToSold + "个" + m2.name + "。商品单价为" + m2.price +
                "。商品总价为" + m2ToSold * m2.price + "。");
        m2.count -= m2ToSold;
        System.out.println(m2.Id + "剩余的库存数量为" + m2.count);

    }
}
