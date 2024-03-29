package chapter1.node7.classO8;

/*
类方法： 又叫做静态方法
对象方法： 又叫实例方法，非静态方法
访问一个对象方法，必须建立在有一个对象的前提的基础上
访问类方法，不需要对象的存在，直接就访问
 */
public class Hero {
    public String name;
    protected float hp;

    //实例方法,对象方法，非静态方法
    //必须有对象才能够调用
    public void die(){
        hp = 0;
    }

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("battle win");
    }

    public static void main(String[] args) {
        Hero garen =  new Hero();
        garen.name = "盖伦";
        //必须有一个对象才能调用
        garen.die();

        Hero teemo =  new Hero();
        teemo.name = "提莫";

        //无需对象，直接通过类调用
        Hero.battleWin();

    }

    /* 调用类方法
    和访问类属性一样，调用类方法也有两种方式
    1. 对象.类方法
    garen.battleWin();
    2. 类.类方法
    Hero.battleWin();
    这两种方式都可以调用类方法，但是建议使用第二种 类.类方法 的方式进行，这样更符合语义上的理解。
    并且在很多时候，并没有实例，比如在前面练习的时候用到的随机数的获取办法
    Math.random()
    random()就是一个类方法，直接通过类Math进行调用，并没有一个Math的实例存在。
     */

    /* 什么时候设计对象方法，什么时候设计类方法
    如果在某一个方法里，调用了对象属性，比如
    public String getName(){
            return name;
        }
    name属性是对象属性，只有存在一个具体对象的时候，name才有意义。 如果方法里访问了对象属性，那么这个方法，就必须设计为对象方法
    如果一个方法，没有调用任何对象属性，那么就可以考虑设计为类方法，比如
    public static void printGameDuration(){
            System.out.println("已经玩了10分50秒");
        }
    printGameDuration 打印当前玩了多长时间了，不和某一个具体的英雄关联起来，所有的英雄都是一样的。 这样的方法，更带有功能性色彩
    就像取随机数一样，random()是一个功能用途的方法
    Math.random()
     */

    /* 练习-类方法
    在一个类方法中，直接调用一个对象方法，
    比如在battleWin中调用die()
    能否直接调用？ 为什么？
     */

    //答案：不能，因为调用battleWin()的时候，很可能没有任何具体对象，然而die()是一个对象方法，必须建立在有对象的前提下。

}
