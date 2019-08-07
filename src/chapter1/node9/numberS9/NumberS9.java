package chapter1.node9.numberS9;

public class NumberS9 {
    /*
    StringBuffer是可变长的字符串
     */

    /* 示例 1 : 追加 删除 插入 反转
    append追加
    delete 删除
    insert 插入
    reverse 反转
     */
    public static void main(String[] args) {
        String str1 = "let there ";

        StringBuffer sb = new StringBuffer(str1); //根据str1创建一个StringBuffer对象
        sb.append("be light"); //在最后追加

        System.out.println(sb);

        sb.delete(4, 10);//删除4-10之间的字符

        System.out.println(sb);

        sb.insert(4, "there ");//在4这个位置插入 there

        System.out.println(sb);

        sb.reverse(); //反转

        System.out.println(sb);

    /* 示例 2 : 长度 容量
    为什么StringBuffer可以变长？
    和String内部是一个字符数组一样，StringBuffer也维护了一个字符数组。 但是，这个字符数组，留有冗余长度
    比如说new StringBuffer("the")，其内部的字符数组的长度，是19，而不是3，这样调用插入和追加，在现成的数组的基础上就可以完成了。
    如果追加的长度超过了19，就会分配一个新的数组，长度比原来多一些，把原来的数据复制到新的数组中，看上去 数组长度就变长了 参考MyStringBuffer
    length: “the”的长度 3
    capacity: 分配的总空间 19

    注： 19这个数量，不同的JDK数量是不一样的
     */
        String str2 = "the";

        StringBuffer sb2 = new StringBuffer(str2);

        System.out.println(sb2.length()); //内容长度

        System.out.println(sb2.capacity());//总空间


    /* 示例 3 : 练习-StringBuffer性能
    String与StringBuffer的性能区别?

    生成10位长度的随机字符串
    然后,先使用String的+,连接10000个随机字符串,计算消耗的时间
    然后,再使用StringBuffer连接10000个随机字符串,计算消耗的时间

    提示: 使用System.currentTimeMillis() 获取当前时间(毫秒)
     */
        int length = 10;
        int total = 10000;
        String strResult = "";
        long start = System.currentTimeMillis();
        String str3 = randomString(length);
        for (int i = 0;i<total;i++){
            strResult += str3;
        }
        long end = System.currentTimeMillis();
        long l = end - start;

        System.out.format("使用字符串+的方式进行连接，连接%d次，耗时%d毫秒%n",total,l);

        long start1 = System.currentTimeMillis();
        StringBuffer strb = new StringBuffer();
        total *=100;
        for (int i = 0;i<total;i++){
            strb.append(str3);
        }
        long end1 = System.currentTimeMillis();

        System.out.format("使用StringBuffer的方式进行连接，连接%d次，耗时%d毫秒%n",total,end1-start1);

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

    /* 示例 5 : 练习-MyStringBuffer
    根据接口IStringBuffer ，自己做一个MyStringBuffer
    接口：IStringBuffer
    类：MyStringBuffer
    步骤 1 : IStringBuffer接口
    步骤 2 : value和capacity
        value：用于存放字符数组
        capacity： 容量
        无参构造方法：	根据容量初始化value
        public MyStringBuffer(){
            value = new char[capacity];
        }
    步骤 3 : 带参构造方法
        调用无参构造，生成固定长度16的字符数组
        容量<字符串长度
        容量>=字符串长度
        生成length的值
    步骤 4 : 反转 reverse
    步骤 5 : 插入insert 和 append
        边界条件判断
        扩容
        先把已经存在的数据往后移
        把要插入的数据插入到指定位置
        修改length的值
        insert(int, char)
        append
    步骤 6 : 主程序中测试
        重写toString
        测试
    步骤 7 : 删除 delete
    步骤 8 : 练习-性能比较
    使用Java自带的 StringBuffer 和 这个我们自己开发的MyStringBuffer性能比较。
    参考比较方案:
    1. 生成长度是10的随机字符串
    2. 使用StringBuffer追加1000000次统计时间,41毫秒
    3. 使用MyStringBuffer追加1000000次统计时间,73毫秒

     */
}
