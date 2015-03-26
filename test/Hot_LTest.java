import org.junit.Before;
import org.junit.Test;
import rooms.NuptialSuite;
import rooms.Single;
import services.Laundry;
import services.Wifi;

import static com.yourkit.util.Asserts.assertEqual;
import static junit.framework.TestCase.assertSame;
import static junit.framework.TestCase.assertTrue;

public class Hot_LTest {

    private BookReservation bookReservation;
    private Booker booker;

    @Before
    public void setUp() {
        bookReservation = new BookReservation();
        booker = new Booker(bookReservation);
    }

    @Test
    public void bookARoom() {
        Reserve reserve = new Reserve(new Single());
        booker.push("Israel", reserve);
        assertEqual(bookReservation.getReservations().size(), 1);
        assertTrue(bookReservation.get("Israel").getRoom() != null);
    }

    @Test
    public void bookingARoomWithServices() {
        booker.push("Cristopher", new Reserve(new Single(), new Wifi(), new Laundry() ));
        assertTrue(bookReservation.get("Cristopher").getRoom() != null);
        assertEqual(bookReservation.get("Cristopher").getServices().size(), 2);
    }

    @Test
    public void bookingANuptialSuite() {
        booker.push("Pepito",new Reserve(new NuptialSuite()));
        assertSame(bookReservation.get("Pepito").getRoom().getClass(), NuptialSuite.class);
        assertEqual(bookReservation.get("Pepito").getServices().size(), 4);
    }

}
