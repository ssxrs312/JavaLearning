package chapter1.node8.interfaceE10;

public abstract class Hero2 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public abstract void attack();

    public static void main(String[] args) {

        ADHero adh=new ADHero();
        //通过打印adh，可以看到adh这个对象属于ADHero类
        adh.attack();
        System.out.println(adh);

        Hero2 h = new Hero2(){    //声明的同时实例化
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();

        //通过打印h，可以看到h这个对象属于Hero2$1这么一个系统自动分配的类名
        System.out.println(h);
    }
}
