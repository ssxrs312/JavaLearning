package chapter1.node8;

public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println(name+" 加了一口血");
    }
}
