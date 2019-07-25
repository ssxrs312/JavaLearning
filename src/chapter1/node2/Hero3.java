package chapter1.node2;

public class Hero3 {

    private String name;
    private float hp;
    private float armor;
    private int moveSpeed;

    //坑队友
    void keng(){
        System.out.println("坑队友！");
    }

    //获取护甲值
    float getArmor(){
        return armor;
    }

    //增加移动速度
    void addSpeed(int speed){
        //在原来的基础上增加移动速度
        moveSpeed = moveSpeed + speed;
    }

    //超神 legendary(),无参数，无返回类型
    void legendary(){
        System.out.println("超神");
    }

    //获取当前的血量 getHp(), 无参数，有float类型的返回值
    float getHp(){
        return hp;
    }

    //回血 recovery(float blood)， 有参数 float类型参数 blood表示本次恢复的血量，无返回类型
    void recovery(float blood){
        hp = hp + blood ;
    }

    public static void main(String[] args) {

        Hero3 garen =  new Hero3();
        garen.name = "盖伦";
        garen.moveSpeed = 350;
        garen.addSpeed(100);
        System.out.println(garen.name + "现在的速度是" + garen.moveSpeed);

        garen.hp  = 500;
        System.out.println(garen.name + " 当前的血量是 " +garen.hp);
        System.out.println("回血100");
        garen.recovery(100);
        System.out.println("现在的血量是:" + garen.hp);
    }
}
