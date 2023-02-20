package chapter8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    @Test
    public void constructNative() {
        Human human = new Human();
        human.setFirstNaName("Glory");
        human.setLastName("Ihueze");
        human.setPhoneNumber("08160430491");
        human.setEmailAddress("gloryIhueze@gmail.com");
        human.setAddress("Hebert Macaulay");

        Native glory = new Native(human);
        assertEquals("Glory", glory.getFirstNaName());
        assertEquals("08160430491",glory.getPhoneNumber());
        Native mathais = new Native(human);
        mathais.setFirstNaName("Kachi");
        assertEquals("Kachi",mathais.getFirstNaName());


    }
}