package chapter1.node8.interfaceE7;

public class Hero3 {
    public String name;
    protected float hp;

    public boolean equals(Object o){
        if(o instanceof Hero3){   //判断引用o指向的对象是否是Hero3，2个对象的内容是否相同。相同返回true
            Hero3 h = (Hero3) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero3 h1= new Hero3();
        h1.hp = 300;
        Hero3 h2= new Hero3();
        h2.hp = 400;
        Hero3 h3= new Hero3();
        h3.hp = 300;

        System.out.println(h1.equals(h2));//判断2个对象的内容是否相同
        System.out.println(h1.equals(h3));
    }
}
