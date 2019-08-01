package chapter1.node8.interfaceE6;

import chapter1.node8.interfaceE3.Item;
import chapter1.node8.interfaceE3.LifePotion;

public class ADHero3 extends Hero {

    int moveSpeed = 400; // 移动速度

    public int getMoveSpeed() {
        return this.moveSpeed;
    }

    public int getMoveSpeed2() {
        return super.moveSpeed;
    }

    // 重写useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }

    public static void main(String[] args) {
        ADHero3 h = new ADHero3();

        LifePotion lp = new LifePotion();

        h.useItem(lp);

    }
}
