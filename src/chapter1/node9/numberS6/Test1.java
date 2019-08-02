package chapter1.node9.numberS6;
//用递归方式实现 99乘法表
public class Test1 {
    public static void main(String[] args) {
        m(9);
    }

    private static void m(int i){
        if(i==1){
            System.out.println("1*1=1");
        }else {
            m(i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.println(i + "*" + j + "=" + (i * j) + "");
            }
        }
    }
}
