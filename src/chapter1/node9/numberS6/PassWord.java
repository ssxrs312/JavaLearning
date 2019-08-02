package chapter1.node9.numberS6;


public class PassWord {
    public static void main(String[] args) {
        /*
        1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
        2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
         */

        //生成一个长度是3的随机字符串，把这个字符串作为当做密码
        String str = randomString(3);
        System.out.println(str);

        //使用穷举法生成长度是3个字符串，匹配上述生成的密码
        char[] guessPassword = new char[3];
        outloop:
        for (short i = 0;i < 'z';i++){
            for (short j = 0;j < 'z';j++){
                for (short k = 0;k < 'z';k++){
                    if (!isLetterOrDigit(i,j,k)){   //如果不是字母、也不是数字，跳过进入下一次循环
                        continue ;
                    }
                    guessPassword[0] = (char)i;
                    guessPassword[1] = (char)j;
                    guessPassword[2] = (char)k;
                    String guess = new String(guessPassword);
                    if (guess.equals(str)){
                        System.out.println("找到了，密码是" + guess);
                        break outloop;
                    }
                }
            }
        }
    }

    private static boolean isLetterOrDigit(short i,short j,short k){
       return Character.isLetterOrDigit(i) &&
               Character.isLetterOrDigit(j) &&
               Character.isLetterOrDigit(k);
    }

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
