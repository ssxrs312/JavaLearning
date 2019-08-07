package chapter2.note1.exception5;

public class Exception5 {
    public static void main(String[] args) {
        /* 示例 1 : 创建自定义异常
        一个英雄攻击另一个英雄的时候，如果发现另一个英雄已经挂了，就会抛出EnemyHeroIsDeadException
        创建一个类EnemyHeroIsDeadException，并继承Exception
        提供两个构造方法
        1. 无参的构造方法
        2. 带参的构造方法，并调用父类的对应的构造方法
        类：EnemyHeroIsDeadException
         */

        /* 示例 2 : 抛出自定义异常
        在Hero的attack方法中，当发现敌方英雄的血量为0的时候，抛出该异常
        1. 创建一个EnemyHeroIsDeadException实例
        2. 通过throw 抛出该异常
        3. 当前方法通过 throws 抛出该异常

        在外部调用attack方法的时候，就需要进行捕捉，并且捕捉的时候，可以通过e.getMessage() 获取当时出错的具体原因
        类：Hero
         */

        /* 示例 3 : 练习-自定义异常
        对MyStringBuffer的插入和删除方法中的边界条件判断，用抛出异常来解决
        例: insert(int pos, String b) , 当pos 是负数的时候，抛出自定义异常
        需要实现自定义两种异常
        IndexIsNagetiveException 下标为负异常
        IndexIsOutofRangeException 下标超出范围异常
        以下是需要调用这些异常的场景：
        pos<0
        抛出 IndexIsNagetiveException
        pos>length
        抛出 IndexIsOutofRangeException
        null==b
        抛出 NullPointerException
        start<0
        抛出 IndexIsNagetiveException
        start>length
        抛出 IndexIsOutofRangeException
        end<0
        抛出 IndexIsNagetiveException
        end>length
        抛出 IndexIsOutofRangeException
        start>=end
        抛出 IndexIsOutofRangeException

        注意： 接口IStringBuffer中声明的方法需要抛出异常
        接口：IStringBuffer
        类：MyStringBuffer、IndexIsNagetiveException、IndexIsOutofRangeException
         */


    }
}
