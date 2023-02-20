package chiefsClass;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    Native amirah;
    @BeforeEach
    public void setUp(){
        Native amirah = new Native();
        //amirah.setFirstName("Amira");
    }
    @Test
    public void checkNative(){
        assertNotNull(amirah);
    }
}

