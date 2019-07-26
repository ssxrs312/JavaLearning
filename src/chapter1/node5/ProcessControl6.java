package chapter1.node5;

public class ProcessControl6 {
    public static void main(String[] args) {
        /* break,结束循环
        直接结束当前for循环
         */
        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                break; //如果是双数，直接结束循环

            System.out.println(j);
        }

        /* 练习-百万富翁
        假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。

        然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。

        那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
        （复利计算按照每年12000投入计算，不按照每月计息）

        复利公式：
        F = p* ( (1+r)^n );
        F 最终收入
        p 本金
        r 年利率
        n 存了多少年

        假设情景一：
        p = 10000
        r = 0.05
        n = 1

        解读：
        本金是10000
        年利率是5%
        存了一年 1次
        复利收入 10000*( (1+0.05)^1 ) = 10500

        假设情景二：
        p = 10000
        r = 0.05
        n = 2

        解读：
        本金是10000
        年利率是5%
        存了两年
        复利收入 10000*( (1+0.05)^2 ) = 11025

        根据上述公式，复利收入/本金=（1+年利率）^n
        利用代码写出上面的公式=Math.pow(a,b),其中a是（1+年利率），b是n，得出的结果就是复利收入/本金
        比如a=1.05，n=2，那么复利收入/本金=1.1025
        注意：当把结果当作a时，，b就变成1/n，最后计算得出的是底数。比如底数为3，指数为3，那么表示4的3次方，即4^3=64.64开3次方的代码
        写成Math.pow(64,（double）1/3)
         */
        double pow = Math.pow(1.05, 2);
        System.out.println(pow);
        double pow1 = Math.pow(1.1025, (double) 1 / 2);
        System.out.println(pow1);
        double pow2 = Math.pow(64, (double) 1/3);
        System.out.println(Math.round(pow2));//四舍五入


        //那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
        //        （复利计算按照每年12000投入计算，不按照每月计息）

        double preyear = 1.2;//每年投资1.2w
        int target = 100;//目标

        for (int i = 1;i<100;i++){
            double compoundInterest = 1;
            double sum = 0;
            //F = p* ( (1+r)^n );
            int year = i;

            for (int j = 0;j<year;j++){
                compoundInterest = compoundInterest * 1.2;//计算复利，第1年1*1.2，第2年1.2*1.2，第3年1.2*1.2*1.2，第n年1.2*1.2*1.2*n...

                sum += preyear * compoundInterest;//sum是计算复利总收入，sum+=是计算第1年投资的收入+第2年投资的收入+n...。

            }

            int total = (int)Math.round(sum);
            if (total>=target){
                System.out.println("第"+i+"年完成目标");
                break;
            }

        }

    }
}
