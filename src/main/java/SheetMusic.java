public class SheetMusic extends Accessories implements ISell{

    private String song;



    public SheetMusic(String type, int buyprice, int sellprice, String song) {
        super(type, buyprice, sellprice);
        this.song = song;
    }

    public String getSong() {
        return song;
    }
}
