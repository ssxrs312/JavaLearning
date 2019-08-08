package chapter2.note2.io1;

import java.io.File;

public class TestFile2 {

    private static long maxSize = 0;
    private static long minSize = Integer.MAX_VALUE;
    private static File maxFile = null;
    private static File minFile = null;

    public static void listFile(File file){
        if (file.isFile()){
            if (file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length()!=0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }

        }
        if (file.isDirectory()){
            File[] fs = file.listFiles();
            if (null!=fs){
                for (File f:fs){
                    listFile(f);
                }
            }
        }
    }

    public static void main(String[] args) {

        File f = new File("/Users/hubin/Desktop");
        listFile(f);

        System.out.format("最大的文件是%s，其大小是%,d字节%n",maxFile.getAbsolutePath(),maxSize);
        System.out.format("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsolutePath(),minSize);

    }
}
