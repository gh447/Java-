package com.geekbang.supermarket;

public class ReferenceAssign {
    public static void main(String[] args) {
        Phone ph = new Phone("手机001", "Phone001", 100, 1999, 999,
                4.5, 3.5, 4, 128, "索尼", "安卓");
        //>>TODO 可以用子类的引用给父类赋值，也就是说，父类的引用可以指向子类的对象
         MerchandiseV2 m = ph;
         MerchandiseV2 m2 = new Phone("手机002","Phone002",100,1999,999,
                 4.5,3.5,4,128,"索尼","安卓");
         //>>TODO 但是反之不行，不能让子类的对象指向父类的引用，。因为父类没有子类的属性和方法

//        Phone notDoable = new MerchandiseV2();
        //TODO 因为子类继承了父类的属性和对象，所以父类对象能做到的子类对象一定能做到
        //TODO 换句话说，我们可以在子类的对象上，执行父类的方法
        //TODO 当父类的引用指向子类的实例（或父类的实例），只能通过父类的引用，像父类一样操作子类的对象
        //TODO 也就是说“名”的类型，决定了能执行哪些操作

        //TODO ph和m都指向同一个对象，通过ph可以调用getBrand的方法
        //TODO 因为ph的类型是Phone，Phone里定义了getBrand的方法
        ph.getBrand();
        //TODO ph和m都指向同一个对象，但是通过m就不能调用getBrand方法
        //TODO 因为m的类型是MerchandiseV2，MerchandiseV2里没有定义getBrand的方法
        //m.getBrand;

        //TODO 如果确定一个父类的引用指向的对象，实际上就是一个子类的对象（或者子类的子类的对象），可以强制类型转换
        Phone aphone = (Phone) m2;

        //TODO MerchandiseV2是Phone的父类，Phone是ShellColorChangePhone的父类
        ShellColorChangePhone shellColorChangePhone = new ShellColorChangePhone(
                "手机002","Phone002",100,1999,999,
                4.5,3.5,4,128,"索尼","安卓"
        );
        //TODO 父类的引用，可以指向子类的对象，即可以用子类（以及子类的子类）的引用给父类的引用赋值
        MerchandiseV2 ccm = shellColorChangePhone;

        //TODO 父类的引用，可以指向子类的对象
        //TODO 确定MerchandiseV2的引用ccm是指向的是Phone或者Phone的子类对象，那么可以强制类型转换
        Phone ccp = (Phone)ccm;

        //TODO 确定MerchandiseV2的引用ccm指向的是ShellColorChangePhone或者ShellColorChangePhone的子类对象
        //TODO 那么可以强制类型转换
        ShellColorChangePhone scp = (ShellColorChangePhone) ccm;
        //TODO 会出错，因为m2指向的是一个Phone类型的对象，不是ShellColorChangePhone的对象
        ShellColorChangePhone notCCP = (ShellColorChangePhone) m2;
    }
}

