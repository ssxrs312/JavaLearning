package chapter1.node7.classO10;
/* LOL里有一个怪叫大龙GiantDragon，只有一只，所以该类，只能被实例化一次
单例模式
单例模式又叫做 Singleton模式，指的是一个类，在一个JVM里，只有一个实例存在。

 */
public class GiantDragon {
    /* 饿汉式单例模式
    GiantDragon 应该只有一只，通过私有化其构造方法，使得外部无法通过new 得到新的实例。
    GiantDragon 提供了一个public static的getInstance方法，外部调用者通过该方法获取12行定义的对象，而且每一次都是获取同一个对象。 从而达到单例的目的。
    这种单例模式又叫做饿汉式单例模式，无论如何都会创建一个实例

     */

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon(){

    }

    //准备一个类属性，指向一个实例化对象。 因为是类属性，所以只有一个
    private static GiantDragon instance = new GiantDragon();

    //public static 方法，提供给调用者获取21行定义的对象
    public static GiantDragon getInstance(){
        return instance;
    }




}
