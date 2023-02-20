package loops;

public class FirstTen {
    public static void main(String[] args) {
        int total = 0;
        for (int counter = 1; counter <= 10; counter++) {

            total += counter;
        }
        System.out.println(total);
    }
}
