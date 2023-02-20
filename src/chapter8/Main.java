package chapter8;
import static chapter8.Day.*;
import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        Native2 amirah = new Native2(Day.TUESDAY);
        out.println("Hello world");
        amirah.setDayOfBirth(MONDAY);
    }
}
