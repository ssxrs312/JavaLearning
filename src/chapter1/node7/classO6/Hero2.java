package chapter1.node7.classO6;

public class Hero2 {
    /* 引用与=
    如果一个变量是基本类型
    比如 int hp = 50;
    我们就直接管hp叫变量
    =表示赋值的意思。
    如果一个变量是类类型
    比如 Hero h = new Hero();
    我们就管h叫做引用。
    =不再是赋值的意思
    =表示指向的意思
    比如 Hero h = new Hero();
    这句话的意思是
    引用h，指向一个Hero对象

     */

    /* 类类型传参,我的理解叫对象传参
    类类型又叫引用
    第49行的引用 teemo与 第42行的引用hero，是不同的引用
    通过调用garen.attack(teemo, 100); 使得这两个引用都指向了同一个对象
    所以在第43行hero.hp = hero.hp - damage; 就使得该对象的hp值，发生了变化
    因此第50行，打印该对象的Hp值就是变化后的值

     */
    String name; // 姓名

    float hp; // 血量

    float armor; // 护甲

    int moveSpeed; // 移动速度

    public Hero2(String name, float hp) {
        this.name = name;
        this.hp = hp;
    }

    // 攻击一个英雄，并让他掉damage点血
    public void attack(Hero2 hero, int damage) {
        hero.hp = hero.hp - damage;
    }

    public static void main(String[] args) {
        Hero2 teemo = new Hero2("提莫", 383);
        Hero2 garen = new Hero2("盖伦", 616);
        garen.attack(teemo, 100);
        System.out.println(teemo.hp);
    }

}
