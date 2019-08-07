package chapter2.note1.exception5;

public class MyStringBuffer implements IStringBuffer {
    char[] value ;
    int capacity = 16;
    int length = 0;

    //无参构造方法，生成固定长度为16的字符数组
    public MyStringBuffer() {
        value = new char[capacity];
    }

    //有参构造方法
    public MyStringBuffer(String str) {
        //调用无参构造，生成固定长度16的字符数组
        this();
        if(null==str)
            return;

        //容量<字符串长度
        if (capacity<str.length()){
            capacity = value.length*2;
            value = new char[capacity];
        }

        //容量>=字符串长度
        char[] cs = str.toCharArray();
        if (capacity>=str.length()){
            System.arraycopy(cs,0,value,0,str.length());
        }

        //生成length的值
        length = str.length();
    }

    @Override
    public void append(String str) throws IndexIsNagetiveException, IndexIsOutofRangeException  { //追加字符串
        insert(length,str);
    }

    @Override
    public void append(char c) throws IndexIsNagetiveException, IndexIsOutofRangeException  {
        append(String.valueOf(c));
    }

    @Override
    public void insert(int pos, char b) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        insert(pos,String.valueOf(b));
    }

    @Override
    public void insert(int pos, String b) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        //边界条件判断
        if (pos<0)
            throw new IndexIsNagetiveException();

        if (pos>length)
            throw new IndexIsOutofRangeException();

        if (null==b)
            throw new NullPointerException();

        //扩容
        while (length+b.length()>capacity){
            capacity = (int)((length + b.length()) * 1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value,0,newValue,0,length);
            value = newValue;  //让value这个引用，指向新的数组，从而达到扩容的效果。
        }

        char[] cs = b.toCharArray();
        //先把已经存在的数据往后移
        System.arraycopy(value,pos,value,pos+cs.length,length-pos);
        //把要插入的数据插入到指定位置
        System.arraycopy(cs,0,value,pos,cs.length);

        //修改length的值
        length = length + cs.length;

    }

    @Override
    public void delete(int start) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        delete(start,length);
    }

    @Override
    public void delete(int start, int end) throws IndexIsNagetiveException, IndexIsOutofRangeException {
        //边界条件判断
        if(start<0)
            throw new IndexIsNagetiveException();

        if(start>length)
            throw new IndexIsOutofRangeException();

        if(end<0)
            throw new IndexIsNagetiveException();

        if(end>length)
            throw new IndexIsOutofRangeException();

        if(start>=end)
            throw new IndexIsOutofRangeException();

        System.arraycopy(value, end, value, start, length- end);
        length-=end-start;
    }

    @Override
    public void reverse() {
        for (int i=0;i<length/2;i++){
            char temp = value[i];
            value[i] = value[length - i -1];
            value[length - i -1] = temp;
        }
    }

    @Override
    public int length() {
        return length;
    }

    @Override
    public String toString() {
        char[] realValue = new char[length];
        System.arraycopy(value,0,realValue,0,length);
        return new String(realValue);
    }

    public static void main(String[] args) {
        chapter1.node9.numberS9.MyStringBuffer sb = new chapter1.node9.numberS9.MyStringBuffer("there light");
        System.out.println(sb);
        sb.insert(0, "let ");
        System.out.println(sb);

        sb.insert(10, "be ");
        System.out.println(sb);
        sb.insert(0, "God Say:");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.append('?');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);

        /* 练习-性能比较
        1. 生成长度是10的随机字符串
        2. 使用StringBuffer追加1000000次统计时间
        3. 使用MyStringBuffer追加1000000次统计时间
        已知StringBuffer追加1000000的时间是41毫秒
         */
        int length = 10;
        int total = 10000;
        String str = randomString(length);

        long start = System.currentTimeMillis();
        StringBuffer strb = new StringBuffer();
        chapter1.node9.numberS9.MyStringBuffer msb = new chapter1.node9.numberS9.MyStringBuffer();
        total *=100;
        for (int i = 0;i<total;i++){
            msb.append(str);
        }
        long end = System.currentTimeMillis();

        //73毫秒
        System.out.format("使用MyStringBuffer的方式进行连接，连接%d次，耗时%d毫秒%n",total,end-start);


    }

    //生成一个随机字符串，随机字符串的范围是0-9，a-z,A-Z，长度为length
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
