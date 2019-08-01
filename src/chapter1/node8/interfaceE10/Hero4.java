package chapter1.node8.interfaceE10;

public abstract class Hero4 {

    public abstract void attack();

    public static void main(String[] args) {

        //在匿名类中使用外部的局部变量，外部的局部变量必须修饰为final
        final int damage = 5;

        Hero4 h = new Hero4(){
            public void attack() {
                System.out.printf("新的进攻手段，造成%d点伤害",damage );
            }
        };

        h.attack();

    }

}
