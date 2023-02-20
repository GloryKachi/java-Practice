package chibuzosDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DairyTest {
    Dairy amirahDairy;
    @BeforeEach
    public void setUp(){
        amirahDairy = new Dairy("Amirah","password");
    }
    @Test
    public void dairyExistTest(){
        assertNotNull(amirahDairy);
    }
    @Test
    public void newDiaryIsLocked(){
        assertTrue(amirahDairy.isLocked());
    }
    @Test
    public void lockedDairyCanBeUnlockedTest(){
        assertTrue(amirahDairy.isLocked());
        amirahDairy.unlockWith("password");
        assertFalse(amirahDairy.isLocked());
    }
    @Test
    public void wrongPasswordCannotUnlockDairyTest(){
        assertTrue(amirahDairy.isLocked());
        amirahDairy.unlockWith("wrongPassword");
        assertTrue(amirahDairy.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest(){
        amirahDairy.unlockWith("password");
        assertFalse(amirahDairy.isLocked());
        amirahDairy.lock();
        assertTrue(amirahDairy.isLocked());
    }
    @Test
    public void entriesCanBeAddedToTheDiary(){
        amirahDairy.unlockWith("password");
        assertFalse(amirahDairy.isLocked());

        amirahDairy.write("My Break up with Simi, ",
                "I did not do anything to him oh, He just came back one day and....");

        assertEquals(1,amirahDairy.numberOfEntries());
    }
    @Test
    public void entriesCannotBeAddedWhenDairyIsLockedTest() {
        assertTrue(amirahDairy.isLocked());
        try{
        amirahDairy.write("My breakup with Simi",
                "I did not do anything to him oh, He just came one day and...");
    }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(0, amirahDairy.numberOfEntries());
    }

    @Test
    public void writingToLockedDairyThrowsExceptionTest(){
        assertTrue(amirahDairy.isLocked());

        assertThrows(Exception.class, ()-> amirahDairy.write("My Break up with Simi,","I did not do anything to him oh, He just came back one day and...."));
    }

    @Test
    public void entriesCanBeFoundByIdTest(){
        amirahDairy.unlockWith("password");
        assertFalse(amirahDairy.isLocked());

        amirahDairy.write("My Break up with Simi, ",
                "I did not do anything to him oh, He just came back one day and....");
        Entry foundEntry = amirahDairy.findEntryWithId(1);

        assertEquals(1,foundEntry.getId());
        assertEquals("My Break up with Simi, ", foundEntry.getTitle());
        assertEquals("I did not do anything to him oh, He just came back one day and....", foundEntry.getBody());
    }



}
