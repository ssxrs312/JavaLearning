package chapter1.node9.numberS6;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        /*
        创建一个长度是8的字符串数组
使用8个长度是5的随机字符串初始化这个数组
对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)

注1： 不能使用Arrays.sort() 要自己写
注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
         */

        //创建一个长度是8的字符串数组
        String[] str = new String[8];

        //使用8个长度是5的随机字符串初始化这个数组
        char cs[] = new char[5];
        short start = '0';
        short end = 'z'+1;  //0-9的ASCII码为48-57，A-Z的ASCII码为65-90，a-z的ASCII码为97-122。为什么要z + 1 ，因为0-9是10个数，所以需要z+1
        for (int j = 0;j<str.length;j++){
            for (int i = 0; i < cs.length; i++) {
                while (true) {
                    char c = (char) ((Math.random() * (end - start)) + start);  //将数字转换为字符，参考第63行。
                    if (Character.isLetter(c) || Character.isDigit(c)) {
                        cs[i] = c;
                        break;
                    }
                }
            }
            String result = new String(cs);  //字符数组 转换为 字符串
            str[j] = result;
            System.out.print(str[j]+" ");
        }

        //对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)
        System.out.println(" ");
        System.out.println("=======");
        //正排序，左边的数 和 右边的数 比大小
        for (int i = 0;i<str.length-1;i++){  //左边的数
            for (int j = i+1;j<str.length;j++){  //右边的数
                char firstChar = str[i].charAt(0);
                char secondChar = str[j].charAt(0);
                firstChar = Character.toLowerCase(firstChar);
                secondChar = Character.toLowerCase(secondChar);
                if (firstChar>secondChar){
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] =temp;
                }
            }
        }
        for (String s:str){
            System.out.print(s + " " );
        }

    }
}
