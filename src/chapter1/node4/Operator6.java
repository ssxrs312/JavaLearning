package chapter1.node4;

import java.util.Scanner;

public class Operator6 {

    public static void main(String[] args) {
        /* 三元操作符
        表达式?值1:值2
        如果表达式为真 返回值1
        如果表达式为假 返回值2
         */
        int i = 5;
        int j = 6;

        int k = i < j ? 99 : 88;

        // 相当于
        if (i < j) {
            k = 99;
        } else {
            k = 88;
        }

        System.out.println(k);//99

        //练习，通过Scanner输入一个1-7之间的整数，使用三元操作符判断是工作日还是周末？
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-7的整数：");
        int i1 = scanner.nextInt();
        if (i1 > 0 & i1 < 8){
            String j1 = i1 > 5 & i1 < 8 ? "周末" : "工作日" ;
            System.out.println("您输入的整数经判断后，是："+j1);
        }else {
            System.out.println("您输入的整数超出了1-7");
        }


    }
}
