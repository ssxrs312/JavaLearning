package chapter2.note1.exception5;

//下标超出范围异常
public class IndexIsOutofRangeException extends Exception {

    public IndexIsOutofRangeException() {

    }

    public IndexIsOutofRangeException(String message) {
        super(message);
    }
}
