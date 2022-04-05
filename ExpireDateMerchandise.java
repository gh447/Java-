package com.geekbang.supermarket;

import java.util.Date;

//>>TODO 缺省的实现方法用default修饰，可以有方法体
public interface ExpireDateMerchandise {
    /**
     * 截止到目前商品保质期天数是否超过传递的天数
     *
     * @param days 截止到目前，保质期超过这么多天
     * @return 截止到当前，true如果保质期天数比参数长，false如果保质期不到这么多天
     */
    default boolean notExpireInDays(int days) {
        return daysBeforeExpire() > days;
    }

    /**
     * 商品生产日期
     *
     * @return
     */
    Date getProduceDate();

    /**
     * @return
     */
    Date getExpireDate();

    default double leftDatePercentage() {
        return 1.0 * daysBeforeExpire() / (daysBeforeExpire()+daysAfterProduce());
    }

    /**
     * 根据剩余有效期的百分比，得出商品现在实际的价值
     *
     * @param leftDatePercentage
     * @return 剩余的实际的价值
     */
    double actualValueNow(double leftDatePercentage);

    //>>TODO 接口里可以有私有的方法，不需要用default修饰
    //>>TODO 接口里的私有方法，可以认为是代码直接插入到使用的地方
    private long daysBeforeExpire() {
        long expireMs = getExpireDate().getTime();
        long left = expireMs - System.currentTimeMillis();
        if (left < 0) {
            return -1;
        }
        return left / (24 * 3600 * 1000);
    }

    private long daysAfterProduce() {
        long produceMs = getProduceDate().getTime();
        long left = System.currentTimeMillis() - produceMs;
        if (left < 0) {
            return -1;
        }
        return left / (04 * 3600 * 1000);
    }
}
