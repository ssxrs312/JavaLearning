package chapter1.node8.interfaceE6;

public class InterfaceE6 {
    /*
    super关键字,子类可以通过super调用父类的属性、有参构造方法、方法
     */

    /* 步骤 1 : 准备一个显式提供无参构造方法的父类
    准备显式提供无参构造方法的父类
    在实例化Hero对象的时候，其构造方法会打印
    “Hero的构造方法 "
    类：Hero
     */

    /* 步骤 2 : 实例化子类，父类的构造方法一定会被调用
    实例化一个ADHero(), 其构造方法会被调用
    其父类的构造方法也会被调用
    并且是父类构造方法先调用
    子类构造方法会默认调用父类的 无参的构造方法
    类：ADHero
     */

    /* 步骤 3 : 父类显式提供两个构造方法
    分别是无参的构造方法和带一个参数的构造方法
    类：Hero
    增加如下部分
    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
     */

    /* 步骤 4 : 子类显式调用父类带参构造方法
    使用关键字super 显式调用父类带参的构造方法
    类：ADHero1
     */

    /* 步骤 5 : 调用父类属性
    通过super调用父类的moveSpeed属性
    ADHero也提供了属性moveSpeed
    public int getMoveSpeed(){
   return this.moveSpeed;
    }
    public int getMoveSpeed2(){
       return super.moveSpeed;
    }
    类：ADHero2
     */

    /* 步骤 6 : 调用父类方法
    ADHero3重写了useItem方法，并且在useItem中通过super调用父类的useItem方法
    类：ADHero3
     */

    /* 步骤 7 : 练习-super
    父类Hero提供了一个有参的构造方法:
    public Hero(String name){
      this.name = name;
    }
    但是没有提供无参的构造方法
    子类应该怎么处理？
    作为子类，无论如何 都会调用父类的构造方法。
    默认情况下，会调用父类的无参的构造方法。
    但是，当父类没有无参构造方法的时候( 提供了有参构造方法，并且不显示提供无参构造方法)，子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
    这个时候，必须通过super去调用父类声明的、存在的、有参的构造方法
    类：Hero1
    ADHero4
     */





}
