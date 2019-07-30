package chapter1.node7.classO4;
/* 练习-构造方法
为Hero5设计4个参数的构造方法
这四个参数分别是
String heroName
float heroHP
float heroArmor
int heroMoveSpeed

 */
public class Hero5 {
    String heroName;
    float heroHP;
    float heroArmor;
    int heroMoveSpeed;

    public Hero5() {
    }

    public Hero5(String heroName) {
        this.heroName = heroName;
    }

    public Hero5(String heroName, float heroHP) {
        this.heroName = heroName;
        this.heroHP = heroHP;
    }

    public Hero5(String heroName, float heroHP, float heroArmor) {
        this.heroName = heroName;
        this.heroHP = heroHP;
        this.heroArmor = heroArmor;
    }

    public static void main(String[] args) {
        Hero5 garen = new Hero5("盖伦");
        Hero5 teemo = new Hero5("提莫",383);
        Hero5 db = new Hero5("剑圣",400,27);
    }
}

