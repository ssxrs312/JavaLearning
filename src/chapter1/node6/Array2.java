package chapter1.node6;



public class Array2 {
    public static void main(String[] args) {
        /* 分配空间与赋值分步进行

         */
        int[] a = new int[5]; //分配了长度是5的数组，但是没有赋值

        //没有赋值，那么就会使用默认值
        //作为int类型的数组，默认值是0
        System.out.println(a[0]);

        //进行赋值

        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;

        /* 分配空间，同时赋值

         */
        //写法一： 分配空间同时赋值
        int[] a1 = new int[]{100,102,444,836,3236};

        //写法二： 省略了new int[],效果一样
        int[] b1 = {100,102,444,836,3236};

        //写法三：同时分配空间，和指定内容
        //在这个例子里，长度是3，内容是5个，产生矛盾了
        //所以如果指定了数组的内容，就不能同时设置数组的长度
//        int[] c1 = new int[3]{100,102,444,836,3236};

        /* 练习-数组反转
        首先创建一个长度是5的数组,并填充随机数。

        使用for循环或者while循环，对这个数组实现反转效果
         */
        int[] x =new int[5];
        x[0] = (int) (Math.random()*100);
        x[1] = (int) (Math.random()*100);
        x[2] = (int) (Math.random()*100);
        x[3] = (int) (Math.random()*100);
        x[4] = (int) (Math.random()*100);
        for (int i=0;i<x.length;i++)
            System.out.println("数组"+x[i]);
        int[] y = new int[5];
        for (int i=0;i<x.length;i++){
            y[i] = x[x.length - i -1];
            System.out.println("反转后的数组"+y[i]);
        }

    }
}
