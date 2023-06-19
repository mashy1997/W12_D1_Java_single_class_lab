import classes.WaterBottle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before() {bottle = new WaterBottle();}

    @Test
    public void hasVolumeOf100(){
        assertEquals(true, bottle.checkVolume());
    }

    @Test
    public void canDrink(){
        bottle.drink();
        assertEquals(90, bottle.volOfBottle());
    }


    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.volOfBottle());
    }

    @Test
    public void canFill(){
        bottle.empty();
        bottle.fill();
        assertEquals(100, bottle.volOfBottle());
    }
}
