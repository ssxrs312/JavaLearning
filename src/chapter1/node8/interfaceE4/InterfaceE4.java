package chapter1.node8.interfaceE4;

public class InterfaceE4 {
    /*
    操作符的多态
    + 可以作为算数运算，也可以作为字符串连接

    类的多态
    父类引用指向子类对象
     */

    /*
    示例 1 : 操作符的多态
    同一个操作符在不同情境下，具备不同的作用
    如果+号两侧都是整型，那么+代表 数字相加
    如果+号两侧，任意一个是字符串，那么+代表字符串连接
    类：chapter1.node8.interfaceE4.Hero
     */

    /*
    示例 2 : 观察类的多态现象
    观察类的多态现象：
    1. i1和i2都是Item类型
    2. 都调用effect方法
    3. 输出不同的结果

    多态: 都是同一个类型，调用同一个方法，却能呈现不同的状态
    类：chapter1.node8.interfaceE4.Item
    chapter1.node8.interfaceE4.LiftPotion
    chapter1.node8.interfaceE4.MagicPotion

     */

    /*
    示例 3 : 类的多态条件
    要实现类的多态，需要如下条件
    1. 父类（接口）引用指向子类对象
    2. 调用的方法有重写
     */

    /*
    不使用多态与使用多态的区别：使用多态后，同一个方法可以实现不同的功能，而不使用多态的话，要实现不同的功能，需要重新写一遍方法
     */

    /* 练习-多态
    1. 设计一个接口
    接口叫做Mortal,其中有一个方法叫做die
    2. 实现接口
    分别让ADHero,APHero,ADAPHero这三个类，实现Mortal接口，不同的类实现die方法的时候，都打印出不一样的字符串
    3. 为Hero类，添加一个方法,在这个方法中调用 m的die方法。
    public void kill(Mortal m)
    4. 在主方法中
    首先实例化出一个Hero对象:盖伦
    然后实例化出3个对象，分别是ADHero,APHero,ADAPHero的实例
    然后让盖伦 kill 这3个对象
    类：Motal
    ADHero
    APHero
    ADAPHero
    Hero
    AD
    AP
     */
}
