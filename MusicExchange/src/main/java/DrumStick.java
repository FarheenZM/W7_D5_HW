public class DrumStick extends OtherItem implements ISell{
    public DrumStick(String name, int buyPrice, int sellPrice) {
        super(name, buyPrice, sellPrice);
    }

    public int calculateMarkup() {
        int markup = getSellPrice() - getBuyPrice();
        return markup;
    }
}
