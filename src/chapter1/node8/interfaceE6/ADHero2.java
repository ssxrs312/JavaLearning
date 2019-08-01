package chapter1.node8.interfaceE6;

public class ADHero2 extends Hero {

    int moveSpeed=400; //移动速度

    public int getMoveSpeed(){
        return this.moveSpeed;
    }

    public int getMoveSpeed2(){
        return super.moveSpeed;
    }

    public static void main(String[] args) {
        ADHero2 h= new ADHero2();

        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());

    }
}
