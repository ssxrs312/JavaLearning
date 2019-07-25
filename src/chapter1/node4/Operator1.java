package chapter1.node4;

import java.util.Scanner;

public class Operator1 {


    public static void main(String[] args) {
        /*
        加减乘除
        */

        int i = 10;
        int j = 5;
        int a = i+j;
        int b = i - j;
        int c = i*j;
        int d = i /j;

        //练习，使用Scanner从控制台获取两个数字，然后计算这两个数字的和

        /*
        截至目前为止，学习了使用System.out.println("") 向控制台输出数据。
        在接下来的练习中，需要用到从控制台输入数据，所以需要用到Scanner类
         */
        Scanner scanner = new Scanner(System.in);
        //使用Scanner读取整数
        int i1 = scanner.nextInt();
        System.out.println("第一个整数："+ i1);
        int i2 = scanner.nextInt();
        System.out.println("第二个整数："+ i2);
        int i4 = i1 + i2;
        System.out.println("两个整数的和：" + i4);
        //使用Scanner读取浮点数
        float v = scanner.nextFloat();
        System.out.println("读取的浮点数的值是："+ v);
        //使用Scanner读取字符串
        String rn = scanner.nextLine();//读取的是回车换行
        String s = scanner.nextLine();
        System.out.println("读取的字符串是："+s);
        //读取了整数后，接着读取字符串
        /*
        需要注意的是，如果在通过nextInt()读取了整数后，再接着读取字符串，读出来的是回车换行:"\r\n",因为nextInt仅仅读取数字信息，
        而不会读取回车换行"\r\n".所以，如果在业务上需要读取了整数后，接着读取字符串，那么就应该连续执行两次nextLine()，
        第一次是取走回车换行，第二次才是读取真正的字符串
         */
        int i3 = scanner.nextInt();
        System.out.println("读取的整数是:"+i3);
        String rn1 = scanner.nextLine();//读取的是回车换行
        String s1 = scanner.nextLine();
        System.out.println("读取的字符串是："+s1);


        //任意运算单元的长度超过int
        /*
        如果有任何运算单元的长度超过int,那么运算结果就按照最长的长度计算
        比如
        int a = 5;
        long b = 6;
        a+b -> 结果类型是long
         */
        int a1 = 5;
        long b1 = 6;
        int c1 = (int) (a1+b1); //a1+b1的运算结果是long型，所以要进行强制转换
        long d1 = a1+b1;

        //任意运算单元的长度小于int
        /*
        如果任何运算单元的长度都不超过int,那么运算结果就按照int来计算
        byte a = 1;
        byte b= 2;
        a+b -> int 类型
         */
        byte a2 = 1;
        byte b2= 2;
        byte c2 = (byte) (a2+b2); //虽然a2 b2都是byte类型，但是运算结果是int类型，需要进行强制转换
        int d2 = a2+b2;

        //%取模
        /*
        % 取余数，又叫取模
        5除以2，余1
         */
        int i12 = 5;
        int j12 = 2;
        System.out.println(i12%j12); //输出为1

        //自增++ 自减--  在原来的基础上增加1或者减少1
        int i13 = 5;
        i13++;
        System.out.println(i13);//输出为6

        //自增 自减操作符置前以及置后的区别
        /*
        以++为例
        int i = 5;
        i++; 先取值，再运算
        ++i; 先运算，再取值
         */
        int i14 = 5;
        System.out.println(i14++); //输出5
        System.out.println(i14);   //输出6

        int j14 = 5;
        System.out.println(++j14); //输出6
        System.out.println(j14);   //输出6

        //练习
        int i15 = 1;
        int j15 = ++i15 + i15++ + ++i15 + ++i15 + i15++;//2 + 2 + 4 + 5 + 5 = 18
        System.out.println("j15的结果：" + j15);
        //i值        2     3     4     5     6
        //取值      2     2     4     5     5

        //练习-BMI
        System.out.println("请输入身高（m）：");
        float height = scanner.nextFloat();
        System.out.println("请输入体重（kg）：");
        float weight = scanner.nextFloat();
        float BMI = weight / (height * height);
        System.out.println("当前的BMI是：" + BMI);


    }
}
