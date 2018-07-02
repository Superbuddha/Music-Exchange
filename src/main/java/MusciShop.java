import java.util.ArrayList;

public class MusciShop implements ISell {

    private String name;
    private ArrayList<ISell>stock;

    public MusciShop(String name){
        this.name = name;
        this.stock = new ArrayList<>();

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int countStock(){
        return stock.size();
    }

    public void addStock(ISell stock){
        this.stock.add(stock);
    }
    public void removeStock(){
        this.stock.remove();
    }

    public int calculateMarkup() {
        return 0;
    }
}
