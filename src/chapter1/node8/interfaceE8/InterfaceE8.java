package chapter1.node8.interfaceE8;

public class InterfaceE8 {
    /* final修饰类，方法，基本类型变量，引用的时候分别有不同的意思。

     */

    /* 示例 1 : final修饰类
    当Hero被修饰成final的时候，表示Hero不能够被继承
    其子类会出现编译错误
     */

    /* 示例 2 : final修饰方法
    Hero的useItem方法被修饰成final,那么该方法在ADHero中，不能够被重写
    类：Hero
    ADHero
     */

    /* 示例 3 : final修饰基本类型变量
    final修饰基本类型变量，表示该变量只有一次赋值机会
    16行进行了赋值，17行就不可以再进行赋值了
        final int hp;
        hp = 5;//16行赋值
        hp = 6;//17行不能在进行赋值
     */

    /* 示例 4 : final修饰引用
    final修饰引用
    h引用被修饰成final，表示该引用只有1次指向对象的机会
    所以17行会出现编译错误
    但是，依然通过h引用修改对象的属性值hp，因为hp并没有final修饰
        final Hero h;
        h  =new Hero();
        h  =new Hero();//17行出现编译错误

        h.hp = 5;

     */

    /* 示例 5 : 常量
    常量指的是可以公开，直接访问，不会变化的值
    比如 itemTotalNumber 物品栏的数量是6个
    类：Hero1
     */

    /* 示例 6 : 练习-final
    设计一个类SomeString,继承 String类。 能否继承?
    回答：
    不能继承，因为String类是final的。 所以不能被继承
    String被设计为final是有原因的，因为String这个类使用得实在是太广泛了，如果能够被继承，就意味着其子类可以随意重写其非final的方法，
    这些方法就有可能变得和期望的不一样，比如toString始终返回空。 这样就给软件逻辑带来了很大的不确定性因素。
    为了规避这种不确定性因素，索性让String类不能被继承，间接地就不存在子类重写其方法的问题了。
     */








}
