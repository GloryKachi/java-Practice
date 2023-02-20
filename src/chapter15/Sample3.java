package chapter15;

import java.io.DataInputStream;
import java.io.IOException;

public class Sample3 {
    public static void main(String[] args) {
        byte[] bytes = new byte[20];
        try (var dis = new DataInputStream(System.in)){
            int numberOfBytesRead = dis.read(bytes);
            System.out.println("numberOfBytesRead:: "+numberOfBytesRead);

            for (byte b : bytes) {
                if (b!=0) {
                    System.out.print(Character.toString(b));
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
