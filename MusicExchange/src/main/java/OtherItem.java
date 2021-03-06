public abstract class OtherItem {
    private String name;
    private int buyPrice;
    private int sellPrice;

    public OtherItem(String name, int buyPrice, int sellPrice) {
        this.name = name;
        this.buyPrice= buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }
}
