package chapter1.node4;

public class Operator3 {

    public static void main(String[] args) {
        /* 长路与& 和 短路与&&
        长路与&  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        短路与&& 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        比较两个表达式的运算结果，当全部为true，结果为true；只有1个为true，结果为false
         */
        //长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int i = 2;
        System.out.println( i== 1 & i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);

        //短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
        int j = 2;
        System.out.println( j== 1 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);

        /* 长路或| 和 短路或||
        长路或|  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        短路或|| 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        比较两个表达式的运算结果，只有1个为true时，结果为true；当全部为false时，结果为false
         */
        //长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
        int a = 2;
        System.out.println( a== 1 | a++ ==2  ); //无论如何a++都会被执行，所以a的值变成了3
        System.out.println(a);

        //短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
        int b = 2;
        System.out.println( b== 2 || b++ ==2  );  //因为b==2返回true,所以右边的b++就没有执行了，所以b的值，还是2
        System.out.println(b);

        /* 取反!
        真变为假
        假变为真
         */
        boolean c = true;

        System.out.println(c); //输出true
        System.out.println(!c);//输出false

        /* 异或^
        不同，返回真
        相同，返回假
         */
        boolean a1 = true;
        boolean b1 = false;

        System.out.println(a1^b1); //不同返回真
        System.out.println(a1^!b1); //相同返回假

        //练习
        int x = 1;
        boolean y = !(x++ == 3) ^ (x++ ==2) && (x++==3);
        System.out.println(y);//false
        System.out.println(x);//3

        //i值            2           3
        //表达式           false       true
        //              true    ^   true
        //                      false


    }
}
