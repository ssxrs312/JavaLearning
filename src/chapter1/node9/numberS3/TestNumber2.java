package chapter1.node9.numberS3;

import chapter1.node8.interfaceE3.Item;

public class TestNumber2 {
    public static void main(String[] args) {
        int a = 0;
        int count = 0;

        for (int i=0;i<10000000;i++){
            if (isPrime(i)){
                count++;
            }
        }
        System.out.println("一千万以内的质数一共有 : " + count);
    }

    private static Boolean isPrime(int i) {
        for (int j = 2;j<=Math.sqrt(i);j++){    //j<=i的算术平方根，所以j的值只有[2,3,4,5,6,7,8,9...]
            if (0==i%j){                 // i/j能够整除，说明不是质数，所以是false
                return false;
            }
        }
        return true;
    }
}
