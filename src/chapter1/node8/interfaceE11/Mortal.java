package chapter1.node8.interfaceE11;

public interface Mortal {
    public void die();

    default public void revive() {
        System.out.println("本英雄复活了");
    }
}
