package mrFemi;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
   private Player player;
    @BeforeEach
    public void setUp(){
        player = new Player();
    }
    @Test
    public void checkThatObjectExist(){
        assertNotNull(player);
    }


}