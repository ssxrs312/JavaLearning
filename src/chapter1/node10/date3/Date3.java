package chapter1.node10.date3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date3 {
    /*
    Calendar类即日历类，常用于进行“翻日历”，比如下个月的今天是多久
     */

    /* 示例 1 : Calendar与Date进行转换
    采用单例模式获取日历对象Calendar.getInstance();
     */

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        //采用单例模式获取日历对象Calendar.getInstance();
        Calendar c = Calendar.getInstance();

        //通过日历对象得到日期对象
        Date now = c.getTime();   //当前时间
        System.out.println(format(now));

        Date d2 = new Date(0);
        c.setTime(d2); //把这个日历，调成日期 : 1970.1.1 08:00:00
        System.out.println(format(d2));

        System.out.println("=======");
        /* 示例 2 : 翻日历
        add方法，在原日期上增加年/月/日
        set方法，直接设置年/月/日
         */
        // 下个月的今天
        c.setTime(now);
        c.add(Calendar.MONTH,1);
        System.out.println("下个月的今天:\t" +format(c.getTime()));

        // 去年的今天
        c.setTime(now);
        c.add(Calendar.YEAR, -1);
        System.out.println("去年的今天:\t" +format(c.getTime()));

        // 上个月的第三天
        c.setTime(now);
        c.add(Calendar.MONTH, -1);
        c.set(Calendar.DATE, 3);
        System.out.println("上个月的第三天:\t" +format(c.getTime()));

        /* 示例 3 : 练习-Calendar
        找出下个月的倒数第3天是哪天
         */
        c.setTime(now);
        c.add(Calendar.MONTH,2);//先翻到下下个月
        c.set(Calendar.DATE,1);//设置到月初
        c.add(Calendar.DATE,-3);//再往回翻3天
        System.out.println("下个月倒数第三天是:" + format(c.getTime()));



    }

    private static String format(Date time){
        return sdf.format(time);
    }

}
