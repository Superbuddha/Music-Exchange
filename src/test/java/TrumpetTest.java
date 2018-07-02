import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;


    @Before

    public void setUp(){
        trumpet = new Trumpet("Bugle", "Courtois", "Brass", 1, 100,300);
    }

    @Test
    public void hasName() {
        assertEquals("Bugle", trumpet.getName());
    }

    @Test
    public void hasMaker() {
        assertEquals("Courtois", trumpet.getMaker());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void hasMouthpiece() {
        assertEquals(1, trumpet.getMouthpiece());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(100, trumpet.getBuyprice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(300,trumpet.getSellprice());
    }

    @Test
    public void trumpetMarkup() {
        assertEquals( 200, trumpet.calculateMarkup());
    }

    @Test
    public void makeSound() {
        assertEquals("Bwah, bwah", trumpet.play());
    }
}
