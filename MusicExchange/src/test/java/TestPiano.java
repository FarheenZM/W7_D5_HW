import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPiano {

    Piano piano;

    @Before
    public void setUp() throws Exception {
        piano = new Piano("spruce", "black", InstrumentType.KEYBOARD, 35, 50);
    }

    @Test
    public void testMaterial() {
        assertEquals("spruce", piano.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("black", piano.getColour());
    }

    @Test
    public void testType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void testPrice() {
        assertEquals(35, piano.getBuyPrice());
        assertEquals(50, piano.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("piano is playing..", piano.play());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(15, piano.calculateMarkup());
    }
}
