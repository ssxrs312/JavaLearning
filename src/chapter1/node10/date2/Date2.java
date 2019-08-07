package chapter1.node10.date2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2 {
    /* SimpleDateFormat 日期格式化类
    示例 1 : 日期转字符串
    y 代表年
    M 代表月
    d 代表日
    H 代表24进制的小时
    h 代表12进制的小时
    m 代表分钟
    s 代表秒
    S 代表毫秒
     */
    public static void main(String[] args) {

        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS" );
        Date d= new Date();
        String str = sdf.format(d);
        System.out.println("当前时间通过 yyyy-MM-dd HH:mm:ss SSS 格式化后的输出: "+str);

        SimpleDateFormat sdf1 =new SimpleDateFormat("yyyy-MM-dd" );
        Date d1= new Date();
        String str1 = sdf1.format(d1);
        System.out.println("当前时间通过 yyyy-MM-dd 格式化后的输出: "+str1);

        System.out.println("=======");
        /* 示例 2 : 字符串转日期
        模式（yyyy/MM/dd HH:mm:ss）需要和字符串格式保持一致，如果不一样就会抛出解析异常ParseException
         */
        SimpleDateFormat sdf2 =new SimpleDateFormat("yyyy/MM/dd HH:mm:ss" );

        String str2 = "2016/1/5 12:12:12";

        try {
            Date d2 = sdf2.parse(str2);
            System.out.printf("字符串 %s 通过格式  yyyy/MM/dd HH:mm:ss %n转换为日期对象: %s",str2,d2);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(" ");
        System.out.println("=======");
        /* 示例 3 : 练习-日期格式化
        准备一个长度是9的日期数组
        使用1970年-2000年之间的随机日期初始化该数组
        按照这些日期的时间进行升序排序
        比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大
         */

        Date[] dates = new Date[9];

        //使用1970年-2000年之间的随机日期初始化该数组
        long second = 1000;            //秒，1秒=1000毫秒
        long minute = 60*second;      //分
        long hour = minute * 60;     //时
        long day = hour*24;         //天
        long year = day * 365;     //年
        long year2000Start  = (2000-1970) * year;    //从时间原点经历了多少毫秒
        long leapDay = (2000-1970)/4*day; //每隔4年有一个润日
        year2000Start+=leapDay;
        long eightHour = hour*8; //8个小时的毫秒数，因为从0毫秒对应的是1970.1.1 08:00:00
        year2000Start-=eightHour;

        for (int i=0;i<dates.length;i++){
            long randomDate = (long) (Math.random() * (year2000Start + year));
            Date dateRandom = new Date(randomDate);
            dates[i] = dateRandom;

        }

        //打印
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Date d3:dates){
            String str3 = sdf3.format(d3);
            System.out.println(str3);

        }

        //选择法排序，正排序，左边的数 和 右边的数 比大小
        SimpleDateFormat sdf4 = new SimpleDateFormat("HHmmss");

        for (int i = 0;i<dates.length-1;i++){  //左边的数
            for (int j = i+1;j<dates.length;j++){  //右边的数

                String strI = sdf4.format(dates[i]);
                String strJ = sdf4.format(dates[j]);
                int iI = Integer.parseInt(strI);
                int iJ = Integer.parseInt(strJ);

                if (iJ<iI){   //右边的数 < 左边的数
                    Date temp = dates[j];
                    dates[j] = dates[i];
                    dates[i] = temp;
                }
            }
        }

        System.out.println("=======");
        //把排序后的内容打印出来
        for (Date d3:dates){
            String str3 = sdf3.format(d3);
            System.out.println(str3);
        }





    }
}
