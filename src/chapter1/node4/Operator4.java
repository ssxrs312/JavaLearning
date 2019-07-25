package chapter1.node4;

public class Operator4 {
    public static void main(String[] args) {
        /* 一个整数的二进制表达
        通过Integer.toBinaryString() 方法，将一个十进制整数转换为一个二进制字符串
         */
        int i = 5;
        String b = (Integer.toBinaryString(i)); // 5的二进制的表达101
        System.out.println(i+" 的二进制表达是: "+b);

        /* 位或|
        1和0对比，只要有一个是1，结果就是1
         */
        int i1  =5;
        int j1 = 6;

        System.out.println(Integer.toBinaryString(i1)); //5的二进制是101

        System.out.println(Integer.toBinaryString(j1)); //6的二进制是110

        System.out.println(i1|j1); //所以 5|6 对每一位进行或运算，得到 111->7

        /* 位与&
        1和0对比，全部为1，结果才是1
         */
        int i2  =5;
        int j2 = 6;

        System.out.println(Integer.toBinaryString(i2)); //5的二进制是101

        System.out.println(Integer.toBinaryString(j2)); //6的二进制是110

        System.out.println(i2&j2); //所以 5&6 对每一位进行与运算，得到 100->4

        /* 异或^
        1和0对比，不同为true就是1；相同为false就是0
        特殊情况：任何数和自己进行异或 都等于 0；任何数和0 进行异或 都等于自己
         */
        int i3  =5;
        int j3 = 6;
        System.out.println(Integer.toBinaryString(i3)); //5的二进制是 101
        System.out.println(Integer.toBinaryString(j3)); //6的二进制是110
        System.out.println(i3^j3); //所以 5^6 对每一位进行或运算，得到 011->3

        System.out.println(i3^0);//i3=5,任何数和0 进行异或 都等于自己
        System.out.println(i3^i3);//任何数和自己进行异或 都等于 0

        /* 取非~
        1的取非就是0，0的取非就是1
         */
        byte i4  =5;

        System.out.println(Integer.toBinaryString(i4)); //5的二进制是00000101,所以取非即为11111010,即为-6

        System.out.println(~i4);

        /* 左移<< 右移>>
        左移：根据一个整数的二进制表达，将其每一位都向左移动，最右边一位补0
        右移：根据一个整数的二进制表达，将其每一位都向右移动
         */
        byte i5  =6;

        //6的二进制是110
        System.out.println(Integer.toBinaryString(i5));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(i5<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(i5>>1);

        /* 练习，不用乘法符号(*) 计算 2x16
        二进制左移相当于*2，二进制右移相当于/2。*16相当于左移了4位，使用 2 * 16相当于 2<<4 位
         */
        int i6 = 2;
        int j6 = 2*16; //使用乘法
        System.out.println("j6=2*16:\t"+j6);
        int k = 2<<4;
        System.out.println("k=2<<4:\t"+k);

        /* 带符号右移与无符号右移
        带符号右移 >>
        无符号右移>>>
         */
        int i7  =-10;

        //-10的二进制是11111111111111111111111111110110
        //第一位是1，即符号位，代表这是一个负数
        System.out.println(Integer.toBinaryString(i7));

        //对于正数， 带符号右移 >> 会把所有的位右移，并在最前面补0
        //对于负数， 带符号右移 >> 会把所有的位右移，并在最前面补1

        //-10带符号右移1位，移动后前面补齐1
        //得到11111111111111111111111111111011
        //因为第一位是1，所以依然是一个负数，对应的十进制是-5
        int j7 = i7>>1;
        System.out.println(Integer.toBinaryString(j7));
        System.out.println(j7);

        //-10无符号向右移1位，符号位也会向右移，第一位就变成了0
        //得到01111111111111111111111111111011，对应的十进制是2147483643
        int k7 = i7>>>1;
        System.out.println(Integer.toBinaryString(k7));

        System.out.println(k7);

        /* 练习-位操作符
         */
        int i8 = 3; // 二进制是11
        int j8 = 2; // 二进制是10
        int c8 = ((i8 | j8) ^ (i8 & j8)) << 2 >>> 1;
        //          11
        //                    10
        //               01
        //                            0100
        //                                  010
        //010=2,c8=2
        System.out.println(c8);//2
    }
}
