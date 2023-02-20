package chapter15;

import java.io.FileOutputStream;
import java.io.IOException;

public class Sample2 {
    public static void main(String[] args) {
        try(FileOutputStream stream = new FileOutputStream("C:\\Users\\user\\IdeaProjects\\chapter5\\sample2TXT")){
            stream.write("Paragons".getBytes());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
