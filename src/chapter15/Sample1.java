package chapter15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Sample1 {
    public static void main(String[] args) {
        byte[] bytes = new byte[100];
        try {
            FileInputStream stream = new FileInputStream("C:\\Users\\user\\IdeaProjects\\chapter5\\src\\sample1");
            stream.read(bytes);
            for (byte b:bytes) {
                if (Character.isLetterOrDigit(b) || Character.isSpaceChar(b)) {
                    System.out.print(Character.toString(b));
                }
            }
            stream.close();
        }catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
