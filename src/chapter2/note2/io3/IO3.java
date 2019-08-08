package chapter2.note2.io3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO3 {
    public static void main(String[] args) {
        /*
        InputStream字节输入流
        OutputStream字节输出流
        用于以字节的形式读取和写入数据
         */

        /* 步骤 1 : ASCII码 概念
        所有的数据存放在计算机中都是以数字的形式存放的。 所以字母就需要转换为数字才能够存放。
        比如A就对应的数字65，a对应的数字97. 不同的字母和符号对应不同的数字，就是一张码表。
        ASCII是这样的一种码表。 只包含简单的英文字母，符号，数字等等。 不包含中文，德文，俄语等复杂的。
         */

        /* 步骤 2 : 以字节流的形式读取文件内容
        InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
        FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
         */

        try {
            //准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
            File f =new File("/Users/hubin/Desktop/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis =new FileInputStream(f);
            //创建字节数组，其长度就是文件的长度
            byte[] all =new byte[(int) f.length()];
            //以字节流的形式读取文件所有内容
            fis.read(all);
            for (byte b : all) {
                //打印出来是65 66
                System.out.println(b);
            }

            //每次使用完流，都应该进行关闭
            fis.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* 步骤 3 : 以字节流的形式向文件写入数据
        OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
        FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据

        注: 如果文件d:/lol2.txt不存在，写出操作会自动创建该文件。
        但是如果是文件 d:/xyz/lol2.txt，而目录xyz又不存在，会抛出异常
         */
        try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("/Users/hubin/Desktop/lol2.txt");
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };

            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* 步骤 4 : 练习-写入数据到文件
        以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
        但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
        那么怎么自动创建xyz目录？
        如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？
         */
        try {
            // 准备文件lol2.txt其中的内容是空的
            File f = new File("/Users/hubin/Desktop/abc/def/lol2.txt");
            //多层父级目录如果不存在，就创建目录。至于lol3.txt文件，写出操作会自动创建该文件。
            f.getParentFile().mkdirs();
            // 准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
            byte data[] = { 88, 89 };

            // 创建基于文件的输出流
            FileOutputStream fos = new FileOutputStream(f);
            // 把数据写入到输出流
            fos.write(data);
            // 关闭输出流
            fos.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        /* 步骤 6 : 练习-拆分文件
        找到一个大于100k的文件，按照100k为单位，拆分成多个子文件，并且以编号作为文件名结束。
        比如文件 eclipse.exe，大小是309k。
        拆分之后，成为
        eclipse.exe-0
        eclipse.exe-1
        eclipse.exe-2
        eclipse.exe-3
        答案：类 TestStream
         */

        /* 步骤 8 : 练习-合并文件
        把上述拆分出来的文件，合并成一个原文件。
        以是否能正常运行，验证合并是否正确
        答案1：我自己写的，TestStream2。虽然合并了，但是打开后有些不显示
        答案2：教程写的，TestStream3。非常成功
         */





    }
}
