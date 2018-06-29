import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrumStick {
    DrumStick drumStick;

    @Before
    public void setUp() throws Exception {
        drumStick = new DrumStick("DStick", 3, 7);
    }

    @Test
    public void hasName() {
        assertEquals("DStick", drumStick.getName());

    }

    @Test
    public void hasPrice() {
        assertEquals(3, drumStick.getBuyPrice());
        assertEquals(7, drumStick.getSellPrice());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(4, drumStick.calculateMarkup());
    }
}
