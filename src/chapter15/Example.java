package chapter15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {

        try (BufferedWriter writer =
                new BufferedWriter(new FileWriter("intellij.txt"))){
            writer.write("Intelli-Jerry");

        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
