public class MerchandiseV2 {
    public String name;
    public String id;
    public int count;
    public double soldPrice;
    public double purchasePrice;

    public void discribe(){
        System.out.println("商品名字是"+name+"商品id是"+id +"商品库存为"+count+"商品进价为"+
                purchasePrice+"商品售价为"+purchasePrice+"商品利润为"+(soldPrice-purchasePrice));
    }

    public  double calculateProfit(){
        double profit = soldPrice-purchasePrice;
        if (profit<+0){
            return 0;
        }
        return profit;
    }

    public double getCurrentCount(){
        return count;
    }

}
