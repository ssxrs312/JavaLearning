package chapter1.node8.interfaceE4;

public class Hero {
    public String name;
    protected float hp;

    public void kill(Mortal m){
        m.die();
    }

    public static void main(String[] args) {

        int i = 5;
        int j = 6;
        int k = i+j; //如果+号两侧都是整型，那么+代表 数字相加

        System.out.println(k);

        int a = 5;
        String b = "5";

        String c = a+b; //如果+号两侧，任意一个是字符串，那么+代表字符串连接
        System.out.println(c);

        System.out.println("=======");

        Hero garen = new Hero();
        //然后实例化出3个对象，分别是ADHero,APHero,ADAPHero的实例
        ADHero ad = new ADHero();
        APHero ap = new APHero();
        ADAPHero adap = new ADAPHero();
        //然后让盖伦 kill 这3个对象
        garen.kill(ad);
        garen.kill(ap);
        garen.kill(adap);

    }
}
