package chapter2.note1.exception3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {
    /*
    异常分类： 可查异常，运行时异常和错误3种
    其中，运行时异常和错误又叫非可查异常
     */

    /* 步骤 1 : 可查异常
    可查异常： CheckedException
    可查异常即必须进行处理的异常，要么try catch住,要么往外抛，谁调用，谁处理，比如 FileNotFoundException
    如果不处理，编译器，就不让你通过
     */
    public static void main(String[] args) {

        File f= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f);
            System.out.println("成功打开");
        }
        catch(FileNotFoundException e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    /* 步骤 2 : 运行时异常
    运行时异常RuntimeException指： 不是必须进行try catch的异常
    常见运行时异常:
    除数不能为0异常:ArithmeticException
    下标越界异常:ArrayIndexOutOfBoundsException
    空指针异常:NullPointerException
    在编写代码的时候，依然可以使用try catch throws进行处理，与可查异常不同之处在于，即便不进行try catch，也不会有编译错误
    Java之所以会设计运行时异常的原因之一，是因为下标越界，空指针这些运行时异常太过于普遍，如果都需要进行捕捉，代码的可读性就会变得很糟糕。
     */

        //任何除数不能为0:ArithmeticException
        int k = 5/0;

        //下标越界异常：ArrayIndexOutOfBoundsException
        int j[] = new int[5];
        j[10] = 10;

        //空指针异常：NullPointerException
        String str = null;
        str.length();

    /* 步骤 3 : 错误
    错误Error，指的是系统级别的异常，通常是内存用光了
    在默认设置下，一般java程序启动的时候，最大可以使用16m的内存
    如果不停的给StringBuffer追加字符，很快就把内存使用光了。抛出OutOfMemoryError
    与运行时异常一样，错误也是不要求强制捕捉的
    类：TestException
     */

    /* 步骤 4 : 三种分类
    总体上异常分三类：
    1. 错误
    2. 运行时异常
    3. 可查异常
     */

    /* 步骤 5 : 练习-异常分类
    运行时异常 RuntimeException，能否被捕捉？
    错误Error，能否被捕捉？
    答案：都可以捕捉。TextException2

    面试题常问题： 运行时异常与非运行时异常的区别
        运行时异常是不可查异常，不需要进行显式的捕捉
        非运行时异常是可查异常，必须进行显式的捕捉，或者抛出

        不要答成：
        运行时异常是运行的时候抛出的异常，非运行时异常，不运行也能抛出
     */






    }

}
