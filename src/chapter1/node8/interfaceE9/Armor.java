package chapter1.node8.interfaceE9;

public class Armor extends Item {
    int ac; //护甲等级

    @Override
    public boolean disposable() {
        return false;
    }
}
