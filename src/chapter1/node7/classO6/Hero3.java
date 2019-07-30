package chapter1.node7.classO6;
/* 练习-传参
在方法中，使参数引用指向一个新的对象

外面的引用是指向原来的对象？还是新的对象？
 */
public class Hero3 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero3(){

    }

    public Hero3(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    //复活
    public void revive(Hero3 h){
        h = new Hero3("提莫",383);
//        System.out.println(h.hp);
    }

    public static void main(String[] args) {
        Hero3 teemo = new Hero3("提莫", 383);

        //受到400伤害，挂了
        teemo.hp = teemo.hp - 400;

        teemo.revive(teemo);

        //问题： System.out.println(teemo.hp); 输出多少？ 怎么理解？
        System.out.println(teemo.hp);//-17

        /* 答案
        teemo.hp = -17
        h.hp = 383
        heemo代表的提莫死了.
        h代表的提莫诞生了.
        2个对象.不是一回事.
        teemo在栈内存的主方法中.
        h在栈内存的revive复活方法中

         */
    }
}
