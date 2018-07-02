public class Trumpet extends Instrument implements IPlay,ISell{

    private int mouthpiece;


    public Trumpet(String name, String maker, String type, int mouthpiece, int buyprice, int sellprice) {
        super(name, maker, type, buyprice, sellprice);
        this.mouthpiece = mouthpiece;
    }

    public String play() {
        return "Bwah, bwah";
    }

    public int calculateMarkup() {
        return sellprice - buyprice;
    }

    public int getMouthpiece() {
        return mouthpiece;
    }

    public void setMouthpiece(int mouthpiece) {
        this.mouthpiece = mouthpiece;
    }
}
