package chapter1.node6;

public class Array3 {
    public static void main(String[] args) {
        /* 选择法排序，也叫做正排序，从小到大排序
        选择法排序的思路：
        把第一位和其他所有的进行比较，只要比第一位小的，就换到第一个位置来
        比较完后，第一位就是最小的
        然后再从第二位和剩余的其他所有进行比较，只要比第二位小，就换到第二个位置来
        比较完后，第二位就是第二小的
         */
        int a [] = new int[]{18,62,68,82,65,9};
        //排序前，先把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        //选择法排序

        //第一步： 把第一位和其他所有位进行比较
        //如果发现其他位置的数据比第一位小，就进行交换

        for (int i = 1; i < a.length; i++) {
            if(a[i]<a[0]){
                int temp = a[0];
                a[0] = a[i];
                a[i] = temp;
            }
        }
        //把内容打印出来
        //可以发现，最小的一个数，到了最前面
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        //第二步： 把第二位的和剩下的所有位进行比较
        for (int i = 2; i < a.length; i++) {
            if(a[i]<a[1]){
                int temp = a[1];
                a[1] = a[i];
                a[i] = temp;
            }
        }
        //把内容打印出来
        //可以发现，倒数第二小的数，到了第二个位置
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");

        //可以发现一个规律
        //移动的位置是从0 逐渐增加的
        //所以可以在外面套一层循环

        for (int j = 0; j < a.length-1; j++) {
            for (int i = j+1; i < a.length; i++) {
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }

        //把内容打印出来
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        System.out.println("=======");

        /* 冒泡法排序，也叫做倒排序，从大到小排序
        冒泡法排序的思路：
        第一步：从第一位开始，把相邻两位进行比较
        如果发现前面的比后面的大，就把大的数据交换在后面，循环比较完毕后，最后一位就是最大的
        第二步： 再来一次，只不过不用比较最后一位
         */
        int b [] = new int[]{18,62,68,82,65,9};
        //排序前，先把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");
        //冒泡法排序

        //第一步：从第一位开始，把相邻两位进行比较
        //如果发现前面的比后面的大，就把大的数据交换在后面

        for (int i = 0; i < b.length-1; i++) {
            if(b[i]>b[i+1]){
                int temp = b[i];
                b[i] = b[i+1];
                b[i+1] = temp;
            }
        }
        //把内容打印出来
        //可以发现，最大的到了最后面
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");

        //第二步： 再来一次，只不过不用比较最后一位，倒数第二大的放在最后面倒数第二的位置
        for (int i = 0; i < b.length-2; i++) {
            if(b[i]>b[i+1]){
                int temp = b[i];
                b[i] = b[i+1];
                b[i+1] = temp;
            }
        }
        //把内容打印出来
        //可以发现，倒数第二大的到了倒数第二个位置
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");

        //可以发现一个规律
        //后边界在收缩
        //所以可以在外面套一层循环

        for (int j = 0; j < b.length; j++) {
            for (int i = 0; i < b.length-j-1; i++) {
                if(b[i]>b[i+1]){
                    int temp = b[i];
                    b[i] = b[i+1];
                    b[i+1] = temp;
                }
            }
        }

        //把内容打印出来
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println(" ");

        System.out.println("=======");
        /* 练习-排序
        首先创建一个长度是5的数组,并填充随机数。

        首先用选择法正排序，然后再对其使用冒泡法倒排序

        注 所谓的正排序就是从小到大排序，倒排序就是从大到小排序
         */
        int[] x = new int[5];
        x[0] = (int) (Math.random()*100);
        x[1] = (int) (Math.random()*100);
        x[2] = (int) (Math.random()*100);
        x[3] = (int) (Math.random()*100);
        x[4] = (int) (Math.random()*100);
        //把内容打印出来
        for (int i =0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println(" ");

        //正排序，左边的数 和 右边的数 比大小
        for (int i = 0;i<x.length-1;i++){  //左边的数
            for (int j = i+1;j<x.length;j++){  //右边的数
                if (x[j]<x[i]){   //右边的数 < 左边的数
                    int temp = x[j];
                    x[j] = x[i];
                    x[i] = temp;
                }
            }
        }
        //把内容打印出来
        for (int i =0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println(" ");

        //倒排序
        for (int i = 0;i<x.length-1;i++){   //最后一个数放最大值
            for (int j = 0;j<x.length-i-1;j++){  //最后倒数第2个数放倒数第2的数，依次类推
                if (x[j]>x[j+1]){  //左边的数 > 右边的数
                    int temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] =temp;
                }
            }
        }
        //把内容打印出来
        for (int i =0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println(" ");

    }
}
