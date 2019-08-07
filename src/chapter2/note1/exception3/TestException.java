package chapter2.note1.exception3;

public class TestException {
    public static void main(String[] args) {
        StringBuffer sb =new StringBuffer();

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sb.append('a');
        }
    }
}
