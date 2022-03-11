import java.util.Scanner;

public class RunLittleSuperMarket1 {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.address = "明克街15号";
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise[] all = littleSuperMarket.merchandises;
        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();//这一步其实是给all[]内部的元素创建一个引用
            m.count = 200;
            m.soldPrice = (1 + Math.random()) * 200;
            m.purchasePrice = Math.random() * 200;
            m.Id = "Id" + i;
            m.name = "商品" + i;
            all[i] = m;
        }
        System.out.println("超市开门了！");
        boolean open = true;
        Scanner scanner = new Scanner(System.in);
        while (open) {
            System.out.println("本店名叫" + littleSuperMarket.superMarketName);
            System.out.println("本店地址" + littleSuperMarket.address);
            System.out.println("共有停车位" + littleSuperMarket.parkingCount + "个");
            System.out.println("今天的营业额为" + littleSuperMarket.incoming);
            System.out.println("共有商品" + littleSuperMarket.merchandises.length + "种");

            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 100000);
            customer.money = (1 + Math.random()) * 1000;
            customer.isDrivingCar = Math.random() > 0.5;

            if (customer.isDrivingCar) {
                if (littleSuperMarket.parkingCount > 0) {
                    System.out.println("欢迎" + customer.name + "驾车而来，本店提供免费停车位，您的车位编号为" +
                            littleSuperMarket.parkingCount);
                    littleSuperMarket.parkingCount--;
                } else {
                    System.out.println("本店车位不足，欢迎下次再来");
                }
            } else {
                System.out.println("欢迎" + customer.name + "光临");
            }
            double totalCost = 0;
            while (true) {
                System.out.println("本店提供" + all.length + "种商品，欢迎选购。请输入商品编号");
                int index = scanner.nextInt();
                if (index < 0) {
                    break;
                }

                Merchandise m = all[index];

                System.out.println("您选购的商品名字是" + m.name + "单价是" + m.soldPrice + "请问您要购买几个");
                int numToBuy = scanner.nextInt();
                if (numToBuy<0){
                    System.out.println("不买看看也好，欢迎继续选购");
                    continue;
                }
                if (numToBuy > m.count) {
                    System.out.println(m.name+"库存不足，我们会尽快补货，欢迎继续选购");
                    continue;
                }

                totalCost += numToBuy * m.soldPrice;

                if (totalCost > customer.money) {
                    System.out.println("不买看看也好，欢迎继续选购");
                    continue;
                }


                m.count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] += numToBuy;//顾客挑选了代码为index的商品后，这个数组会保存这个商品卖出了几个
            }
            customer.money -= totalCost;

            if (customer.isDrivingCar) {
                littleSuperMarket.parkingCount++;
            }
            System.out.println("顾客" + customer.name + "共消费了" + totalCost);

            littleSuperMarket.incoming = totalCost;

            System.out.println("还要继续营业吗");
            open = scanner.nextBoolean();
        }
        System.out.println("超市关门了！");
        System.out.println("今天总营业额为" + littleSuperMarket.incoming + "。营业情况如下");

        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++) {
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if (numSold > 0) {
                double incoming = m.soldPrice * numSold;
                double netIncoming = (m.soldPrice - m.purchasePrice) * numSold;
                System.out.println(m.name+"售出了"+numSold+"个,销售额为"+incoming+"净利润为"+netIncoming);
            }

        }
    }
}
