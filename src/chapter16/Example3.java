package chapter16;

import java.util.PriorityQueue;
import java.util.Queue;

public class Example3 {
    public static void main(String[] args) {
        Queue<String> fillingStation = new PriorityQueue<>();
        //Offers are used to add elements to the queue
        fillingStation.offer("Toyota");
        fillingStation.offer("Honda");
        fillingStation.offer("Peugeot");

      //  System.out.println(fillingStation.peek());
        System.out.println(fillingStation);

    }
}
