package chapter1.node7.classO9;

public class Hero2 {
    /*
    设计一个类方法
    public static String getName(String pos){
    }
    在属性初始化的时候，调用这个方法的返回值。
    观察这个方法的输出顺序
     */
    public String name =Hero2.getName("属性声明") ;

    public Hero2(){
        name = Hero2.getName("构造方法");
    }
    {
        name = Hero2.getName("初始化块");
    }

    public static String getName(String pos){
        String result= "name "+pos;
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        new Hero2();
    }

    //顺序：name 属性声明   name 初始化块   name 构造方法
}
