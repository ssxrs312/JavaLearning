package chapter2.note1.exception4;

import java.io.File;
import java.io.FileInputStream;

public class TestException {

    public static void method() throws Throwable {
        File f = new File("d:/LOL.exe");
        new FileInputStream(f);
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
