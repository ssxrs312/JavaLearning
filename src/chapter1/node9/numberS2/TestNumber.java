package chapter1.node9.numberS2;

public class TestNumber {
    public static void main(String[] args) {
        int i = 5;

        //方法1,String.valueOf()
        String str = String.valueOf(i);
        System.out.println(str);

        //方法2,把int转换成Integer，然后用toString()
        Integer it = i;
        String str2 = it.toString();
        System.out.println(str2);

        String s = "999";
        //字符串转换为int
        int ih= Integer.parseInt(s);
        System.out.println(ih);

        /*
        把浮点数 3.14 转换为 字符串 "3.14"
        再把字符串 “3.14” 转换为 浮点数 3.14
        如果字符串是 3.1a4，转换为浮点数会得到什么？
         */
        float a = 3.14f;
        String s1 = String.valueOf(a);
        System.out.println(s1);

        String str3 = "3.14";
        float a1 = Float.parseFloat(str3);
        System.out.println(a1);

        ////如果字符串内容不是合法的数字表达，那么转换就会报错(抛出异常)
        String str4 = "3.1a4";
        float a2 = Float.parseFloat(str4);
        System.out.println(a2);
    }
}
