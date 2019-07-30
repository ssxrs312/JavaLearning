package chapter1.node8.interfaceE3;

//子类LifePotion继承Item,同时也提供了方法effect
public class LifePotion extends Item{

    @Override
    public void effect() {
        System.out.println("血瓶使用后，可以回血");
    }
}
