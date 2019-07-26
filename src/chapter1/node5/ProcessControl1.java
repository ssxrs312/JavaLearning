package chapter1.node5;

import java.util.Scanner;

public class ProcessControl1 {

    public static void main(String[] args) {
        /* if
        if(表达式1){
            表达式2；
        }
        如果表达式1的值是true,就执行表达式2
         */
        boolean b = true;
        //如果成立就打印yes
        if(b){
            System.out.println("yes");
        }

        /* 多表达式与一个表达式

         */
        boolean b1 = false;
        //如果有多个表达式，必须用大括弧包括起来
        if(b1){
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }

        //否则表达式2 3 无论b1是否为true都会执行

        if(b1)
            System.out.println("yes1");
        System.out.println("yes2");
        System.out.println("yes3");

        //如果只有一个表达式可以不用写括弧，看上去会简约一些
        if(b1){
            System.out.println("yes1");
        }

        if(b1)
            System.out.println("yes1");

        /* if 使用过程中可能遇到的坑
        在第52行，if后面有一个分号; 而分号也是一个完整的表达式
        如果b为true，会执行这个分号，然后打印yes
        如果b为false，不会执行这个分号，然后打印yes
        这样，看上去无论如何都会打印yes
         */
        boolean b2 = false;

        if (b2);
        System.out.println("yes");

        /* if else
        else 代表不成立的情况
         */
        boolean b3 = false;

        if (b3)
            System.out.println("yes");
        else
            System.out.println("no");

        /* else if
        else if 是多条件判断
         */
        //如果只使用 if,会执行4次判断
        int i = 2;
        if (i==1)
            System.out.println(1);
        if (i==2)
            System.out.println(2);
        if (i==3)
            System.out.println(3);
        if (i==4)
            System.out.println(4);

        //如果使用else if, 一旦在82行，判断成立， 84行和86行的判断就不会执行了，节约了运算资源
        if (i==1)
            System.out.println(1);
        else if (i==2)
            System.out.println(2);
        else if (i==3)
            System.out.println(3);
        else if (i==4)
            System.out.println(4);

        /* 练习BMI
        使用Scanner收集你的身高体重，并计算出你的BMI值是多少
        BMI的计算公式是 体重(kg) / (身高*身高)
        比如邱阳波的体重是72kg, 身高是1.69，那么这位同学的BMI就是72 / (1.69*1.69) = ?
        然后通过条件判断BMI的范围，打印出是超重还是正常
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入身高(m):");
        float height = scanner.nextFloat();
        System.out.println("请输入体重（kg):");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * height);
        //第一种写法
//        if (BMI < 18.5)
//            System.out.println("体重过轻");
//        else if (BMI >= 18.5 && BMI < 24 )
//            System.out.println("体重在正常范围");
//        else if (BMI >= 24 && BMI < 27)
//            System.out.println("体重过重");
//        else if (BMI >= 27 && BMI < 30)
//            System.out.println("轻度肥胖");
//        else if (BMI >= 30 && BMI < 35)
//            System.out.println("中度肥胖");
//        else if(BMI >= 35)
//            System.out.println("重度肥胖");
        //第二种写法，确实简便了一些
        if (BMI < 18.5)
            System.out.println("体重过重");
        else if (BMI < 24)
            System.out.println("正常范围");
        else if (BMI < 27)
            System.out.println("体重过重");
        else if (BMI < 30)
            System.out.println("轻度肥胖");
        else if (BMI < 35)
            System.out.println("中度肥胖");
        else if (BMI >=35)
            System.out.println("重度肥胖");

        /* 练习闰年
        判断某一年是否为闰年
        通过Scanner 输入一个年份，然后判断该年是否是闰年

        闰年判断标准
        1. 能够被400整除,
        2. 判断方法：取模400，值=0，是闰年，值!=0，不是闰年
         */
        System.out.println("请输入年份：");
        int year1 = scanner.nextInt();
        int rn = year1 % 400;
        if (rn != 0)
            System.out.println(year1 + "不是闰年");
        else
            System.out.println(year1 + "是闰年");

    }
}
