package chapter1.node8.interfaceE12;

public class Cat extends Animal implements Pet{
    /*
    1. 该类必须包含String属性来存宠物的名字。
    2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
    3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
    4. 实现Pet接口方法。
    5. 实现eat方法。

     */

    String name;
    public Cat(String name){
        super(4);
        this.name = name;
    }
    public Cat(){
        this("");
    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("cat play");
    }

    @Override
    public void eat() {
        System.out.println("cat eat");

    }
}
