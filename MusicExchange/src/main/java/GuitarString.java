public class GuitarString extends OtherItem implements ISell {
    public GuitarString(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }

    public int calculateMarkup() {
        int markup = getSellPrice() - getBuyPrice();
        return markup;
    }

}
