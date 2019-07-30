package chapter1.node7.classO4;

/* 如果提供了一个有参的构造方法
一旦提供了一个有参的构造方法
同时又没有显式的提供一个无参的构造方法
那么默认的无参的构造方法，就“木有了“

 */
public class Hero3 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //有参的构造方法
    //默认的无参的构造方法就失效了
    public Hero3(String heroname){
        name = heroname;
    }

    public static void main(String[] args) {
        Hero3 garen = new Hero3("盖伦");

//        Hero3 teemo = new Hero3();//无参的构造方法“木有了”

    }
}
