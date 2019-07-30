package chapter1.node8.interfaceE4;

public class ADHero extends Hero implements Mortal {

    @Override
    public void die() {
        System.out.println("物理攻击英雄die");
    }
}
