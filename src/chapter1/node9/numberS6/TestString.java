package chapter1.node9.numberS6;

public class TestString {
    public static void main(String[] args) {
        String garen ="盖伦"; //字面值,虚拟机碰到字面值就会创建一个字符串对象

        String teemo = new String("提莫"); //创建了两个字符串对象

        char[] cs = new char[]{'崔','斯','特'};

        String hero = new String(cs);//  通过字符数组创建一个字符串对象

        String hero3 = garen + teemo;//  通过+加号进行字符串拼接

        System.out.println("=======");
        String name ="盖伦";
        int kill = 8;
        String title="超神";

        //直接使用+进行字符串连接，编码感觉会比较繁琐，并且维护性差,易读性差
        String sentence = name+ " 在进行了连续 " + kill + " 次击杀后，获得了 " + title +" 的称号";

        System.out.println(sentence);

        //格式化字符串
        //%s表示字符串，%d表示数字,%n表示换行
        String sentenceFormat ="%s 在进行了连续 %d 次击杀后，获得了 %s 的称号%n";

        String sentence2 = String.format(sentenceFormat, name,kill,title);

        System.out.println(sentence2);

        System.out.println("=======");
        String name1 ="盖伦";

        System.out.println(name1.length());

        String unknowHero = "";

        //可以有长度为0的字符串,即空字符串
        System.out.println(unknowHero.length());
    }
}
