package chapter1.node9.numberS1;

public class NumberS1 {
    /* 步骤 1 : 封装类
    所有的基本类型，都有对应的类类型
    比如int对应的类是Integer
    这种类就叫做封装类
    类：TestNumber
     */

    /* 步骤 2 : Number类
    数字封装类有
    Byte,Short,Integer,Long,Float,Double
    这些类都是抽象类Number的子类
    System.out.println(it instanceof Number);//Integer是Number的子类，所以打印true
    类：TestNumber
     */

    /* 步骤 3 : 基本类型转封装类
        int i = 5;
        //基本类型转换成封装类型
        Integer it = new Integer(i);
     */

    /* 步骤 4 : 封装类转基本类型
    int i2 = it.intValue()
     */

    /* 步骤 5 : 自动装箱
    不需要调用构造方法，通过=符号自动把 基本类型 转换为 类类型 就叫装箱
    int i = 5;
    //自动转换就叫装箱
    Integer it = i;
     */

    /* 步骤 6 : 自动拆箱
    不需要调用Integer的intValue方法，通过=就自动转换成int类型，就叫拆箱
        int i = 5;
        Integer it = new Integer(i);
        //自动转换就叫拆箱
        int i3 = it;
     */

    /* 步骤 7 : int的最大值，最小值
    int的最大值可以通过其对应的封装类Integer.MAX_VALUE获取
        //int的最大值
        System.out.println(Integer.MAX_VALUE);
        //int的最小值
        System.out.println(Integer.MIN_VALUE);

     */

    /* 步骤 8 : 练习-装箱拆箱
1. 对byte,short,float,double进行自动拆箱和自动装箱
2. byte和Integer之间能否进行自动拆箱和自动装箱
3. 通过Byte获取byte的最大值
     */
    byte a = 1;
    short b = 200;
    float c =300.12f;
    double d =1239.23231;

    Byte at = a;  //自动装箱
    Short bt = b;
    Float ct = c;
    Double dt = d;

    byte a1 = at;   //自动拆箱
    short b1 = bt;
    float c1 = ct;
    double d1 = dt;

//    Integer i5 = a;//不能把byte直接自动装箱成Integer

    Integer i6 = new Integer(a);//装箱是可以

    Integer i7 = new Integer(1);
//    byte a2 = i7;//不能把Integer直接自动拆箱成byte

    byte a3 = i7.byteValue();//拆箱也可以

    public static void main(String[] args) {
        System.out.println(Byte.MAX_VALUE);
    }






}
