package chapter1.node7.classO5;

public class Hero3 {
    // 通过this调用其他的构造方法
    //如果要在一个构造方法中，调用另一个构造方法，可以使用this()
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public Hero3(String name){
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    //带两个参数的构造方法
    public Hero3(String name,float hp){
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero3 teemo =  new Hero3("提莫",383);

        System.out.println(teemo.name);

    }
}
