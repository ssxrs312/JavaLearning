package chapter1.node5;

public class ProcessControl4 {
    public static void main(String[] args) {
        /* for循环，和while一样，只是表达方式不一样
        比较for和while
         */
        //使用while打印0到4
        int i = 0;
        while(i<5){
            System.out.println("while循环输出的"+i);
            i++;
        }

        //使用for打印0到4
        for (int j = 0; j < 5; j++) {
            System.out.println("for  循环输出的"+j);
        }

        /* 练习-乞丐
        天朝有一个乞丐姓洪，去天桥要钱
        第一天要了1块钱
        第二天要了2块钱
        第三天要了4块钱
        第四天要了8块钱
        以此类推

        问题： 洪乞丐干10天，收入是多少？
         */
        int sum = 0;
        for (int k = 0; k < 10; k++){
            int t = k+1;
            System.out.println("第"+t+"天要了"+(int)Math.pow(2,k)+"块钱");

            int pow = (int) Math.pow(2, k);
            sum += pow;
            System.out.println("洪乞丐第"+t+"天的总收入是："+sum);


        }


    }
}
