package chapter1.node7.classO7;

/*
当一个属性被static修饰的时候，就叫做类属性，又叫做静态属性
当一个属性被声明成类属性，那么所有的对象，都共享一个值
与对象属性对比：
不同对象的 对象属性 的值都可能不一样。
比如盖伦的hp 和 提莫的hp 是不一样的。
但是所有对象的类属性的值，都是一样的
 */
public class Hero {
    /* 类属性
    类属性： 又叫做静态属性
    对象属性： 又叫实例属性，非静态属性
    如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
    给英雄设置一个类属性叫做“版权" (copyright), 无论有多少个具体的英雄，所有的英雄的版权都属于 Riot Games公司。
     */
    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";

        Hero.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        Hero teemo =  new Hero();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);

        garen.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(teemo.copyright);

    }

    /*
    访问类属性有两种方式
    1. 对象.类属性
    teemo.copyright
    2. 类.类属性
    Hero.copyright
    这两种方式都可以访问类属性，访问即修改和获取，但是建议使用第二种 类.类属性 的方式进行，这样更符合语义上的理解
     */

    /*
    什么时候使用对象属性，什么时候使用类属性
    如果一个属性，每个英雄都不一样，比如name，这样的属性就应该设计为对象属性，因为它是跟着对象走的，每个对象的name都是不同的
    如果一个属性，所有的英雄都共享，都是一样的，那么就应该设计为类属性。比如血量上限，所有的英雄的血量上限都是 9999，不会因为英雄不同，而取不同的值。
    这样的属性，就适合设计为类属性
     */

    /* 练习-类属性
    通过garen.copyright修改其值
    garen.copyright = "Blizzard Entertainment Enterprise";
    然后打印teemo.copyright，观察是否有变化
     */
    //答案：会变化，因为类属性只有一个，不同的对象都共享这么一个类属性

}
