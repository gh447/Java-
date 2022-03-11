import java.util.Scanner;

public class RunLittleSuperMarket {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.superMarketName = "有家小超市";
        littleSuperMarket.address = "明科街15号";
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.parkingCount = 200;
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];

        Merchandise all[] = littleSuperMarket.merchandises;

        for (int i = 0; i < all.length; i++) {
            Merchandise m = new Merchandise();
            m.name = "商品" + i;
            m.count = 200;
            m.Id = "Id" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = (1 + Math.random()) * 200;
            all[i] = m;
        }



        System.out.println("超市开门了！");
        Scanner scanner = new Scanner(System.in);
        boolean open = true;

        while (open) {
            Customer customer = new Customer();
            customer.name = "顾客编号" + (int) (Math.random() * 10000);//为防止顾客编号有小数，强制类型转换为int
            customer.money = (1 + Math.random()) * 2000;
            customer.isDrivingCar = Math.random() > 0.5;

            System.out.println("本店叫做" + littleSuperMarket.superMarketName);
            System.out.println("本店位于" + littleSuperMarket.address);
            System.out.println("本店有商品" + littleSuperMarket.merchandises.length + "种");
            System.out.println("本店共有停车位" + littleSuperMarket.parkingCount + "个");

            double totalSold = 0;
            while (true) {
                if (customer.isDrivingCar) {
                    if (littleSuperMarket.parkingCount > 0) {
                        littleSuperMarket.parkingCount--;
                        System.out.println("欢迎顾客" + customer.name + "驾车而来" + "本店提供免费停车位，您的车位编号为" + littleSuperMarket.parkingCount);
                    } else {
                        System.out.println("本店停车位已满，欢迎下次光临");
                        continue;
                    }
                } else {
                    System.out.println("欢迎" + customer.name + "光临");
                }
                System.out.println("请输入商品编号");
                int index = scanner.nextInt();
                if (index<0){
                    break;//非常重要，如果while循环不能跳出那么将不能使用while循环里的变量
                }
                System.out.println("您选择的商品为" + all[index].name + "单价为" + all[index].soldPrice + "。请输入您要购买几个");
                int numToBuy = scanner.nextInt();
                totalSold += numToBuy * all[index].soldPrice;
                System.out.println("您购买了" + numToBuy + "个" + all[index].name + "，总价为" + totalSold);
                all[index].count -= numToBuy;
                littleSuperMarket.merchandiseSold[index] = numToBuy;
                ;
            }
            customer.money -= totalSold;
        }



    }
}
