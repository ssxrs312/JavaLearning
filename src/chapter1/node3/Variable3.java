package chapter1.node3;

public class Variable3 {

    public static void main(String[] args) {
        //转换规则
        char c = 'A';
        short s = 80;

        //虽然short和char都是16位的，长度是一样的
        //但是彼此之间，依然需要进行强制转换
        c = (char) s;
        //直接进行转换，会出现编译错误
//        s = c;

        //低精度向高精度转换
        long l = 50;
        int i = 50;

        //int比较小，要放进比较大的long,随便怎么样，都放的进去
        l = i;//把i的值赋给l,i是int型，l是long型，int赋值给long，低精度向高精度转换，这个是可以的

        //高精度向低精度转换
        byte b = 5;
        int i1 = 10;
        int i2 = 300;

        b = (byte) i1;
        //因为i1的值是在byte范围之内，所以即便进行强制转换
        //最后得到的值，也是10
        System.out.println(b);

        //因为i2的值是在byte范围之外，所以就会按照byte的长度进行截取
        //i2的值是300，其对应的二进制数是 100101100
        //按照byte的长度8位进行截取后，其值为 00101100 即44
        b =(byte) i2;
        System.out.println(b);

        //查看一个整数对应的二进制的方法：
        System.out.println(Integer.toBinaryString(i2));

        //练习
        short a = 1;
        short a2 = 2;
        int i3 = a + a2;//整型和整型进行运算的时候，如果两边的值都是小于或者等于int的，那么其结果就是int
        short a3 = (short) i3;
    }
}
