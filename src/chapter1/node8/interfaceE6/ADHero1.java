package chapter1.node8.interfaceE6;

public class ADHero1 extends Hero{

    public ADHero1(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }

    public static void main(String[] args) {
        new ADHero1("德莱文");
    }
}
