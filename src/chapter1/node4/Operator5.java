package chapter1.node4;

public class Operator5 {

    public static void main(String[] args) {
        /* 赋值操作
        赋值操作的操作顺序是从右到左
        int i = 5+5;
        首先进行5+5的运算，得到结果10，然后把10这个值，赋给i
         */
        int i = 5+5;

        /* 对本身进行运算，并赋值
        +=即自加
        i+=2;
        等同于
        i=i+2;
        其他的 -= , *= , /= , %= , &= , |= , ^= , >>= , >>>= 都是类似，不做赘述
         */

        int i2 =3;
        i2+=2;
        System.out.println(i2);//5

        int j2=3;
        j2=j2+2;
        System.out.println(j2);//5

        //练习
        int i3 = 1;
        i3+=++i3;//i3=1+2=3
        System.out.println(i3);


    }
}
