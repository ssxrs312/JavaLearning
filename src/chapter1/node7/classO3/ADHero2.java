package chapter1.node7.classO3;

public class ADHero2 extends Hero {
    /* 可变数量的参数
   如果要攻击更多的英雄，就需要设计更多的方法，这样类会显得很累赘，像这样：
   public void attack(Hero h1)
   public void attack(Hero h1,Hero h2)
   public void attack(Hero h1,Hero h2,Hero h3)
   这时，可以采用可变数量的参数
   只需要设计一个方法
   public void attack(Hero ...heros)
   即可代表上述所有的方法了
   在方法里，使用操作数组的方式处理参数heros即可

    */

    public void attack() {
        System.out.println(name + " 进行了一次攻击 ，但是不确定打中谁了");
    }

    // 可变数量的参数
    public void attack(Hero... heros) {
        for (int i = 0; i < heros.length; i++) {
            System.out.println(name + " 攻击了 " + heros[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";

        Hero h1 = new Hero();
        h1.name = "盖伦";
        Hero h2 = new Hero();
        h2.name = "提莫";

        bh.attack(h1);
        bh.attack(h1, h2);
    }
}
