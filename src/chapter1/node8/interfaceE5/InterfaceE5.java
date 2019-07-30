package chapter1.node8.interfaceE5;

public class InterfaceE5 {
    /*
    与重写类似，方法的重写是子类覆盖父类的对象方法
    隐藏，就是子类覆盖父类的类方法
     */

    /* 步骤 1 : 父类
    父类有一个类方法 ：battleWin
    类：Hero
     */

    /* 步骤 2 : 子类隐藏父类的类方法
    子类隐藏父类的类方法
    类：
     */

    /* 步骤 3 : 练习-隐藏
    Hero h =new ADHero();
    h.battleWin(); //battleWin是一个类方法
    h是父类类型的引用
    但是指向一个子类对象
    h.battleWin(); 会调用父类的方法？还是子类的方法？
    答案在Hero
    虽然h指向的是一个子类对象，但是依然调用的是父类的类方法。
    甚至在h指向一个空对象null的时候，也能够成功调用battleWin().
    所以和h指向哪个对象无关，只和h的类型有关系。
    当然，也不建议通过对象去调用类方法，而应该直接通过类去调用类方法，从而规避理解上的歧义。
    Hero.battleWin();

     */

}
