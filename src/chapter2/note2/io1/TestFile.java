package chapter2.note2.io1;

import javax.sound.midi.Soundbank;
import java.io.File;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("/Users/hubin/Desktop");
        File[] fs = f.listFiles();
        if (null == fs){
            return;
        }
        long maxSize = 0;
        long minSize = Integer.MAX_VALUE;
        File maxFile = null;
        File minFile = null;
        for (File file :fs){
            if (file.isDirectory()){
                continue;
            }
            if (file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if (file.length()!=0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
        }
        System.out.printf("最大的文件是%s，其大小是%,d字节%n",maxFile.getAbsolutePath(),maxSize);
        System.out.printf("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsolutePath(),minSize);

    }
}
