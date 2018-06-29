public class Piano extends Instrument implements IPlay, ISell{
    public Piano(String material, String colour, InstrumentType type, int buyPrice, int sellPrice) {
        super(material, colour, type, buyPrice, sellPrice);
    }


    public String play() {
        return "piano is playing..";
    }

    public int calculateMarkup() {
        int markup = getSellPrice() - getBuyPrice();
        return markup;
    }
}
