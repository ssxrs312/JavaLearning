package chapter1.node9.numberS7;



public class NumberS7 {
    /* 示例 1 : 获取字符
    charAt(int index)获取指定位置的字符
     */
    public static void main(String[] args) {
        String sentence = "盖伦,在进行了连续8次击杀后,获得了 超神 的称号";

        char c = sentence.charAt(0);

        System.out.println(c);

    /* 示例 2 : 获取对应的字符数组
    toCharArray()
    获取对应的字符数组
     */
        char[] cs = sentence.toCharArray(); //获取对应的字符数组

        System.out.println(sentence.length() == cs.length);

    /* 示例 3 : 截取子字符串
    subString
    截取子字符串
     */
        //截取从第3个开始的字符串 （基0）
        String subString1 = sentence.substring(3);

        System.out.println(subString1);

        //截取从第3个开始的字符串 （基0）
        //到5的位置的字符串
        //左闭右开，[3,5)，区间3-5，可以取到3，不能取到5
        String subString2 = sentence.substring(3,5);

        System.out.println(subString2);

    /* 示例 4 : 分隔
    split
    根据分隔符进行分隔
     */
        //根据,进行分割，得到3个子字符串
        String subSentences[] = sentence.split(",");
        for (String sub : subSentences) {
            System.out.println(sub);
        }

    /* 示例 5 : 去掉首尾空格
    trim
    去掉首尾空格
     */
        String sentence1 = "        盖伦,在进行了连续8次击杀后,获得了 超神 的称号      ";

        System.out.println(sentence1);
        //去掉首尾空格
        System.out.println(sentence1.trim());

    /* 示例 6 : 大小写
    toLowerCase 全部变成小写
    toUpperCase 全部变成大写
     */
        String sentence2 = "Garen";

        //全部变成小写
        System.out.println(sentence2.toLowerCase());
        //全部变成大写
        System.out.println(sentence2.toUpperCase());

    /* 示例 7 : 定位
    indexOf 判断字符或者子字符串出现的位置
    contains 是否包含子字符串
     */
        System.out.println(sentence.indexOf('8')); //字符第一次出现的位置

        System.out.println(sentence.indexOf("超神")); //字符串第一次出现的位置

        System.out.println(sentence.lastIndexOf("了")); //字符串最后出现的位置

        System.out.println(sentence.indexOf(',',5)); //从位置5开始，出现的第一次,的位置

        System.out.println(sentence.contains("击杀")); //是否包含字符串"击杀"

    /* 示例 8 : 替换
    replaceAll 替换所有的
    replaceFirst 只替换第一个
     */
        String temp = sentence.replaceAll("击杀", "被击杀"); //替换所有的

        temp = temp.replaceAll("超神", "超鬼");

        System.out.println(temp);

        temp = sentence.replaceFirst(",","");//只替换第一个

        System.out.println(temp);

    /* 示例 9 : 练习-每个单词的首字母都转换为大写
    给出一句英文句子： "let there be light"
    得到一个新的字符串，每个单词的首字母都转换为大写
     */
        String str = "let there be light";
        String strArray[] = str.split(" ");
        String words = "";
        for (String s:strArray){
            char[] chars = s.toCharArray();
            char c1 = s.charAt(0);
            char c2 = Character.toUpperCase(c1);
            chars[0] = c2;
            String result = new String(chars);
            System.out.println(result);
            words += result + " ";
        }

        System.out.println(words.trim());

    /* 示例 11 : 练习-英文绕口令
    英文绕口令
    peter piper picked a peck of pickled peppers
    统计这段绕口令有多少个以p开头的单词
     */
        String stri = "peter piper picked a peck of pickled peppers";
        int p = stri.indexOf("p");
        String striArray[] = stri.split(" ");
        int count = 0;
        for (String st : striArray){
            int p1 = st.indexOf("p");
            if (0==p1){
                count++;
            }
        }
        System.out.println(count);

    /* 示例 13 : 练习-间隔大写小写模式
    把 legendary 改成间隔大写小写模式，即 LeNgEnDaRy
     */
        String str2 = "legendary";
        char[] chars = str2.toCharArray();
        System.out.println(chars.length);//0 1 2 3 4 5 6 7 8
        for (int i=0;i<chars.length;i++){
            char aChar = chars[i];
            if (0==i%2){  //偶数
                char c1 = Character.toUpperCase(aChar);
                chars[i] = c1;
            }
        }
        System.out.println(chars);

    /* 示例 15 : 练习-最后一个字母变大写
    把 legendary 最后一个字母变大写
     */
        String str3 = "legendary";
        char[] chars3 = str3.toCharArray();
        char cLast = chars3[chars3.length - 1];
        char c3 = Character.toUpperCase(cLast);
        chars3[chars3.length - 1] = c3;
        String res = new String(chars3);
        System.out.println(res);

    /* 示例 17 : 练习-把最后一个two单词首字母大写
    Nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak
    把最后一个two单词首字母大写
     */
        String str4 = "nature has given us that two ears, two eyes, and but one tongue, to the end that we should hear and see more than we speak";
        char[] chars1 = str4.toCharArray();
        int lastTwo = str4.lastIndexOf("two");//从1开始数是36，从0开始数是35
//        System.out.println(lastTwo);
        char c1 = str4.charAt(lastTwo);
//        System.out.println(str4.charAt(lastTwo));
//        System.out.println(chars1[lastTwo]);
        chars1[lastTwo] = Character.toUpperCase(c1);
        String result = new String(chars1);
        System.out.println(result);

    }




}
