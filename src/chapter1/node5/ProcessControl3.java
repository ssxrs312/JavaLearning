package chapter1.node5;

import java.util.Scanner;

public class ProcessControl3 {
    public static void main(String[] args) {
        /* while和do-while循环语句
        条件为true时 重复执行，只要while中的表达式成立，就会不断地循环执行
         */
        //打印0到4
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
        }

        /*
        条件为true时 重复执行，至少会执行一次
        do{
        } while 循环
        与while的区别是，无论是否成立，先执行一次，再进行判断
         */
        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int i1 = 0;
        do{
            System.out.println(i1);
            i1++;
        } while(i1<5);

        /* 练习-阶乘
        通过Scanner 获取一个整数，然后使用while计算这个整数的阶乘
        N的阶乘等于 N* (N-1) * (N-2) * ... * 1
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int i2 = scanner.nextInt();
        int fac = 1;
        while (i2>=1){
            fac*=i2;
            i2--;

        }
        System.out.println("整数的阶乘结果为："+fac);

    }

}
