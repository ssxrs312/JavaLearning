package chapter1.node3;

public class Variable4 {

    /*
    变量命名只能使用字母 数字 $ _
    变量第一个字符 只能使用 字母 $ _
    变量第一个字符 不能使用数字
    注：_ 是下划线，不是-减号或者—— 破折号
     */

    int a= 5;
    int a_12= 5;
    int $a43= 5;

    int a434= 5;

//第一个是数字，是不行的
//    int 34a= 5;

    //不能只使用关键字，但是可以包含关键字
    int class5 = 5;

    //中文也是可以用来命名变量的,类名、方法名、对象名都可以用中文命名，但是在实际工作中。。。别这么干。。。
    public void 开展教学工作(){
        System.out.println("雅蠛蝶");
    }

    //练习
    int a_;
//    int a@;//@ 符合变量命名规则
    int a3;
//    int 8@;//数字不能作为第一个字符  @ 不符合变量命名规则
//    int 9_;//数字不能作为第一个字符
    int X$_;
    int y;
    int _$_;
    int $_$;
//    int $*$;//* 不符合变量命名规则
    int $1$;
    int _1_;
//    int _@_;//@ 不符合变量命名规则
//    int a#;//# 不符合变量命名规则
//    int a";//" 不符合变量命名规则
//    int 123a";//数字不能作为第一个字符  " 不符合变量命名规则
//    int 123a_;//数字不能作为第一个字符
    int $123b_;

}
