package chapter2.note2.io5;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO5 {
    /*
    Reader字符输入流
    Writer字符输出流
    专门用于字符的形式读取和写入数据
     */

    /* 步骤 1 : 使用字符流读取文件
    FileReader 是Reader子类，以FileReader 为例进行文件读取
     */
    public static void main(String[] args) {
        // 准备文件lol.txt其中的内容是AB
        File f = new File("/Users/hubin/Desktop/lol.txt");
        // 创建基于文件的Reader
        try (FileReader fr = new FileReader(f)) {
            // 创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            // 以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                // 打印出来是A B
                System.out.println(b);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    /* 步骤 2 : 使用字符流把字符串写入到文件
    FileWriter 是Writer的子类，以FileWriter 为例把字符串写入到文件
     */
        // 准备文件lol2.txt
        File f2 = new File("/Users/hubin/Desktop/lol2.txt");
        // 创建基于文件的Writer
        try (FileWriter fw = new FileWriter(f2)) {
            // 以字符流的形式把数据写入到文件中
            String data="abcdefg1234567890";
            char[] cs = data.toCharArray();
            fw.write(cs);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    /* 步骤 3 : 练习-文件加密
    准备一个文本文件(非二进制)，其中包含ASCII码的字符和中文字符。
    设计一个方法
        public static void encodeFile(File encodingFile, File encodedFile);
    在这个方法中把encodingFile的内容进行加密，然后保存到encodedFile文件中。
    加密算法：
        数字：
            如果不是9的数字，在原来的基础上加1，比如5变成6, 3变成4
            如果是9的数字，变成0
        字母字符：
            如果是非z字符，向右移动一个，比如d变成e, G变成H
            如果是z，z变成a, Z-A。
            字符需要保留大小写
        非字母字符
            比如',&^ 保留不变，中文也保留不变
    建议： 使用以前学习的练习题中的某个Java文件，比如循环练习，就有很多的字符和数字
     */

    }

}
