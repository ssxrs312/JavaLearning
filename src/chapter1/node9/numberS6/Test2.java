package chapter1.node9.numberS6;
//使用Java代码求5的阶乘。（5的阶乘=5*4*3*2*1）
public class Test2 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    private static int f(int n){
        if (1 == n)
            return 1;
        else
            return n*f(n-1);
    }
}
