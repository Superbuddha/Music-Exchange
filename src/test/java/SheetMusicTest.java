import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void setUp() throws Exception {
        sheetMusic = new SheetMusic("Sheet music", 20, 50, "Norway");
    }

    @Test
    public void hasType() {
        assertEquals("Sheet music", sheetMusic.getType());
    }

    @Test
    public void hasBuyprice() {
        assertEquals(20, sheetMusic.getBuyprice());
    }

    @Test
    public void hasSellprice() {
        assertEquals(50, sheetMusic.getSellprice());
    }

    @Test
    public void hasSong() {
        assertEquals("Norway", sheetMusic.getSong());
    }
}
