package chapter1.node7.classO11;
/* 预先定义的常量
枚举enum是一种特殊的类(还是类)，使用枚举可以很方便的定义常量
比如设计一个枚举类型 季节，里面有4种常量
public enum Season {
	SPRING,SUMMER,AUTUMN,WINTER
}
一个常用的场合就是switch语句中，使用枚举来进行判断
注：因为是常量，所以一般都是全大写
 */
public class HelloWorld {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        switch (season) {
            case SPRING:
                System.out.println("春天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

        //遍历枚举
        //借助增强型for循环，可以很方便的遍历一个枚举都有哪些常量
        for (Season s : Season.values()) {
            System.out.println(s);
        }
    }
}
