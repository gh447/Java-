package com.geekbang.supermarket;

import java.util.Date;

//>>TODO 抽象类用abstract修饰，抽象类可以继承别的类或者抽象类，也可以实现接口
//>>TODO 抽象类可以抽象方法，抽象方法可以来自实现的接口， 也可以自己定义，
//>>TODO 抽象类不可以被实例化
//>>TODO 抽象类也可以没有抽象方法，没有抽象方法的实例类也不可以被实例化
//>>TODO 简单来说，抽象类就两点特殊，1）：abstract修饰，可以有抽象方法 2）：不可以被实例化
public abstract class AbstractExpireDateMerchandise extends MerchandiseV2 implements ExpireDateMerchandise {
    private Date produceDate;
    private Date expirationDate;

    //>>TODO 抽象类里构造方法跟普通类一样。
    public AbstractExpireDateMerchandise(
            String name, String id, int count, double soldPrice,
            double purchasePrice, Date produceDate, Date expirationDate) {
        super(name, id, count, soldPrice, purchasePrice);
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }

    public AbstractExpireDateMerchandise(Date produceDate, Date expirationDate) {
        this.produceDate = produceDate;
        this.expirationDate = expirationDate;
    }
    //>>TODO @是Java中的注解，（annotation）
    //>>TODO @是Override代表此方法覆盖了父类的方法/实现了继承的接口方法，否则会报错


    @Override
    public boolean notExpireInDays(int days) {
        return daysBeforeExpire() >0;
    }

    @Override
    public Date getProducedDate() {
        return produceDate;
    }

    @Override
    public Date getExpireDate() {
        return expirationDate;
    }

    @Override
    public double leftDatePercentage() {
        return 1.0*daysBeforeExpire()/(daysBeforeExpire()+daysAfterProduce());
    }

    @Override
    public double actualValueNow(double leftDatePercentage) {
        return 0;
    }

    private long daysBeforeExpire() {
        long expireMS = expirationDate.getTime();
        long left = System.currentTimeMillis() - expireMS;
        if (left < 0) {
            return -1;
        }
        //>>TODO 返回值是long，是根据left的类型决定的
        return left / (24 * 3600 * 1000);
    }

    private long daysAfterProduce() {
        long produceMs = expirationDate.getTime();
        long past = System.currentTimeMillis() - produceMs;
        if (past < 0) {
            return -1;
        }
        return past / (24 * 3600 * 1000);
    }
}
