package chapter1.node6;

public class Array6 {
    public static void main(String[] args) {
        /*
        这是一个一维数组, 里面的每一个元素，都是一个基本类型int
        int a[] =new int[]{1,2,3,4,5};
        这是一个二维数组，里面的每一个元素，都是一个一维数组
        所以二维数组又叫数组的数组
        int b[][] = new int[][]{
           {1,2,3},
           {4,5,6},
           {7,8,9}
        };
         */

        /* 初始化二维数组

         */
        //初始化二维数组，
        int[][] a = new int[2][3]; //有两个一维数组，每个一维数组的长度是3
        a[1][2] = 5;  //可以直接访问一维数组，因为已经分配了空间

        //只分配了二维数组
        int[][] b = new int[2][]; //有两个一维数组，每个一维数组的长度暂未分配
        b[0]  =new int[3]; //必须事先分配长度，才可以访问
        b[0][2] = 5;

        //指定内容的同时，分配空间
        int[][] c = new int[][]{
                {1,2,4},
                {4,5},
                {6,7,8,9}
        };

        System.out.println("=======");
        /* 练习-二维数组
        定义一个5X5的二维数组。 然后使用随机数填充该二维数组。
        找出这个二维数组里，最大的那个值，并打印出其二维坐标
         */
        int[][] x = new int[5][5];

        //初始化这个数组
        for (int i = 0;i<x.length;i++){
            for (int j = 0;j<x[i].length;j++){
                x[i][j] = (int)(Math.random()*100);
            }
        }

        //打印
        for (int[] row:x){
            for (int each:row){
                System.out.print(each + "\t");
            }
            System.out.println(" ");
        }

        //找出这个二维数组里，最大的那个值
        int max = -1;
        int target_i = -1;
        int target_j = -1;
        for (int i = 0;i<x.length;i++){
            for (int j = 0;j<x[i].length;j++){
                if (x[i][j]>max){
                    max = x[i][j];
                    target_i = i;
                    target_j = j;
                }
            }
        }

        //打印
        System.out.println("最大的值"+max+"。坐标：["+target_i+"] ["+target_j+"]");
    }
}
