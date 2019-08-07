package chapter2.note1.exception5;

public class EnemyHeroIsDeadException extends Exception {
    /*
    1. 无参的构造方法
    2. 带参的构造方法，并调用父类的对应的构造方法
     */

    public EnemyHeroIsDeadException(){

    }

    public EnemyHeroIsDeadException(String message) {
        super(message);
    }
}
