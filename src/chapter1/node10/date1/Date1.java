package chapter1.node10.date1;

import java.util.Date;

public class Date1 {
    /* Date类
    注意：是java.util.Date;
    而非 java.sql.Date，此类是给数据库访问的时候使用的

     */

    /* 示例 1 : 时间原点概念
    所有的数据类型，无论是整数，布尔，浮点数还是字符串，最后都需要以数字的形式表现出来。

    日期类型也不例外，换句话说，一个日期，比如2020年10月1日，在计算机里，会用一个数字来代替。

    那么最特殊的一个数字，就是零. 零这个数字，就代表Java中的时间原点，其对应的日期是1970年1月1日 8点0分0秒 。
    (为什么是8点，因为中国的太平洋时区是UTC-8，刚好和格林威治时间差8个小时)

    为什么对应1970年呢？ 因为1969年发布了第一个 UNIX 版本：AT&T，综合考虑，当时就把1970年当做了时间原点。

    所有的日期，都是以为这个0点为基准，每过一毫秒，就+1。
     */

    /* 示例 2 : 创建日期对象
    类：TestDate
     */

    /* 示例 3 : getTime
    getTime() 得到一个long型的整数
    这个整数代表 从1970.1.1 08:00:00:000 开始 每经历一毫秒，增加1
    直接打印对象，会看到 “Tue Jan 05 09:51:48 CST 2016” 这样的格式，可读性比较差，为了获得“2016/1/5 09:51:48”这样的格式 请参考日期格式化
     类：TestDate
     */

    /* 示例 4 : System.currentTimeMillis()
    当前日期的毫秒数
    new Date().getTime() 和 System.currentTimeMillis() 是一样的
    不过由于机器性能的原因，可能会相差几十毫秒，毕竟每执行一行代码，都是需要时间的
     */

    /* 示例 5 : 练习-日期
    借助随机数，创建一个从1995.1.1 00:00:00 到 1995.12.31 23:59:59 之间的随机日期
     */
    public static void main(String[] args) {
        long second = 1000;            //秒，1秒=1000毫秒
        long minute = 60*second;      //分
        long hour = minute * 60;     //时
        long day = hour*24;         //天
        long year = day * 365;     //年
        long year1995Start  = (1995-1970) * year;    //从时间原点经历了多少毫秒
        long leapDay = (1995-1970)/4*day; //每隔4年有一个润日
        year1995Start+=leapDay;
        long eightHour = hour*8; //8个小时的毫秒数，因为从0毫秒对应的是1970.1.1 08:00:00
        year1995Start-=eightHour;

        Date dateStart = new Date(year1995Start);
        System.out.println("1995年第一天："+ dateStart);
        Date dateEnd = new Date(year1995Start + year - 1);
        System.out.println("1995年最后一天："+ dateEnd);
        Date dateRandom = new Date((long) (Math.random() * (year - 1) + year1995Start));
        System.out.println("1995年随机的一天："+dateRandom);


    }
}
