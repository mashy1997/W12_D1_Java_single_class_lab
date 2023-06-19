import classes.Printer;
import classes.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;
    User user;

    @Before
    public void before() {
        printer = new Printer();
        user = new User(2,2);
    }

    @Test
    public void addSheets(){
        printer.addSheet(10);
        assertEquals(10,printer.getNumberOfSheets());
    }

    @Test
    public void canPrint(){
        printer.addSheet(10);
        user.reduceCopies(
                printer.print(user.getPages(),user.getCopies())
        );
        assertEquals(6,printer.getNumberOfSheets());
        assertEquals(16,printer.getTonerVolume());
        assertEquals(2,user.getCopies());
    }

}
