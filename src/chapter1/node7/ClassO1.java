package chapter1.node7;

public class ClassO1 {
    String name; //姓名

    float hp; //血量

    float armor; //护甲

    int moveSpeed; //移动速度

    public static void main(String[] args) {
        //引用的概念，如果一个变量的类型是 类类型，而非基本类型，那么该变量又叫做引用。
        /* 引用和指向
        new Hero();
        代表创建了一个Hero对象
        但是也仅仅是创建了一个对象，没有办法访问它
        为了访问这个对象，会使用引用来代表这个对象
        Hero h = new Hero();
        h这个变量是Hero类型，又叫做引用
        =的意思指的h这个引用指向右侧创建的对象
         */
        //创建一个对象
        new ClassO1();

        //使用一个引用hero来指向这个对象
        ClassO1 hero = new ClassO1();

        /* 多个引用，一个对象
        引用有多个，但是对象只有一个。
        在这个例子里，所有引用都指向了同一个对象。
        对象就像 "房产"， 引用就像"房产证"
        房产证的复印件可以有多张，但是真正的"房产" 只有这么一处
         */
        //使用一个引用来指向这个对象
        ClassO1 h1 = new ClassO1();
        ClassO1 h2 = h1;  //h2指向h1所指向的对象
        ClassO1 h3 = h1;
        ClassO1 h4 = h1;
        ClassO1 h5 = h4;
        //h1,h2,h3,h4,h5 五个引用，都指向同一个对象

        /* 一个引用，多个对象
        第49行，引用garen指向新创建的对象（对象1）
        第50行，同一个引用garen指向新创建的对象（对象2）
        这个时候，对象1，就没有任何引用指向了
        换句话说，就没有任何手段控制和访问该对象，那么该对象就变得没有意义。
        一个引用，同一时间，只能指向一个对象
         */
        ClassO1 garen = new ClassO1(); //对象1
        garen = new ClassO1();  //对象2

        /* 练习-引用
        如代码，问题:
        a4所指向的对象和a2所指向的对象，是否是同一个对象？
         */
        ClassO1 a1 = new ClassO1();
        ClassO1 a2 = new ClassO1();
        ClassO1 a3;
        ClassO1 a4;
        a3 = a1;
        a4 = a3;
        //答案：不是同一个对象


    }
}
