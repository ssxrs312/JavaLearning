package chapter1.node3;

public class Variable2 {
/* 整数字面值
*  浮点数字面值
*  字符和字符串字面值
*
*/
    public static void main(String[] args) {
        //整数字面值
        long val = 26L; //以L结尾的字面值表示long型
        int decVal = 26; //默认就是int型,10进制,包含从0-9的数字
        int hexVal = 0x1a; //16进制,包含从0-9的数字，和从A-F的字母
        int oxVal = 032; //8进制，包含从0-7的数字
        int binVal = 0b11010; //2进制，包含0和1。（从 JAVA7开始就可以创建 二进制的字面值了）
        System.out.println(oxVal);

        //浮点数字面值
        float f1 = 123.4F;// 以F结尾的字面值表示float类型
        double d1 = 123.4;// 默认就是double类型
        double d2 = 1.234e2;// 科学计数法表示double，浮点数还可以用E或者e表示（科学计数法）e2表示10的二次方，即100，1.234e2 = 1.234x100

        //字符和字符串字面值,字符的字面值放在单引号中,字符串的字面值放在双引号中
        //需要注意的是，\表示转义，比如需要表示制表符，回车换行，双引号等就需要用 \t \r \n \" 的方式进行
        String name = "盖伦";
        char a= 'c';

        //以下是转义字符
        char tab = '\t'; //制表符
        char carriageReturn = '\r'; //回车
        char newLine = '\n'; //换行
        char doubleQuote = '\"'; //双引号
        char singleQuote = '\''; //单引号
        char backslash = '\\'; //反斜杠

        //练习
        byte b = 12;
        short s =200;
        int i = 10000;
        long l = 100000000;
        float f = 1.23f;
        double d = 1.23456789;
        char c = 'h';
        String str = "haodehen";

    }
}
