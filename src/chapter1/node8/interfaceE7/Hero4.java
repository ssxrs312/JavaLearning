package chapter1.node8.interfaceE7;

public class Hero4 {
    public String name;
    protected float hp;

    public boolean equals(Object o){
        if(o instanceof Hero4){
            Hero4 h = (Hero4) o;
            return this.hp == h.hp;
        }
        return false;
    }

    public static void main(String[] args) {
        Hero4 h1= new Hero4();
        h1.hp = 300;
        Hero4 h2= new Hero4();
        h2.hp = 400;
        Hero4 h3= new Hero4();
        h3.hp = 300;

        System.out.println(h1==h2);
        System.out.println(h1==h3);

    }
}
