public abstract class Instrument {
    private String material;
    private String colour;
    private int buyPrice;
    private int sellPrice;
    private InstrumentType type;

    public Instrument(String material, String colour, InstrumentType type, int buyPrice, int sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public InstrumentType getType() {
        return type;
    }
}
