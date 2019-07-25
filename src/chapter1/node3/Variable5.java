package chapter1.node3;

import sun.jvm.hotspot.HelloWorld;

public class Variable5 {

    /* 字段、属性、field
    当一个变量被声明在类下面
    变量就叫做字段 或者属性、成员变量、Field
    比如变量i,就是一个属性。
    那么从第2行这个变量声明的位置开始，整个类都可以访问得到
    所以其作用域就是从其声明的位置开始的整个类

     */

    int i = 1;
    int j = i;  //其他的属性可以访问i
    public void method1(){
        System.out.println(i); //方法1里可以访问i
    }
    public void method2(){
        System.out.println(i); //方法2里可以访问i
    }

    /* 参数
    如果一个变量，是声明在一个方法上的，就叫做参数
    参数的作用域即为该方法内的所有代码
    其他方法不能访问该参数
    类里面也不能访问该参数
     */

    public void method3(int i2){ //参数i2的作用域即方法method3
        System.out.println(i2);
    }
    public void method4(){

//        System.out.println(i2); //method4 不能访问参数i2
    }

//    int j2 = i2;  //类里面也不能访问参数i2

    /* 局部变量
    声明在方法内的变量，叫做局部变量
    其作用域在声明开始的位置，到其所处于的块结束位置
     */

    public void method5() {
        int i3  = 5;  //其作用范围是method5中
        System.out.println(i3);
        {            //子块
            System.out.println(i3); //可以访问i3
            int j3 = 6;
            System.out.println(j3); //可以访问j3
        }
//        System.out.println(j3); //不能访问j3,因为其作用域到子块中，超出后就不能访问
    }

    //练习
    int i4 = 1; //属性名是i4
    public void method6(int i4){ //参数也是i4
        System.out.println(i4);
    }

    public static void main(String[] args) {
        new Variable5().method6(5);
        //结果打印出来是 1还是5?
        //输出是5，当访问的变量被多个作用域影响的时候，按照就近原则取
    }
}
