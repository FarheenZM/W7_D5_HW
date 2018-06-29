import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestShop {
    Shop shop;
    Guitar guitar;
    GuitarString string;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Music Exchange");
        guitar = new Guitar("wood", "brown", InstrumentType.STRING, 10, 20, 4);
        string = new GuitarString("GString", 8, 15);
    }

    @Test
    public void hasName() {
        assertEquals("Music Exchange", shop.getName());
    }

    @Test
    public void testCountItems() {
        assertEquals(0, shop.countItems());
    }

    @Test
    public void canAddItemToStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(string);
        assertEquals(2, shop.countItems());
    }

    @Test
    public void canRemoveItemFromStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(string);
        shop.removeItemFromStock(string);
        assertEquals(1, shop.countItems());
    }

    @Test
    public void testTotalPotentialProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(string);
        assertEquals(17, shop.totalPotentialProfit());

    }
}
