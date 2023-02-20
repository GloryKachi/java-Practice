package chapter15;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Example1 {
    public static void main(String[] args) {
        try (var printStream =
                new PrintStream("C:\\Users\\user\\IdeaProjects\\chapter5\\sample2TXT")){

        }catch (FileNotFoundException exception){

        }
    }
}
