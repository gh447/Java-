package com.geekbang;

import com.geekbang.supermarket.LittleSuperMarket;

public class PolymorphismAppMainComplex {
    public static void main(String[] args) {
        LittleSuperMarket superMarket = new LittleSuperMarket("大卖场",
                "世纪大道1号",100,600,100);
        //TODO 不仅如此，我们看一个更复杂的例子，describe方法，
        //TODO MerchandiseV2里的describe方法调用了calculateProfit方法
        //TODO Phone里的describe方法覆盖了父类MerchandiseV2的describe方法，并且使用super调用了父类的describe方法
        //TODO ShellColorChangePhone里的describe方法，覆盖了父类Phone里的describe方法，并且使用super调用了父类的describe方法
        //TODO 更复杂的是i，ShellColorChangePhone还覆盖了简洁父类的calculate方法
        superMarket.getMerchandiseOf(0).describe();
        System.out.println();
        superMarket.getMerchandiseOf(10).describe();
        System.out.println();
        superMarket.getMerchandiseOf(100).describe();

        //TODO 总结：无论一个方法是哪个引用调用的，它都是在实际对象上执行的，执行的任何一个方法都是这个对象所属的类的方法
        //TODO 如果没有就去父类找，一次寻找，直到找到

        //TODO 换个角度理解，我们一直说子类里有一个特殊的父类的对象，这时候，这个特殊的父类对象里的this自引用，是子类的引用，
        //TODO 那么自然地，即使在继承自父类代码里，去调用一个方法，也是从子类开始，一层层继承关系去寻找

        //TODO 这也是Java选择单继承的原因之一，在多继承的情况之下，如果使用不当，多态可能会非常复杂，以至于使用的代价超过带来的好处
    }
}
