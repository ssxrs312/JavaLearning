package chapter2.note1.exception6;

public class OverdraftException extends Exception {
    private double deficit;

    public double getDeficit() {
        return deficit;
    }

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }
}
