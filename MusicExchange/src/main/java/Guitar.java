public class Guitar extends Instrument implements IPlay, ISell {

    private int noOfStrings;

    public Guitar(String material, String colour, InstrumentType type, int buyPrice, int sellPrice, int noOfStrings) {
        super(material, colour, type, buyPrice, sellPrice);
        this.noOfStrings = noOfStrings;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }

    public String play() {
        return "guitar is playing..";
    }

    public int calculateMarkup() {
        int markup = getSellPrice() - getBuyPrice();
        return markup;
    }
}
