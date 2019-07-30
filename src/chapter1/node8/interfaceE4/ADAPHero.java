package chapter1.node8.interfaceE4;

public class ADAPHero extends Hero implements Mortal {
    @Override
    public void die() {
        System.out.println("兼具物理+魔法的英雄die");
    }
}
