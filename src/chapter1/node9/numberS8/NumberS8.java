package chapter1.node9.numberS8;

public class NumberS8 {
    /* 示例 1 : 是否是同一个对象
    str1和str2的内容一定是一样的！
    但是，并不是同一个字符串对象
     */
    public static void main(String[] args) {
        String str1 = "the light";

        String str2 = new String(str1);

        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);//false

    /* 示例 2 : 是否是同一个对象-特例
    str1 = "the light";
    str3 = "the light";
    一般说来，编译器每碰到一个字符串的字面值，就会创建一个新的对象
    所以在第9行会创建了一个新的字符串"the light"
    但是在第23行，编译器发现已经存在现成的"the light"，那么就直接拿来使用，而没有进行重复创建
     */
        String str3 = "the light";
        System.out.println( str1  ==  str3);//true

    /* 示例 3 : 内容是否相同
    使用equals进行字符串内容的比较，必须大小写一致
    equalsIgnoreCase，忽略大小写判断内容是否一致

     */
        String str4 = str1.toUpperCase();
        //==用于判断是否是同一个字符串对象
        System.out.println( str1  ==  str2);//false

        System.out.println(str1.equals(str2));//完全一样返回true

        System.out.println(str1.equals(str4));//大小写不一样，返回false
        System.out.println(str1.equalsIgnoreCase(str4));//忽略大小写的比较，返回true

    /* 示例 4 : 是否以子字符串开始或者结束
    startsWith //以...开始
    endsWith //以...结束
     */

        String star1 = "the light";

        String start = "the";
        String end = "Ight";

        System.out.println(star1.startsWith(start));//以...开始   true
        System.out.println(star1.endsWith(end));//以...结束       false

    /* 示例 5 : 练习-比较字符串
    创建一个长度是100的字符串数组
    使用长度是2的随机字符填充该字符串数组
    统计这个字符串数组里重复的字符串有多少种
     */
        String str[] = new String[100];
        for (int i=0;i<str.length;i++){
//            char[] cs = new char[2];
            str[i] = randomString(2);
//            System.out.print(str[i] + " ");
            //打印。20个一行
            if (0==i%20){
                System.out.println(" ");
            }else {
                System.out.print(str[i] + " ");
            }
        }
        System.out.println(" ");
        int count=0;
        String result = "";
        String index = "";
        for (int i=0;i<str.length;i++){     //比较字符串，范围是0-str.length
            for (int j=0;j<str.length;j++){  //比较字符串，范围是0-str.length
                if (str[i]==str[j]){        //当这2个比较字符串对象一样时，跳过进入下一个循环
                    continue;
                }else {                    //字符串对象不一样时，两个字符串的内容相等时
                    if (str[i].equals(str[j])){
                        count++;
                        result += str[i] + " ";
                        index += i + " ";
                    }
                }
            }
        }
        System.out.println("重复的字符串有多种：" + count);
        System.out.println("重复的字符串分别是：" + result);
        System.out.println("重复的字符串所在的位置：" + index);
    }

    //生成一个随机字符串，随机字符串的范围是0-9，a-z,A-Z，长度为length
    private static String randomString(int length){
        String pool = "";
        for (short i = '0'; i <= '9'; i++) {
            pool += (char) i;
        }
        for (short i = 'a'; i <= 'z'; i++) {
            pool += (char) i;
        }
        for (short i = 'A'; i <= 'Z'; i++) {
            pool += (char) i;
        }
        char cs[] = new char[length];
        for (int i = 0; i < cs.length; i++) {
            int index = (int) (Math.random() * pool.length());
            cs[i] = pool.charAt(index);
        }
        String result = new String(cs);  //字符数组 转换为 字符串
        return result;
    }

}
