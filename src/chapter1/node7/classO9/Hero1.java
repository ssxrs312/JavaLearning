package chapter1.node7.classO9;
/* 练习-属性初始化
对象属性的初始化有三种方式
故意把初始化块，放在构造方法下面，问题：
这三种方式，谁先执行？谁后执行？
 */
public class Hero1 {
    public String name = "some hero";

    public Hero1(){
        name = "one hero";
    }
    {
        name = "the hero";
    }


    /* 答案请参考chapter1.node7.classO9.Hero2
    顺序：some hero   the hero   one hero
     */



}
