package chapter1.node8.interfaceE11;

public class InterfaceE11 {
    /* 步骤 1 : 什么是默认方法
    默认方法是JDK8新特性，指的是接口也可以提供具体方法了，而不像以前，只能提供抽象方法
    Mortal 这个接口，增加了一个默认方法 revive，这个方法有实现体，并且被声明为了default
    类：Mortal
     */

    /* 步骤 2 : 为什么会有默认方法
    假设没有默认方法这种机制，那么如果要为Mortal增加一个新的方法revive,那么所有实现了Mortal接口的类，都需要做改动。
    但是引入了默认方法后，原来的类，不需要做任何改动，并且还能得到这个默认方法
    通过这种手段，就能够很好的扩展新的类，并且做到不影响原来的类
     */

    /* 步骤 3 : 练习-默认方法
    为AD接口增加一个默认方法 attack()
    为AP接口也增加一个默认方法 attack()
    问： ADAPHero同时实现了AD,AP接口，那么 ADAPHero 对象调用attack()的时候，是调用哪个接口的attack()?
    回答：作为同时继承了AD和AP中的 默认方法attack，就必须在实现类中重写该方法
    从而免去到底调用哪个接口的attack方法这个模棱两可的问题
     */


}
