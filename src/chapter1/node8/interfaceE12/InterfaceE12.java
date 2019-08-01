package chapter1.node8.interfaceE12;

public class InterfaceE12 {
    /* 步骤 1 : UML 图 —— 类之间的关系
    UML-Unified Module Language
    统一建模语言，可以很方便的用于描述类的属性，方法，以及类和类之间的关系
     */

    /* 步骤 2 : 解释UML-类图

     */

    /* 步骤 3 : 解释UML-接口图

     */

    /* 步骤 4 : 解释UML-继承关系
    带箭头的实线，表示 Spider，Cat, Fish都继承于Animal这个父类.
     */

    /* 步骤 5 : 解释UML-实现关系
    带箭头的虚线，表示 Fish实现了 Pet这个接口
     */

    /* 步骤 6 : 练习-Animal类
    1. 创建Animal类，它是所有动物的抽象父类。
    2. 声明一个受保护的整数类型属性legs，它记录动物的腿的数目。
    3. 定义一个受保护的构造器，用来初始化legs属性。
    4. 声明抽象方法eat。
    5. 声明具体方法walk来打印动物是如何行走的（包括腿的数目）
    类：Animal
     */

    /* 步骤 8 : 练习-Spider类
    1. Spider继承Animal类。
    2. 定义默认构造器，它调用父类构造器来指明所有蜘蛛都是8条腿。
    3. 实现eat方法
    类：Spider
     */

    /* 步骤 10 : 练习-Pet接口
    根据UML类创建pet（宠物）接口
    1. 提供getName() 返回该宠物的名字
    2. 提供setName(String name) 为该宠物命名
    3. 提供 play()方法
    接口：Pet
     */

    /* 步骤 12 : 练习-Cat类
    1. 该类必须包含String属性来存宠物的名字。
    2. 定义一个构造器，它使用String参数指定猫的名字；该构造器必须调用超类构造器来指明所有的猫都是四条腿。
    3. 另定义一个无参的构造器。该构造器调用前一个构造器（用this关键字）并传递一个空字符串作为参数
    4. 实现Pet接口方法。
    5. 实现eat方法。
    类：Cat
     */

    /* 步骤 14 : 练习-Fish类
    1. 创建Fish类，它继承Animal类
    2. 重写Animal的walk方法以表明鱼不能走且没有腿。
    3. 实现Pet接口
    4. 无参构造方法
    5. 提供一个private 的name属性
    类：Fish
     */





}
