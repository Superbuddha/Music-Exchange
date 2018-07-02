public class Bass extends Instrument implements IPlay,ISell{

private int strings;

    public Bass(String name, String maker, String type, int strings, int buyprice, int sellprice) {
        super(name, maker, type, buyprice, sellprice);
        this.strings = strings;
    }


    public String play() {
        return "Sis Boom Bah";
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }
}
