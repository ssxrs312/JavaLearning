package chapter1.node6;

public class Array1 {
    public static void main(String[] args) {
        /* 数组是一个固定长度的，包含了相同类型数据的 容器
        声明数组
        int[] a; 声明了一个数组变量。
        []表示该变量是一个数组
        int 表示数组里的每一个元素都是一个整数
        a 是变量名
        但是，仅仅是这一句声明，不会创建数组

        有时候也会写成int a[]; 没有任何区别，就是你看哪种顺眼的问题
         */
        // 声明一个数组
        int[] a;

        /* 创建数组
        创建数组的时候，要指明数组的长度。
        new int[5]
        引用概念：
        如果变量代表一个数组，比如a,我们把a叫做引用
        与基本类型不同
        int c = 5; 这叫给c赋值为5
        声明一个引用 int[] a;
        a = new int[5];
        让a这个引用，指向数组
         */
        //声明一个引用
        int[] b;
        //创建一个长度是5的数组，并且使用引用a指向该数组
        b = new int[5];

        int[] c = new int[5]; //声明的同时，指向一个数组

        /* 访问数组
        数组下标基0
        下标0，代表数组里的第一个数
         */
        int[] d;
        d = new int[5];

        d[0]= 1;  //下标0，代表数组里的第一个数
        d[1]= 2;
        d[2]= 3;
        d[3]= 4;
        d[4]= 5;

        /* 数组长度
        .length属性用于访问一个数组的长度
        数组访问下标范围是0到长度-1
        一旦超过这个范围,就会产生数组下标越界异常
         */
        int[] e;
        e = new int[5];

        System.out.println(e.length); //打印数组的长度

        e[4]=100; //下标4，实质上是“第5个”，即最后一个
//        e[5]=101; //下标5，实质上是“第6个”，超出范围 ,产生数组下标越界异常

        /* 练习-数组最小值
        首先创建一个长度是5的数组
        然后给数组的每一位赋予随机整数,0-100的 随机整数
        比如(int) (Math.random() * 100)。Math.random() 会得到一个0-1之间的随机浮点数，然后乘以100，并强转为整型即可。
        通过for循环，遍历数组，找出最小的一个值出来

         */
        int[] x =new int[5];
        x[0] = (int)(Math.random() * 100);
        x[1] = (int)(Math.random() * 100);
        x[2] = (int)(Math.random() * 100);
        x[3] = (int)(Math.random() * 100);
        x[4] = (int)(Math.random() * 100);
        for (int i=0;i<x.length;i++){
            System.out.println("数组下标第"+i+"个的值："+x[i]);
        }
        int min =100;
        for (int i = 0;i<x.length;i++)
            if (x[i] < min)
                min = x[i];
        System.out.println("数组中最小的值："+min);
    }
}
