package chapter2.note2.io5;

import java.io.*;

public class TestStream {
/**
 * @Description 
 * @Param [encodingFile, encodedFile]
 *        [被加密的文件,加密后保存的位置]
 * @return void
 * @Author hubin
 * @Date 17:35 2019-08-08
 **/
    private static void encodeFile(File encodingFile, File encodedFile) {

        try(FileReader fr = new FileReader(encodingFile);FileWriter fw = new FileWriter(encodedFile);) {
            // 读取源文件
            char[] srcData = new char[(int) encodingFile.length()];
            fr.read(srcData);
            System.out.println("加密前的内容：");
            System.out.println(new String(srcData));

            //加密文件
            encode(srcData);

            //保存到encodedFile文件中
            System.out.println("加密后的内容：");
            System.out.println(new String(srcData));

            fw.write(srcData);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @Description 加密算法：把字符数组中的内容进行加密
     * @Param [cs]  字符数组，通过输入流读取的文件内容暂时放在这里
     * @return void
     * @Author hubin
     * @Date 18:26 2019-08-08
     **/
    private static void encode(char[] cs){
        /*
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
         */
        for (int i=0;i<cs.length;i++){
            char c = cs[i];
            if (isLetterOrDigit(c)){
                switch (c){
                    case '9':
                        c = '0';
                        break;
                    case 'z':
                        c = 'a';
                        break;
                    case 'Z':
                        c = 'A';
                        break;
                    default:
                        c++;
                        break;
                }
            }
            cs[i] = c;
        }
    }

/**
 * @Description 判断是否为数字或者字母，如果不是，返回false，是返回true
 * @Param [c]
 * @return boolean
 * @Author hubin
 * @Date 18:48 2019-08-08
 **/
    public static boolean isLetterOrDigit(char c) {
        // 不使用Character类的isLetterOrDigit方法是因为，中文也会被判断为字母
        String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        return -1 == letterOrDigital.indexOf(c) ? false : true;
    }

    public static void main(String[] args) {
        File encodingFile = new File("/Users/hubin/IdeaProjects/JavaLearning/src/chapter2/note2/io5/test1.txt");
        File encodedFile = new File(encodingFile.getParent(), "test2.txt");
        encodeFile(encodingFile, encodedFile);
    }

}
