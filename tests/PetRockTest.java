import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {
    private PetRock rocky;

    @BeforeEach
    void myTestSetUp() {
        rocky = new PetRock("Rocky");
    }

    @Test
    void getName() {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    void testUnhappyToStart() {
        assertFalse(rocky.isHappy());
    }

    @Test
    void testHappyAfterPlay() {
        rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Disabled("Exception throwing not yet defined")
    @Test
    void nameFail() {
        assertThrows(IllegalStateException.class, () -> {
            rocky.getHappyMessage();
        });
    }

    @Test
    void name() {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy!", msg);
    }

    @Test
    void testFavNum() {
        assertEquals(42, rocky.getFavNumber());
    }

    @Test
    void emptyNameFail() {
        assertThrows(IllegalArgumentException.class, () -> {
            new PetRock("");
        });
    }
}