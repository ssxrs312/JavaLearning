package chapter1.node5;


public class ProcessControl8 {
    public static void main(String[] args) {
        /* 练习-黄金分割点
        寻找某两个数相除，其结果 离黄金分割点 0.618最近

        分母和分子不能同时为偶数
        分母和分子 取值范围在[1-20]
         */
        double huangjing = 0.618;
        int fenzi = 1;
        int fenmu = 1;
        int fanwei =20;
        double minvalue = 1;
        int answerfenzi = 0;
        int answerfenmu = 0;


        for (fenzi =1;fenzi<=fanwei;fenzi++){
            for (fenmu=1;fenmu<=fanwei;fenmu++){
                if (0==fenzi%2 & 0==fenmu%2){  //分母和分子不能同时为偶数，& 不管表达式1判断为true还是false，都要对表达式2进行判断。当2个表达式为true，结束当前循环进入下一个
                    continue;
                }else {
                    double result = (double) fenzi / fenmu;
                    double cha = result - huangjing;  //假设result是离0.618最近的点，那么他跟0.618的差叫做cha
                    cha = cha<0?0-cha:cha;//转换成绝对值
                    if (cha<minvalue){   //cha小于minvalue时，把cha赋值给最小值minvalue
                        minvalue = cha;
                        answerfenmu = (int) fenmu; //把分母赋值给answerfenmu
                        answerfenzi = (int) fenzi; //把分子赋值给answerfenzi
                    }
                }
            }
        }
        System.out.println("分子："+answerfenzi+"分母："+answerfenmu+"。结果="+(double)answerfenzi/answerfenmu);

        /* 练习-水仙花数
        水仙花数定义：
        1. 一定是3位数
        2. 每一位的立方，加起来恰好是这个数本身，比如153=1*1*1+5*5*5+3*3*3

        寻找所有的水仙花数
         */
        int ge = 0;
        int shi = 0;
        int bai = 0;

        for (int i=100;i<1000;i++){
            ge = i % 10;
            shi = i/10 % 10;
            bai = i / 100 ;

            int shu = (int) Math.pow(ge,3)+(int)Math.pow(shi,3)+(int)Math.pow(bai,3);
            if (shu == i){
                System.out.println("所有的水仙花数："+i);
            }
        }

        /* 练习-小学算术题
        x+y=8
        x+z=14
        z-a=6
        y+a=10
         */
        int x=0;
        int y=0;
        int z=0;
        int a=0;

        for (x= -100;x<100;x++){
            for (y= -100;y<100;y++){
                for (z= -100;z<100;z++){
                    for (a= -100;a<100;a++){
                        if (x+y==8 && x+z==14 && z-a==6 && y+a==10){
                            System.out.println("x:"+x);
                            System.out.println("y:"+y);
                            System.out.println("z:"+z);
                            System.out.println("a:"+a);
                        }
                    }
                }
            }
        }

    }
}
