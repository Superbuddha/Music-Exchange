public abstract class Instrument {

    private String name;
    private String maker;
    private String type;
    protected int buyprice;
    protected int sellprice;

    public Instrument(String name, String maker, String type, int buyprice, int sellprice){
        this.name = name;
        this.maker = maker;
        this.type = type;
        this.buyprice = buyprice;
        this.sellprice = sellprice;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
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
}
