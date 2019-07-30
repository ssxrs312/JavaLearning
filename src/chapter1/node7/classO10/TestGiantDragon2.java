package chapter1.node7.classO10;

public class TestGiantDragon2 {
    public static void main(String[] args) {
        //通过new实例化会报错
//      GiantDragon2 g = new GiantDragon2();

        //只能通过getInstance得到对象

        GiantDragon2 g1 = GiantDragon2.getInstance();
        GiantDragon2 g2 = GiantDragon2.getInstance();
        GiantDragon2 g3 = GiantDragon2.getInstance();

        //都是同一个对象
        System.out.println(g1==g2);
        System.out.println(g1==g3);
    }
}
