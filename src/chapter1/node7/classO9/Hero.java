package chapter1.node7.classO9;
/* 对象属性初始化
对象属性初始化有3种
1. 声明该属性的时候初始化
2. 构造方法中初始化
3. 初始化块

 */

public class Hero {

    public String name = "some hero"; //声明该属性的时候初始化
    protected float hp;
    float maxHP;

    {
        maxHP = 200; //初始化块
    }

    public Hero(){
        hp = 100; //构造方法中初始化

    }
    /* 类属性初始化
    类属性初始化有2种
    1. 声明该属性的时候初始化
    2. 静态初始化块
     */
    //物品栏的容量
    public static int itemCapacity=8; //声明的时候 初始化

    static{
        itemCapacity = 6;//静态初始化块 初始化
    }

    public static void main(String[] args) {
        System.out.println(Hero.itemCapacity);
    }
}
