import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTrumpet {
    Trumpet trumpet;

    @Before
    public void setUp() throws Exception {
        trumpet = new Trumpet("brass", "yellow", InstrumentType.BRASS, 15, 26, 4 );
    }
    @Test
    public void testMaterial() {
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("yellow", trumpet.getColour());
    }

    @Test
    public void testType() {
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void testPrice() {
        assertEquals(15, trumpet.getBuyPrice());
        assertEquals(26, trumpet.getSellPrice());
    }

    @Test
    public void testNoOfValves() {
        assertEquals(4, trumpet.getNoOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("trumpet is playing..", trumpet.play());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(11, trumpet.calculateMarkup());
    }
}
