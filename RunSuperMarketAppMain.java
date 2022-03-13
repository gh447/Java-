import java.util.Scanner;

public class RunSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.address = "明克街15号";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandises = new MerchandiseV2[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        MerchandiseV2[] all = littleSuperMarket.merchandises;
        for (int i = 0; i < all.length; i++) {
            MerchandiseV2 m = new MerchandiseV2();
            m.count = 200;
            m.name = "商品" + i;
            m.id = "Id" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("今日大酬宾，所有商品第二件半价！请选择要购买商品的编号");
            int index = scanner.nextInt();
            if (index <= 0) {
                break;
            }
            if (index > all.length) {
                System.out.println("商品索引超出界限");
                continue;
            }

            MerchandiseV2 m = all[index];
            System.out.println("商品" + m.name + "单价为" + m.soldPrice + ",请问您要买几个？");
            int numToBuy = scanner.nextInt();
            if (numToBuy > m.count) {
                System.out.println("商品库存不足");
                continue;
            }

            int fullPriceCount = numToBuy / 2 + numToBuy % 2;
            int halfPriceCount = numToBuy - fullPriceCount;

            double totalCost = fullPriceCount * m.soldPrice + (m.soldPrice * halfPriceCount) / 2;
            //如果不加小括号halfPriceCount是int类型的，没有小数，例如halfPriceCount等于3时，halfPriceCount/2等于1
            //运算时要时刻注意数据的类型
            m.count -= numToBuy;

            System.out.println("选购的商品总价为"+totalCost);
        }
    }
}
