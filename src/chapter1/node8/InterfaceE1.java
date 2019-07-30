package chapter1.node8;

/*
在设计LOL的时候，进攻类英雄有两种，一种是进行物理系攻击，一种是进行魔法系攻击
这时候，就可以使用接口来实现这个效果。
接口就像是一种约定，我们约定某些英雄是物理系英雄，那么他们就一定能够进行物理攻击。
 */
public class InterfaceE1 {

    /* 物理攻击接口
    创建一个接口 File->New->Interface
    AD ，声明一个方法 physicAttack 物理攻击，但是没有方法体，是一个“空”方法
    接口：chapter1.node8.AD
     */

    /* 设计一类英雄，能够使用物理攻击
    设计一类英雄，能够使用物理攻击，这类英雄在LOL中被叫做AD
    类：ADHero
    继承了Hero 类，所以继承了name,hp,armor等属性，类：chapter1.node8.Hero
    实现某个接口，就相当于承诺了某种约定
    所以，实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack()
    实现在语法上使用关键字 implements
    类：chapter1.node8.ADHero

     */

    /* 魔法攻击接口
    创建一个接口 File->New->Interface
    AP ，声明一个方法 magicAttack 魔法攻击，但是没有方法体，是一个“空”方法
    接口：chapter1.node8.AP
     */

    /* 设计一类英雄，只能使用魔法攻击
    设计一类英雄，只能使用魔法攻击，这类英雄在LOL中被叫做AP
    类：APHero
    继承了Hero 类，所以继承了name,hp,armor等属性,类：chapter1.node8.Hero
    同时，实现了AP这个接口，就必须提供AP接口中声明的方法magicAttack()
    实现在语法上使用关键字 implements
     */

    /* 设计一类英雄，既能进行物理攻击，又能进行魔法攻击
    一种英雄，能够同时进行物理攻击和魔法攻击
    比如伊泽瑞尔，皮城女警凯特琳
     */

    /* 什么样的情况下该使用接口?
    如上的例子，似乎要接口，不要接口，都一样的，那么接口的意义是什么呢
    学习一个知识点，是由浅入深得进行的。 这里呢，只是引入了接口的概念，要真正理解接口的好处，需要更多的实践，
    以及在较为复杂的系统中进行大量运用之后，才能够真正理解，比如在学习了多态之后就能进一步加深理解。
     */

    /* 练习-接口
    设计一个治疗者接口：Healer
    该接口声明有方法： heal()
    设计一个Support类，代表辅助英雄，继承Hero类，同时实现了Healer这个接口
    接口：chapter1.node8.Healer
    类：chapter1.node8.Support
     */






}
