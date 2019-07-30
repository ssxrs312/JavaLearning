package chapter1.node8.interfaceE4;

public class APHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("魔法攻击英雄die");
    }
}
