package chapter1.node7.classO4;

/*
通过一个类创建一个对象，这个过程叫做实例化
实例化是通过调用构造方法(又叫做构造器)实现的
什么是构造方法
方法名和类名一样（包括大小写）
没有返回类型
实例化一个对象的时候，必然调用构造方法
 */
public class Hero {

    String name;

    float hp;

    float armor;

    int moveSpeed;

    // 方法名和类名一样（包括大小写）
    // 没有返回类型
    public Hero() {
        System.out.println("实例化一个对象的时候，必然调用构造方法");
    }

    public static void main(String[] args) {
        //实例化一个对象的时候，必然调用构造方法
        Hero h = new Hero();
    }
}
