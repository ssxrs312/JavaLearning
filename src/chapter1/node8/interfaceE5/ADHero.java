package chapter1.node8.interfaceE5;

public class ADHero extends Hero {

    //隐藏父类的battleWin方法
    public static void battleWin(){
        System.out.println("ad hero battle win");
    }

    public static void main(String[] args) {
        Hero.battleWin();
        ADHero.battleWin();
    }

}
