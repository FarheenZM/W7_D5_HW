public class Trumpet extends Instrument implements IPlay, ISell {
    private int noOfValves;

    public Trumpet(String material, String colour, InstrumentType type, int buyPrice, int sellPrice, int noOfValves) {
        super(material, colour, type, buyPrice, sellPrice);
        this.noOfValves = noOfValves;
    }

    public int getNoOfValves() {
        return noOfValves;
    }

    public String play() {
        return "trumpet is playing..";
    }

    public int calculateMarkup() {
        int markup = getSellPrice() - getBuyPrice();
        return markup;
    }
}
