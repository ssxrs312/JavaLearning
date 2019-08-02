package chapter1.node9.numberS6;

public class Recursion {
    /*
    1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
    2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
     */

    public static void main(String[] args) {
        //1. 生成一个长度是3的随机字符串，把这个字符串作为当做密码
        String password = randomString(3);
        System.out.println(password);

        //2. 使用穷举法生成长度是3个字符串，匹配上述生成的密码
        char[] guessPassword = new char[password.length()];
        generatePassword(guessPassword,password);
    }

    public static boolean found = false;

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

    private static void generatePassword(char[] cs,String s){
        generatePassword(cs,0,s);

    }

    private static void generatePassword(char[] guessPassword,int index,String password){
        if(found)
            return;
        for (short i = '0'; i <= 'z'; i++) {
            char c = (char)i;
            if(!Character.isLetterOrDigit(c))
                continue;
            guessPassword[index] = c;
            if(index!=guessPassword.length-1){  //递归，index!=2,所以index从0开始递归，接着是1，然后是2.
                generatePassword(guessPassword,index+1,password);
            }
            else{
                String guess = new String(guessPassword);
//              System.out.println("穷举出来的密码是：" + guess);
                if(guess.equals(password)){
                    System.out.println("找到了，密码是" + guess);
                    found =true;
                    return;
                }
            }
        }
    }
}
