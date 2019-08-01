package chapter1.node8.interfaceE7;

public class Hero1 {
    public String name;
    protected float hp;

    public String toString(){
        return name;
    }

    public static void main(String[] args) {

        Hero1 h = new Hero1();
        h.name = "盖伦";

        System.out.println(h.toString());
        //直接打印对象就是打印该对象的toString()返回值
        System.out.println(h);
    }

}
