package chapter1.node6;

public class Array4 {
    public static void main(String[] args) {
        /* 增强型for循环在遍历一个数组的时候会更加快捷
        增强型for循环
        注：增强型for循环只能用来取值，却不能用来修改数组里的值
         */
        int values [] = new int[]{18,62,68,82,65,9};
        //常规遍历
        for (int i = 0; i < values.length; i++) {
            int each = values[i];
            System.out.println(each);
        }

        System.out.println("=======");
        //增强型for循环遍历
        for (int each : values) {
            System.out.println(each);
        }

        /* 练习-最大值
        用增强型for循环找出最大的那个数
         */

        //增强型for循环
        int max = -1;
        for (int pre:values){
            if (pre>max){
                max = pre;
            }
        }
        System.out.println("最大的值为："+max);



    }
}
