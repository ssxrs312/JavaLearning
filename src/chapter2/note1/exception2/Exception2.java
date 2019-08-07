package chapter2.note1.exception2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exception2 {
    /*
    异常处理常见手段： try catch finally throws
     */

    /* 步骤 1 : try catch
    1.将可能抛出FileNotFoundException 文件不存在异常的代码放在try里
2.如果文件存在，就会顺序往下执行，并且不执行catch块中的代码
3. 如果文件不存在，try 里的代码会立即终止，程序流程会运行到对应的catch块中
4. e.printStackTrace(); 会打印出方法的调用痕迹，如此例，会打印出异常开始于TestException的第16行，这样就便于定位和分析到底哪里出了异常
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

    /* 步骤 2 : 使用异常的父类进行catch
    FileNotFoundException是Exception的子类，使用Exception也可以catch住FileNotFoundException
     */
        File f2= new File("d:/LOL.exe");

        try{
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f2);
            System.out.println("成功打开");
        }

        catch(Exception e){
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        }

    /* 步骤 3 : 多异常捕捉办法1
    有的时候一段代码会抛出多种异常，比如
        new FileInputStream(f);
        Date d = sdf.parse("2016-06-03");
    这段代码，会抛出 文件不存在异常 FileNotFoundException 和 解析异常ParseException
    解决办法之一是分别进行catch
        catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }
     */
        File f3 = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f3);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException e) {
            System.out.println("d:/LOL.exe不存在");
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("日期格式解析错误");
            e.printStackTrace();
        }

    /* 步骤 4 : 多异常捕捉办法2
    另一个办法是把多个异常，放在一个catch里统一捕捉
    catch (FileNotFoundException | ParseException e) {
    这种方式从 JDK7开始支持，好处是捕捉的代码更紧凑，不足之处是，一旦发生异常，不能确定到底是哪种异常，需要通过instanceof 进行判断具体的异常类型
        if (e instanceof FileNotFoundException)
            System.out.println("d:/LOL.exe不存在");
        if (e instanceof ParseException)
            System.out.println("日期格式解析错误");
     */
        File f4 = new File("d:/LOL.exe");

        try {
            System.out.println("试图打开 d:/LOL.exe");
            new FileInputStream(f4);
            System.out.println("成功打开");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse("2016-06-03");
        } catch (FileNotFoundException | ParseException e) {
            if (e instanceof FileNotFoundException)
                System.out.println("d:/LOL.exe不存在");
            if (e instanceof ParseException)
                System.out.println("日期格式解析错误");

            e.printStackTrace();
        }

    /* 步骤 5 : finally
    无论是否出现异常，finally中的代码都会被执行
     */
        File f5 = new File("e:/lol.exe");


        try {
            System.out.println("试图打开 e:/lol.exe");
            new FileInputStream(f5);
            System.out.println("成功打开");

        } catch (FileNotFoundException e) {
            System.out.println("e:/lol.exe 不存在");
            e.printStackTrace();
        }
        finally {
            System.out.println("无论文件是否存在， 都会执行的代码");
        }

    /* 步骤 6 : throws
    考虑如下情况：
    主方法调用method1
    method1调用method2
    method2中打开文件

    method2中需要进行异常处理
    但是method2不打算处理，而是把这个异常通过throws抛出去
    那么method1就会接到该异常。 处理办法也是两种，要么是try catch处理掉，要么也是抛出去。
    method1选择本地try catch住 一旦try catch住了，就相当于把这个异常消化掉了，主方法在调用method1的时候，就不需要进行异常处理了
     */
        method1();
    }

    private static void method1(){
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method2() throws FileNotFoundException {

        File f = new File("d:/LOL.exe");

        System.out.println("试图打开 d:/LOL.exe");
        new FileInputStream(f);
        System.out.println("成功打开");

    }

    /* 步骤 7 : throw和throws的区别
    throws与throw这两个关键字接近，不过意义不一样，有如下区别：
    1. throws 出现在方法声明上，而throw通常都出现在方法体内。
    2. throws 表示出现异常的一种可能性，并不一定会发生这些异常；throw则是抛出了异常，执行throw则一定抛出了某个异常对象。
     */

    /* 步骤 8 : 练习-异常处理
    假设有一个方法 public int method()， 会返回一个整数
        在这个方法中有try catch 和 finally.
        try 里返回 1
        catch 里 返回 2
        finally 里 返回3
    那么，这个方法到底返回多少？
    类：TestException
    可以看到，最后结果是取finally的返回值3.
    同时，故意把method设计成调用 return1(),return2(),return3()。
    可以观察到，try里的 返回和 finally的返回都是执行了的，不过最后选择使用finally里的返回的值
     */






}
