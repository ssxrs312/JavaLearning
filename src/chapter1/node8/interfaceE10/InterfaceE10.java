package chapter1.node8.interfaceE10;

public class InterfaceE10 {
    /*
    内部类分为四种：
    非静态内部类
    静态内部类
    匿名类
    本地类
     */

    /* 步骤 1 : 非静态内部类
    非静态内部类 BattleScore “战斗成绩”
    非静态内部类可以直接在一个类里面定义

    比如：
    战斗成绩只有在一个英雄对象存在的时候才有意义
    所以实例化BattleScore 的时候，必须建立在一个存在的英雄的基础上
    语法: new 外部类().new 内部类()
    作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
    类：Hero
     */

    /* 步骤 2 : 静态内部类
    在一个类里面声明一个静态内部类
    比如敌方水晶，当敌方水晶没有血的时候，己方所有英雄都取得胜利，而不只是某一个具体的英雄取得胜利。
    与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
    语法：new 外部类.静态内部类();
    因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
    除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别
    类：Hero1
     */

    /* 步骤 3 : 匿名类
    匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
    通常情况下，要使用一个接口或者抽象类，都必须创建一个子类
    有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
    既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
    这样的类，叫做匿名类
    类：Hero2
     */

    /* 步骤 4 : 本地类
    本地类可以理解为有名字的匿名类
    内部类与匿名类不一样的是，内部类必须声明在成员的位置，即与属性和方法平等的位置。
    本地类和匿名类一样，直接声明在代码块里面，可以是主方法，for循环里等等地方
    类：Hero3
     */

    /* 步骤 5 : 在匿名类中使用外部的局部变量
    在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
    为什么要声明为final，其机制比较复杂，请参考第二个Hero代码中的解释
    注：在jdk8中，已经不需要强制修饰成final了，如果没有写final，不会报错，因为编译器偷偷的帮你加上了看不见的final
    类：Hero4、Hero5
     */

    /* 步骤 6 : 练习-内部类
    创建一个Item的匿名类
    Item有抽象方法disposable(), 就像抽象类练习 中要求的那样。
    类：Item
     */






}
