package chapter1.node7.classO10;

public class GiantDragon2 {
    /*
    懒汉式单例模式与饿汉式单例模式不同，只有在调用getInstance的时候，才会创建实例
     */

    //私有化构造方法使得该类无法在外部通过new 进行实例化
    private GiantDragon2(){

    }

    //准备一个类属性，用于指向一个实例化对象，但是暂时指向null
    private static GiantDragon2 instance;

    //public static 方法，返回实例对象
    public static GiantDragon2 getInstance(){
        //第一次访问的时候，发现instance没有指向任何对象，这时实例化一个对象
        if (null == instance){
            instance = new GiantDragon2();
        }

        //返回 instance指向的对象
        return instance;
    }

}
