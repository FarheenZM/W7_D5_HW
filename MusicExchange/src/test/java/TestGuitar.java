import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitar {

    Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("wood", "brown", InstrumentType.STRING, 10, 20, 4);
    }

    @Test
    public void testMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void testType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void testPrice() {
        assertEquals(10, guitar.getBuyPrice());
        assertEquals(20, guitar.getSellPrice());
    }

    @Test
    public void testNoOfStrings() {
        assertEquals(4, guitar.getNoOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("guitar is playing..", guitar.play());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(10, guitar.calculateMarkup());
    }
}
