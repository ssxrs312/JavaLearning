package chapter1.node4;

import java.util.Scanner;

public class Operator2 {

    public static void main(String[] args) {
        /* 关系操作符
        > 大于
        >= 大于或等于
        < 小于
        <= 小于或等于
        == 是否相等
        != 是否不等
         */
        int a = 5;
        int b = 6;
        int c = 5;

        System.out.println(a>b);  //返回 false
        System.out.println(a>=c);  //返回 true

        System.out.println(a==b); //返回false
        System.out.println(a!=b);//返回true

        //练习，借助Scanner获取控制台输入的两个任意数字，然后使用
        Scanner scanner = new Scanner(System.in);
        int i1 = scanner.nextInt();
        System.out.println("第一个整数是："+ i1);
        int i2 = scanner.nextInt();
        System.out.println("第二个整数是："+ i2);

        System.out.println("比较"+i1+">"+i2+":"+(i1>i2));
        System.out.println("比较"+i1+">="+i2+":"+(i1>=i2));
        System.out.println("比较"+i1+"<"+i2+":"+(i1<i2));
        System.out.println("比较"+i1+"<="+i2+":"+(i1<=i2));
        System.out.println("比较"+i1+"=="+i2+":"+(i1==i2));
        System.out.println("比较"+i1+"!="+i2+":"+(i1!=i2));


    }
}
