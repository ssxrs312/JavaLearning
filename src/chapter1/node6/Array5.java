package chapter1.node6;

public class Array5 {
    public static void main(String[] args) {
        /* 数组的长度是不可变的，一旦分配好空间，是多长，就多长，不能增加也不能减少
        复制数组
        把一个数组的值，复制到另一个数组中
        System.arraycopy(src, srcPos, dest, destPos, length)
        src: 源数组
        srcPos: 从源数组复制数据的起始位置
        dest: 目标数组
        destPos: 复制到目标数组的起始位置
        length: 复制的长度
         */
        int a [] = new int[]{18,62,68,82,65,9};

        int b[] = new int[3];//分配了长度是3的空间，但是没有赋值

        //通过数组赋值把，a数组的前3位赋值到b数组

        //方法一： for循环

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }

        //方法二: System.arraycopy(src, srcPos, dest, destPos, length)
        //src: 源数组
        //srcPos: 从源数组复制数据的起始位置
        //dest: 目标数组
        //destPos: 复制到目标数组的启始位置
        //length: 复制的长度
        System.arraycopy(a, 0, b, 0, 3);

        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println("=======");
        /* 练习-合并数组
        首先准备两个数组，他俩的长度是5-10之间的随机数，并使用随机数初始化这两个数组
        然后准备第三个数组，第三个数组的长度是前两个的和
        通过System.arraycopy 把前两个数组合并到第三个数组中
         */

        int[] x = new int[(int) (Math.random()*5+5)];
        for (int i=0;i<x.length;i++)
            x[i] = (int) (Math.random()*100);
        //打印
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println(" ");

        int[] y = new int[(int) (Math.random()*5+5)];
        for (int i=0;i<y.length;i++)
            y[i] = (int) (Math.random()*100);
        //打印
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i] + " ");
        }
        System.out.println(" ");


        int[] z = new int[x.length+y.length];
        System.arraycopy(x,0,z,0,x.length);
        System.arraycopy(y,0,z,x.length,y.length);
        //打印
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i] + " ");
        }
        System.out.println(" ");






    }
}
