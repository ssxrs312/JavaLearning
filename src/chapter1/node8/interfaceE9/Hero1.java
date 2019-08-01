package chapter1.node8.interfaceE9;

public abstract class Hero1 {
    String name;

    float hp;

    float armor;

    int moveSpeed;

    public static void main(String[] args) {
        //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
//        Hero h= new Hero();
    }
}
