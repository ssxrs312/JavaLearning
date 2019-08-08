package chapter2.note2.io3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestStream {

    public static void main(String[] args) {
        try {
            // 准备文件
            File f = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx");

            //获取文件长度
            long length = f.length();
            System.out.println(length);//661,497 byte，1kb=1024b,1mb=1024kb

            //创建字节数组，字节数组的长度=文件的长度
            byte[] data = new byte[(int) length];

            // 创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);

            //输入流将读取的数据放入到字节数组data
            fis.read(data);

            // 关闭输入流
            fis.close();

            //按照100k为单位，拆分成多个子文件
            // 文件是否能被整除得到的子文件个数是不一样的
            // (假设文件长度是25，每份的大小是5，那么就应该是5个)
            // (假设文件长度是26，每份的大小是5，那么就应该是6个)
            int fileNumber = 0;
            for (int i=0;i<data.length;i++){
                if (0==data.length%(100*1024)){
                    fileNumber = (int) data.length / (100*1024);
                }else {
                    fileNumber = (int) (data.length / (100*1024)+ 1) ;
                }
            }

            //根据子文件创建文件名，创建文件
            for (int i=0;i<fileNumber;i++){
                String targetFileName = f.getName() + "-" + i;
                File f1 = new File(f.getParent(), targetFileName);
                byte[] eachData;
                //把内存中的文件内容复制到新的字节数组eachData
                // Arrays.copyOfRange(源文件，开始位置，结束位置)
                // 从源文件的内容里，复制部分数据到子文件
                // 除开最后一个文件，其他文件大小都是100k
                // 最后一个文件的大小是剩余的
                if (i != fileNumber - 1){  //不是最后一个
                    eachData = Arrays.copyOfRange(data, (100 * 1024) * i, (100 * 1024) * (i + 1));
                }else {
                    eachData = Arrays.copyOfRange(data,(100 * 1024) * i,data.length);
                }
                //输出流将字节数组中的数据放入到文件中
                FileOutputStream fos = new FileOutputStream(f1);
                fos.write(eachData);
                // 记得关闭
                fos.close();
                System.out.printf("输出子文件%s，其大小是 %d字节%n", f1.getAbsoluteFile(), f1.length());
            }





        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
