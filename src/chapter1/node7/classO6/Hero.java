package chapter1.node7.classO6;
/*
变量有两种类型 基本类型 和类类型

参数也是变量，所以传参分为
基本类型传参
类类型传参

 */

public class Hero {

    /*
    基本类型传参
    在方法内，无法修改方法外的基本类型参数
     */

    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public Hero(){

    }

    //回血
    public void huixue(int xp){
        hp = hp + xp;
        //回血完毕后，血瓶=0
        xp=0;
        System.out.println("方法内"+xp);
    }

    public Hero(String name,float hp){
        this.name = name;
        this.hp = hp;
    }

    public static void main(String[] args) {
        Hero teemo =  new Hero("提莫",383);
        //血瓶，其值是100
        int xueping = 100;

        //提莫通过这个血瓶回血

        teemo.huixue(xueping);

        System.out.println(xueping);
        System.out.println(teemo.hp);

    }

}
