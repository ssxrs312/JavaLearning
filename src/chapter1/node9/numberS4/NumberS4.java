package chapter1.node9.numberS4;

public class NumberS4 {
    /* 步骤 1 : 格式化输出
    如果不使用格式化输出，就需要进行字符串连接，如果变量比较多，拼接就会显得繁琐
    使用格式化输出，就可以简洁明了

    %s 表示字符串
    %d 表示数字
    %n 表示换行
    类：TestNumber
     */

    /* 步骤 2 : printf和format
    printf和format能够达到一模一样的效果，如何通过eclipse查看java源代码 可以看到，在printf中直接调用了format
    类：TestNumber
     */

    /* 步骤 3 : 换行符
    换行符就是另起一行 --- '\n' 换行（newline）
    回车符就是回到一行的开头 --- '\r' 回车（return）
    在eclipse里敲一个回车，实际上是回车换行符
    Java是跨平台的编程语言，同样的代码，可以在不同的平台使用，比如Windows,Linux,Mac
    然而在不同的操作系统，换行符是不一样的
    （1）在DOS和Windows中，每行结尾是 “\r\n”；
    （2）Linux系统里，每行结尾只有 “\n”；
    （3）Mac系统里，每行结尾是只有 "\r"。
    为了使得同一个java程序的换行符在所有的操作系统中都有一样的表现，使用%n，就可以做到平台无关的换行
        System.out.printf("这是换行符%n");
        System.out.printf("这是换行符%n");
     */

    /* 步骤 4 : 总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达
    类：TestNumber
     */

    /* 步骤 5 : 练习-黄鹤
    借助Scanner 读取字符串数据，然后用格式化输出下面
    浙江温州最大皮革厂江南皮革厂倒闭了，王八蛋老板黄鹤吃喝嫖赌，欠下了3.5个亿，带着他的小姨子跑了!
    我们没有办法，拿着钱包抵工资!原价都是一百多、两百多、三百多的钱包，现在全部只卖二十块，统统只要二十块!
    黄鹤王八蛋，你不是人!我们辛辛苦苦给你干了大半年，你不发工资，你还我血汗钱，还我血汗钱!
     */

}
