package chapter2.note2.io3;

import java.io.*;

public class TestStream2 {
    public static void main(String[] args) {
        try {
            File f0 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-0");
            int length0 = (int)f0.length();
            byte[] data0 = new byte[length0];
            FileInputStream fis0 = new FileInputStream(f0);
            fis0.read(data0);

            File f1 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-1");
            int length1 = (int)f1.length();
            byte[] data1 = new byte[length1];
            FileInputStream fis1 = new FileInputStream(f1);
            fis1.read(data1);

            File f2 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-2");
            int length2 = (int)f2.length();
            byte[] data2 = new byte[length2];
            FileInputStream fis2 = new FileInputStream(f2);
            fis2.read(data2);

            File f3 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-3");
            int length3 = (int)f3.length();
            byte[] data3 = new byte[length3];
            FileInputStream fis3 = new FileInputStream(f3);
            fis3.read(data3);

            File f4 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-4");
            int length4 = (int)f4.length();
            byte[] data4 = new byte[length4];
            FileInputStream fis4 = new FileInputStream(f4);
            fis4.read(data4);

            File f5 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-5");
            int length5 = (int)f5.length();
            byte[] data5 = new byte[length5];
            FileInputStream fis5 = new FileInputStream(f5);
            fis5.read(data5);

            File f6 = new File("/Users/hubin/Desktop/北京研发中心工作计划.pptx-6");
            int length6 = (int)f6.length();
            byte[] data6 = new byte[length6];
            FileInputStream fis6 = new FileInputStream(f6);
            fis6.read(data6);


            File f = new File("/Users/hubin/Desktop/新的合并文件.pptx");

            int newLength = (int) f.length();
            newLength = length0 + length1 + length2 + length3 + length4 + length5 + length6;
            byte[] data = new byte[newLength];

            System.arraycopy(data0,0,data,0,length0);
            System.arraycopy(data1,0,data,length0,length1);
            System.arraycopy(data2,0,data,length1,length2);

            System.arraycopy(data3,0,data,length2,length3);
            System.arraycopy(data4,0,data,length3,length4);
            System.arraycopy(data5,0,data,length4,length5);
            System.arraycopy(data6,0,data,length5,length6);

            FileOutputStream fos = new FileOutputStream(f);
            fos.write(data);

            fis0.close();
            fis1.close();
            fis2.close();
            fis3.close();
            fis4.close();
            fis5.close();
            fis6.close();
            fos.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
