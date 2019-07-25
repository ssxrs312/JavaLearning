package chapter1.node3;

public class Variable6 {

    /*
    final 修饰一个变量，有很多种说法，比如不能改变等等
    准确的描述是 当一个变量被final修饰的时候，该变量只有一次赋值的机会
     */

    //在声明的时候赋值
    public void method1() {
        final int i = 5;

//        i = 10; //i在第4行已经被赋值过了，所以这里会出现编译错误

    }

    //在声明的时候没有赋值，如果在声明的时候未赋值，那么可以在后面代码进行唯一的一次赋值
    public void method2() {
        final int i;

        i = 10; //i在第20行，只是被声明，但是没有被赋值，所以在这里可以进行第一次赋值

//        i = 11; //i在第22行已经被赋值过了，所以这里会出现编译错误

    }

    //final 修饰其他,final 除了修饰变量，还可以修饰类，修饰方法

    //练习
    public void method3(final int j) {
//        j = 5; //这个能否执行？
    }
    //结果：不可以，因为在调用方法的时候，就一定会第一次赋值了，后面不能再进行多次赋值

}
