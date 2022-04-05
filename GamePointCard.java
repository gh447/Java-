package com.geekbang.supermarket;

import java.util.Date;
//>>TODO 实现有缺省方法的接口后，面对每个缺省的方法，一个类可以有三种选择
//>>TODO 1): 默默继承，相当于把这一部分代码拷贝到当前类中
//>>TODO 2): 重新声明此方法为abstract，相当于把这部分代码拒之门外，但是有abstract的方法必须是抽象的
//>>TODO 3):覆盖，重新实现

public class GamePointCard extends MerchandiseV2 implements ExpireDateMerchandise, ExpireDateMerchandiseDup, VirtualMerchandise {
    private Date produceDate;
    private Date expirationDate;

    public GamePointCard(String name, String id, int count, double soldPeice, double purchasePrice, Date produceDate, Date expirationDate){
        super(name,id,count,soldPeice,purchasePrice);
        this.expirationDate = expirationDate;
        this.produceDate = produceDate;
    }

    @Override
    public Date getProduceDate() {
        return produceDate;
    }

    @Override
    public Date getExpireDate() {
        return expirationDate;
    }

    @Override
    public double actualValueNow(double leftDatePecentage) {
        return super.getSoldPrice();
    }
}
