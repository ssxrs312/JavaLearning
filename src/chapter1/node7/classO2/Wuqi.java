package chapter1.node7.classO2;

/* 武器类Wuqi（继承类Item）
虽然Wuqi自己没有设计name和price,但是通过继承Item类，也具备了name和price属性

 */
public class Wuqi extends Item {
    int damage; //攻击力

    public static void main(String[] args) {
        Wuqi infinityEdge = new Wuqi();
        infinityEdge.damage = 65; //damage属性是新设计的
        infinityEdge.name = "无尽之刃";  //name属性，是从Item中继承来的
        infinityEdge.price = 3600;
    }

}
