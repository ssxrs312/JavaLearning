package chapter1.node5;

import java.util.Scanner;

public class ProcessControl2 {
    public static void main(String[] args) {
        /* switch 语句相当于 if else的另一种表达方式
        switch可以使用byte,short,int,char,String,enum

        注: 每个表达式结束，都应该有一个break;
        注: String在Java1.7之前是不支持的, Java从1.7开始支持switch用String的，编译后是把String转化为hash值，其实还是整数
        注: enum是枚举类型，在枚举章节有详细讲解
         */
        //如果使用if else
        int day = 5;
        if (day==1)
            System.out.println("星期一");

        else if (day==2)
            System.out.println("星期二");
        else if (day==3)
            System.out.println("星期三");
        else if (day==4)
            System.out.println("星期四");
        else if (day==5)
            System.out.println("星期五");
        else if (day==6)
            System.out.println("星期六");
        else if (day==7)
            System.out.println("星期天");
        else
            System.out.println("这个是什么鬼？");

        //如果使用switch
        switch(day){
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }

        /* 练习-季节
        通过Scanner 输入月份，然后使用switch 判断季节
        12月-1月-2月，冬季
        3月-4月-5月，春季
        6-7-8，夏季
        9-10-11，秋季
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份：");
        int i = scanner.nextInt();
        //第一种写法
//        switch(i){
//            case 1:
//                System.out.println("冬季");
//                break;
//            case 2:
//                System.out.println("冬季");
//                break;
//            case 3:
//                System.out.println("春季");
//                break;
//            case 4:
//                System.out.println("春季");
//                break;
//            case 5:
//                System.out.println("春季");
//                break;
//            case 6:
//                System.out.println("夏季");
//                break;
//            case 7:
//                System.out.println("夏季");
//                break;
//            case 8:
//                System.out.println("夏季");
//                break;
//            case 9:
//                System.out.println("秋季");
//                break;
//            case 10:
//                System.out.println("秋季");
//                break;
//            case 11:
//                System.out.println("秋季");
//                break;
//            case 12:
//                System.out.println("冬季");
//                break;
//            default:
//                System.out.println("这个是什么鬼？");
//        }
        //第二种写法
        switch (i){
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("这个是什么鬼？");
        }
    }
}
