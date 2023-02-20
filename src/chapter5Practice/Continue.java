package chapter5Practice;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.print(i);
        }
    }
}
