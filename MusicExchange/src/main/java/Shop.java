import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public int countItems(){
        return this.stock.size();
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public int totalPotentialProfit(){
        int profit = 0;
        for(ISell item : this.stock){
                profit += item.calculateMarkup();
            }
        return profit;
    }

}
