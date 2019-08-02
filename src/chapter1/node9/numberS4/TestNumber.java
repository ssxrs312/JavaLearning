package chapter1.node9.numberS4;

import java.util.Locale;
import java.util.Scanner;

public class TestNumber {
    public static void main(String[] args) {
        String name ="盖伦";
        int kill = 8;
        String title="超神";

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";

        System.out.println(sentence);

        //使用格式化输出
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";
        System.out.printf(sentenceFormat,name,kill,title);

        //使用printf格式化输出
        System.out.printf(sentenceFormat,name,kill,title);
        //使用format格式化输出
        System.out.format(sentenceFormat,name,kill,title);

        System.out.printf("这是换行符%n");
        System.out.printf("这是换行符%n");

        System.out.println("=======");

        int year = 2020;
        //总长度，左对齐，补0，千位分隔符，小数点位数，本地化表达

        //直接打印数字
        System.out.format("%d%n",year);
        //总长度是8,默认右对齐
        System.out.format("%8d%n",year);
        //总长度是8,左对齐
        System.out.format("%-8d%n",year);
        //总长度是8,不够补0
        System.out.format("%08d%n",year);
        //千位分隔符
        System.out.format("%,8d%n",year*10000);

        //小数点位数
        System.out.format("%.2f%n",Math.PI);

        //不同国家的千位分隔符
        System.out.format(Locale.FRANCE,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.US,"%,.2f%n",Math.PI*10000);
        System.out.format(Locale.UK,"%,.2f%n",Math.PI*10000);

        System.out.println("=======");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String str = scanner.nextLine();
        System.out.format("%s%n",str);

        System.out.println("=======");
        Scanner s = new Scanner(System.in);
        System.out.println("请输入地名:");
        String location = s.nextLine();
        System.out.println("请输入公司类型:");
        String companyCategory = s.nextLine();
        System.out.println("请输入公司名称:");
        String companyName = s.nextLine();
        System.out.println("请输入老板名称:");
        String bossName = s.nextLine();
        System.out.println("请输入金额:");
        String money = s.nextLine();
        System.out.println("请输入产品:");
        String product = s.nextLine();
        System.out.println("请输入价格计量单位:");
        String unit = s.nextLine();

        String model = "%s最大%s%s倒闭了，王八蛋老板%s吃喝嫖赌，欠下了%s个亿，\r\n"
                + "带着他的小姨子跑了!我们没有办法，拿着%s抵工资!原价都是一%s多、两%s多、三%s多的%s，\r\n"
                + "现在全部只卖二十块，统统只要二十块!%s王八蛋，你不是人!我们辛辛苦苦给你干了大半年，\r\n"
                + "你不发工资，你还我血汗钱，还我血汗钱!";
        System.out.format(model, location,companyCategory,companyName,bossName,money,product,unit,unit,unit,product,bossName);


    }
}
