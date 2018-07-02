public class Drums extends Instrument implements IPlay, ISell{

    private int cymbals;

    public Drums(String name, String maker, String type, int buyprice, int sellprice) {
        super(name, maker, type, buyprice, sellprice);
    }

    public String play() {
        return "Boom Boom Tchak";
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }

    public int getCymbals() {
        return cymbals;
    }

    public void setCymbals(int cymbals) {
        this.cymbals = cymbals;
    }
}
