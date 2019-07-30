package chapter1.node7.classO5;
/* 练习-构造方法(this)
参考练习-构造方法 设计一个构造方法,但是参数名称不太一样，分别是
String name
float hp
float armor
int moveSpeed

不仅如此，在这个构造方法中，调用这个构造方法
public Hero(String name,float hp)
 */
public class Hero4 {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public Hero4() {
    }

    // 带一个参数的构造方法
    public Hero4(String name) {
        System.out.println("一个参数的构造方法");
        this.name = name;
    }

    // 带两个参数的构造方法
    public Hero4(String name, float hp) {
        this(name);
        System.out.println("两个参数的构造方法");
        this.hp = hp;
    }

    // 带有四个参数的构造方法
    public Hero4(String name, float hp, float armor, int moveSpeed) {
        this(name,hp);
        this.armor = armor;
        this.moveSpeed = moveSpeed;
    }

    public static void main(String[] args) {
        Hero4 teemo = new Hero4("提莫", 383);
        System.out.println(teemo.name);
        Hero4 db =  new Hero4("死哥",400,27,360);
        System.out.println(db.moveSpeed);
    }
}
