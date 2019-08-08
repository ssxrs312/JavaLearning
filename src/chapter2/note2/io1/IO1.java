package chapter2.note2.io1;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class IO1 {
    /*
    文件和文件夹都是用File代表
     */

    /* 步骤 1 : 创建一个文件对象
    使用绝对路径或者相对路径创建File对象
     */
    public static void main(String[] args) throws IOException {
        // 绝对路径
        File f1 = new File("d:/LOLFolder");
        System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
        // 相对路径,相对于工作目录，如果在eclipse中，就是项目目录
        File f2 = new File("LOL.exe");
        System.out.println("f2的绝对路径：" + f2.getAbsolutePath());

        // 把f1作为父目录创建文件对象
        File f3 = new File(f1, "LOL.exe");

        System.out.println("f3的绝对路径：" + f3.getAbsolutePath());

        //绝对路径
        File ftest1 = new File("/Users/hubin/test.txt");
        System.out.println(ftest1.getAbsolutePath());

        //相对路径
        File ftest2 = new File("test.txt");
        System.out.println(ftest2.getAbsolutePath());

        //作为父级目录
        File ftest3 = new File(ftest1, "test.txt");
        System.out.println(ftest3);

    /* 步骤 2 : 文件常用方法1
    注意1： 需要在D:\LOLFolder确实存在一个LOL.exe,才可以看到对应的文件长度、修改时间等信息
    注意2： renameTo方法用于对物理文件名称进行修改，但是并不会修改File对象的name属性。
     */
        File f = new File("d:/LOLFolder/LOL.exe");
        System.out.println("当前文件是：" +f);
        //文件是否存在
        System.out.println("判断是否存在："+f.exists());

        //是否是文件夹
        System.out.println("判断是否是文件夹："+f.isDirectory());

        //是否是文件（非文件夹）
        System.out.println("判断是否是文件："+f.isFile());

        //文件长度
        System.out.println("获取文件的长度："+f.length());

        //文件最后修改时间
        long time = f.lastModified();
        Date d = new Date(time);
        System.out.println("获取文件的最后修改时间："+d);
        //设置文件修改时间为1970.1.1 08:00:00
        f.setLastModified(0);

        //文件重命名
        File f4 =new File("d:/LOLFolder/DOTA.exe");
        f.renameTo(f4);
        System.out.println("把LOL.exe改名成了DOTA.exe");

        System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");

    /*
    步骤 3 : 文件常用方法2
     */
        File f5 = new File("d:/LOLFolder/skin/garen.ski");

        // 以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
        f5.list();

        // 以文件数组的形式，返回当前文件夹下的所有文件（包含子文件夹）
        File[]fs= f5.listFiles();

        // 以字符串形式返回获取所在文件夹
        f.getParent();

        // 以文件形式返回获取所在文件夹
        f.getParentFile();
        // 创建文件夹，如果父文件夹skin不存在，创建就无效
        f.mkdir();

        // 创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
        f.mkdirs();

        // 创建一个空文件,如果父文件夹skin不存在，就会抛出异常
        f.createNewFile();
        // 所以创建一个空文件之前，通常都会创建父目录
        f.getParentFile().mkdirs();

        // 列出所有的盘符c: d: e: 等等
        f.listRoots();

        // 刪除文件
        f.delete();

        // JVM结束的时候，刪除文件，常用于临时文件的删除
        f.deleteOnExit();

    /* 步骤 4 : 练习-遍历文件夹
    一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。

    遍历这个目录下所有的文件(不用遍历子目录)

    找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名

    注: 最小的文件不能是0长度
    类：TestFile
     */

    /* 步骤 6 : 练习-遍历子文件夹
    使用递归来进行文件夹的遍历
     */
    }
}
