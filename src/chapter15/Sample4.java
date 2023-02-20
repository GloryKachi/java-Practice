//package chapter15;
//
//import java.io.DataOutputStream;
//import java.io.IOException;
//import java.io.PrintStream;
//
//public class Sample4 {
//    public static void main(String[] args) {
//
//        Byte[] bytes = "Hello World!".getBytes();
//
//        try (PrintStream altout = new PrintStream("C:\\Users\\user\\IdeaProjects\\chapter5\\sample2TXT");
//        ){
//
//        }
//
//        try(DataOutputStream dos = new DataOutputStream(System.out)){
//            //dos.write("Hello World!".getBytes());
//            dos.write(bytes);
//        }catch (IOException exception){
//            System.err.println(exception.getMessage());
//        }
//    }
//}
