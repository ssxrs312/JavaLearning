package chapter1.node9.numberS5;

import java.util.Scanner;

public class TestChar {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '1';//字符1,而非数字1
        char c3 = '中';//汉字字符
//        char c4 = 'ab'; //只能放一个字符

        System.out.println(Character.isLetter('a'));//判断是否为字母
        System.out.println(Character.isDigit('a')); //判断是否为数字
        System.out.println(Character.isWhitespace(' ')); //是否是空白
        System.out.println(Character.isUpperCase('a')); //是否是大写
        System.out.println(Character.isLowerCase('a')); //是否是小写


        System.out.println(Character.toUpperCase('a')); //转换为大写
        System.out.println(Character.toLowerCase('A')); //转换为小写

//        String a = 'a'; //不能够直接把一个字符自动转换成字符串
        String a2 = Character.toString('a'); //转换为字符串

        System.out.println("=======");
        System.out.println("使用空格无法达到对齐的效果");
        System.out.println("abc def");
        System.out.println("ab def");
        System.out.println("a def");

        System.out.println("使用\\t制表符可以达到对齐的效果");
        System.out.println("abc\tdef");
        System.out.println("ab\tdef");
        System.out.println("a\tdef");

        System.out.println("一个\\t制表符长度是8");
        System.out.println("12345678def");

        System.out.println("换行符 \\n");
        System.out.println("abc\ndef");

        System.out.println("单引号 \\'");
        System.out.println("abc\'def");
        System.out.println("双引号 \\\"");
        System.out.println("abc\"def");
        System.out.println("反斜杠本身 \\");
        System.out.println("abc\\def");

        System.out.println("=======");
        String str = "abc123";
        char[] cs = str.toCharArray();

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String str1 = scanner.nextLine();
        char[] cas = str1.toCharArray();   //字符串 转 字符数组
        for (Character c:cas){
            if (Character.isUpperCase(c) || Character.isDigit(c)){   //   要么大写字母，要么是数字
                System.out.println(c);
            }
        }

    }
}
