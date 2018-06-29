public class Drum extends Instrument implements IPlay, ISell {
    public Drum(String material, String colour, InstrumentType type, int buyPrice, int sellPrice) {
        super(material, colour, type, buyPrice, sellPrice);
    }

    public String play() {
        return "drum is playing..";
    }


    public int calculateMarkup() {
        int markup = getSellPrice() - getBuyPrice();
        return markup;
    }
}
