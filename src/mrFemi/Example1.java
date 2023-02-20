package mrFemi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) throws IOException {

        try (FileReader reader = new FileReader("chase");
             BufferedReader bufferedReader = new BufferedReader(reader);){
            System.out.println(bufferedReader.readLine());
        }catch (IOException exception){
            System.out.println(exception.getMessage());
            } finally {
                System.out.println("In finally block");
            }

        }
}

