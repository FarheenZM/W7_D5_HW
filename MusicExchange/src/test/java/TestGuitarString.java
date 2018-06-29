import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGuitarString {
    GuitarString string;

    @Before
    public void setUp() throws Exception {
        string = new GuitarString("GString", 8, 15);
    }

    @Test
    public void hasName() {
        assertEquals("GString", string.getName());

    }

    @Test
    public void hasPrice() {
        assertEquals(8, string.getBuyPrice());
        assertEquals(15, string.getSellPrice());
    }

    @Test
    public void testCalculateMarkup() {
        assertEquals(7, string.calculateMarkup());
    }
}
