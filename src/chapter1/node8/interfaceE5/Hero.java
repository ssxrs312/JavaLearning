package chapter1.node8.interfaceE5;

public class Hero {

    public String name;
    protected float hp;

    //类方法，静态方法
    //通过类就可以直接调用
    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public static void main(String[] args) {
        Hero h =new ADHero();
        h.battleWin();
        h= null;
        h.battleWin();
    }
}
