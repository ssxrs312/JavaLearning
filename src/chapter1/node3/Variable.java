package chapter1.node3;

public class Variable {

    /*
    * 整形:byte  short  int  long
    * 字符型：char
    * 浮点型：float  double
    * 布尔型：boolean
    * String类型：
    */
    public static void main(String[] args) {
        //整形
        byte b = 1;
        short s = 200;
        int i = 300;
        long l = 400;

        /*如果试图给byte类型的变量赋予超出其范围的值，就会产生编译错误*/
//        byte b2 = 200;

        //字符型
        char c = '中';
        //char 只能存放一个字符，超过一个字符就会产生编译错误
//        char c2 = '中国'; //报错
//        char c3 = 'ab'; //报错

        //浮点型
        double d = 123.45;

        //该行会出现编译错误，因为54.321是double型的
//        float f = 54.321;

        float f2 = 54.321f;

        //布尔型
        boolean b1 = true;
        boolean b2 = false;

        // 虽然布尔型真正存放的数据是0(false) 1(true)
        // 但是，不能直接使用0 1 进行赋值
//        boolean b3 = 1;

        //String类型
        String str = "Hello Java";

        //练习
        double a = 3.14;
        double a1 = 2.769343;
        short a2 =365;
        byte a3 = 12;
        char a4 ='吃';
        boolean a5 = false;
        String a6 = "不可描述";



    }
}
