import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrum {
    Drum drum;

    @Before
    public void setUp() throws Exception {
        drum = new Drum("synthetic", "white", InstrumentType.PERCUSSION, 20, 33);
    }

    @Test
    public void testMaterial() {
        assertEquals("synthetic", drum.getMaterial());
    }

    @Test
    public void testColour() {
        assertEquals("white", drum.getColour());
    }

    @Test
    public void testType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getType());
    }

    @Test
    public void testPrice() {
        assertEquals(20, drum.getBuyPrice());
        assertEquals(33, drum.getSellPrice());
    }

    @Test
    public void canPlay() {
        assertEquals("drum is playing..", drum.play());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(13, drum.calculateMarkup());
    }
}
