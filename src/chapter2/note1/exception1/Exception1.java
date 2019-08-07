package chapter2.note1.exception1;

import java.io.File;
import java.io.FileInputStream;

public class Exception1 {
    /*
    异常定义：
    导致程序的正常流程被中断的事件，叫做异常
     */

    /* 步骤 1 : 文件不存在异常
    比如要打开d盘的LOL.exe文件，这个文件是有可能不存在的
    Java中通过 new FileInputStream(f) 试图打开某文件，就有可能抛出文件不存在异常FileNotFoundException
    如果不处理该异常，就会有编译错误
     */
    public static void main(String[] args) {
        File f= new File("d:/LOL.exe");

        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);

    /* 步骤 2 : 练习-异常
    罗列出学习到目前为止，都接触过了哪些异常，分别在什么情况下会出现
        ParseException 解析异常，日期字符串转换为日期对象的时候，有可能抛出的异常
        OutOfIndexException 数组下标越界异常
        OutOfMemoryError 内存不足
        ClassCastException 类型转换异常
        ArithmeticException 除数为零
        NullPointerException 空指针异常
     */







    }

}
