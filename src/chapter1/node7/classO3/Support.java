package chapter1.node7.classO3;

/* 练习-治疗
设计一个类Support (辅助英雄)继承Hero，提供一个heal(治疗)方法
对Support的heal方法进行重载
heal()
heal(Hero h) //为指定的英雄加血
heal(Hero h, int hp) //为指定的英雄加了hp的血

 */
public class Support extends Hero {

    public void heal(){
        System.out.println("恢复了血量");
    }

    public void heal(Hero h){
        System.out.println("给"+h+"加血");
    }

    public void heal(Hero h,int hp){
        System.out.println("给"+h+"加了"+hp+"的血");
    }


}
