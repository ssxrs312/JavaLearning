package chapter1.node5;

public class Money {
    public static void main(String[] args) {
        //复利计算：投资100万，达到3000万需要多久，年利率18%。结果=21年
        double base = 100;//本金
        int target = 3000;//目标
        for (int i=1;i<100;i++){
            double pow = Math.pow(1.18, i);
            double total = base * pow;
            int t = (int)Math.round(total);
            System.out.println("第"+(i)+"年复利总收入为："+t);
            if (t>=target){
                System.out.println("第"+(i)+"年达成目标");
                break;
            }
        }

        System.out.println("=======");
        //复利计算，每年投资30万，达到3000万，年利率18%，结果=16年
        double base2 = 30;//每年投资30w
        int target2 = 3000;//目标

        for (int j=1;j<100;j++){
            int year = j;
            double compoundInterest = 1;
            double sum = 0;
            for (int k = 0;k<year;k++){
                compoundInterest = compoundInterest *1.2;//compoundInterest是计算复利，比如第1年复利=1*1.2；第2年复利=1.2*1.2；第3年复利=1.2*1.2*1.2

                sum += base2 * compoundInterest;
                //base2*compoundInterest是第1年的本金*复利，比如在第3年，base2*compoundInterest=base2*1.2*1.2*1.2,代表第一年的投资在第3年的收益
                //sum+=的意思是第2年的收益+第3年（今年的投资收益），第2年的收益=base2*1.2*1.2。第3年的收益（今年）=base2*1.2
                //最后的结果=base2*1.2*1.2*1.2+base2*1.2*1.2+base2*1.2
            }
             int su = (int) Math.round(sum);
            if (su>=target2){
                System.out.println("第"+j+"年可以达到目标");
                break;
            }
        }






    }
}
