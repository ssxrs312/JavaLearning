package chapter1.node7.classO4;
/* 构造方法的重载
和普通方法一样，构造方法也可以重载
 */
public class Hero4 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    //带一个参数的构造方法
    public Hero4(String heroname){
        name = heroname;
    }

    //带两个参数的构造方法
    public Hero4(String heroname,float herohp){
        name = heroname;
        hp = herohp;
    }

    public static void main(String[] args) {
        Hero4 garen = new Hero4("盖伦");
        Hero4 teemo = new Hero4("提莫",383);
    }
}
