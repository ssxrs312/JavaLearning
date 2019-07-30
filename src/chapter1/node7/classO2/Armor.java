package chapter1.node7.classO2;
/*
设计一个类Armor护甲
继承Item类，并且额外提供一个属性ac: 护甲等级 int类型

实例化出两件护甲
名称 价格 护甲等级
布甲 300 15
锁子甲 500 40

 */

public class Armor extends Item{
    int level;

    public static void main(String[] args) {
        Armor bujia = new Armor();
        bujia.name = "布甲";
        bujia.price = 300;
        bujia.level = 15;

        Armor suozijia = new Armor();
        suozijia.name = "锁子甲";
        suozijia.price = 500;
        suozijia.level = 40;

    }
}
