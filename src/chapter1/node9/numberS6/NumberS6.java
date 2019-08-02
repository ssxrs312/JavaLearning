package chapter1.node9.numberS6;

public class NumberS6 {
    /* 示例 1 : 创建字符串
    字符串即字符的组合，在Java中，字符串是一个类，所以我们见到的字符串都是对象
    常见创建字符串手段：
    1. 每当有一个字面值出现的时候，虚拟机就会创建一个字符串
    2. 调用String的构造方法创建一个字符串对象
    3. 通过+加号进行字符串拼接也会创建新的字符串对象
    类：TestString
     */

    /* 示例 2 : final
    String 被修饰为final,所以是不能被继承的
    这里会报错，因为String不能被继承
        static class MyString extends String{

        }
     */

    /* 示例 3 : immutable
    immutable 是指不可改变的
    比如创建了一个字符串对象
    String garen ="盖伦";
    不可改变的具体含义是指：
    不能增加长度
    不能减少长度
    不能插入字符
    不能删除字符
    不能修改字符
    一旦创建好这个字符串，里面的内容 永远 不能改变

    String 的表现就像是一个常量
     */

    /* 示例 4 : 字符串格式化
    如果不使用字符串格式化，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
    使用字符串格式化，就可以简洁明了
    更多的格式化规则，参考格式化输出
    类：TestString
     */

    /* 示例 5 : 字符串长度
    length方法返回当前字符串的长度
    可以有长度为0的字符串,即空字符串
    类：TestString
     */

    /* 示例 6 : 练习-随机字符串
    创建一个长度是5的随机字符串，随机字符有可能是数字，大写字母或者小写字母
    给点提示: 数字和字符之间可以通过互相转换。char是16位，short也是16位
    char c = 'A';
    short s = (short) c;
    通过这个手段就能够知道字符 a-z A-Z 0-9 所对应的数字的区间了
    需要用到ASCII码对照表
     */

    public static void main(String[] args) {
        char a = 'A';
        short a1 = (short) a;  //字符A 转换成数字a1 是65
        System.out.println(a1);
        short s = 90;
        char s1 = (char) s;   //数字90 转换为字符s1 是Z
        System.out.println(s1);

        System.out.println("=======");
        //方法1
        char cs[] = new char[5];
        short start = '0';
        short end = 'z'+1;  //0-9的ASCII码为48-57，A-Z的ASCII码为65-90，a-z的ASCII码为97-122。为什么要z + 1 ，因为0-9是10个数，所以需要z+1
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
        System.out.println(result);

        //方法2
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool+=(char)i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool+=(char)i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool+=(char)i;
        }
        char cs2[] = new char[5];
        for (int i = 0; i < cs2.length; i++) {
            int index = (int) (Math.random()*pool.length());
            cs2[i] =  pool.charAt( index );
        }
        String result2 = new String(cs2);  //字符数组 转换为 字符串
        System.out.println(result2);

    }

    /* 示例 8 : 练习-字符串数组排序
    创建一个长度是8的字符串数组
    使用8个长度是5的随机字符串初始化这个数组
    对这个数组进行排序，按照每个字符串的首字母排序(无视大小写)

    注1： 不能使用Arrays.sort() 要自己写
    注2： 无视大小写，即 Axxxx 和 axxxxx 没有先后顺序
    类：HelloWorld
     */

    /* 示例 10 : 练习-穷举法破解密码
    1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
    2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
    要求： 分别使用多层for循环 和 递归解决上述问题
    分别使用多层for循环->PassWord
    递归->Recursion
     */

    /* 补充：递归函数
    递归就是一个函数在它的函数体内调用它自身。执行递归函数将反复调用其自身，每调用一次就进入新的一层。递归函数必须有结束条件。
    当函数在一直递推，直到遇到墙后返回，这个墙就是结束条件。
    所以递归要有两个要素，结束条件与递推关系。
    1、用递归方式实现 99乘法表，类：Test1
    2、使用Java代码求5的阶乘。（5的阶乘=5*4*3*2*1），类：Test2
     */







}
