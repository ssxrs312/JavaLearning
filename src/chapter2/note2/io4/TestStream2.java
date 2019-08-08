package chapter2.note2.io4;

import java.io.*;

public class TestStream2 {

    private static void mergeFile(String folder, String fileName){

            File targetFile = new File(folder,fileName);
        try(FileOutputStream fos = new FileOutputStream(targetFile);){
//            FileOutputStream fos = new FileOutputStream(targetFile);
            int index = 0;
            while (true){
                //子文件
                File eachFile = new File(folder, fileName + "-" + index++);
                //如果子文件不存在了就结束
                if (!eachFile.exists())
                    break;

                try(FileInputStream fis = new FileInputStream(eachFile);) {
                    //读取子文件的内容
//                    FileInputStream fis = new FileInputStream(eachFile);
                    byte[] eachData = new byte[(int) eachFile.length()];
                    fis.read(eachData);
//                    fis.close();

                    //把子文件的内容写出去
                    fos.write(eachData);
                    fos.flush();
                    System.out.printf("把子文件 %s写出到目标文件中%n", eachFile);
                }
            }

//            fos.close();
            System.out.printf("最后目标文件的大小：%,d字节" , targetFile.length());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        mergeFile("/Users/hubin/Desktop/","北京研发中心工作计划.pptx");
    }
}
