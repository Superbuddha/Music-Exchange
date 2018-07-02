public abstract class Accessories implements ISell{

    private String type;
    protected int buyprice;
    protected int sellprice;

    public Accessories(String type, int buyprice, int sellprice){
        this.type = type;
        this.buyprice = buyprice;
        this.sellprice = sellprice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBuyprice() {
        return buyprice;
    }

    public int getSellprice() {
        return sellprice;
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }
}
