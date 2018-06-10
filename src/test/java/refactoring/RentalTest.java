package refactoring;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class RentalTest {
    private Movie deadPool;
    Rental rental;
    @Before
    public void setUp(){
        deadPool = new NewReleaseMovie("Dead Pool");
        rental = new Rental(deadPool, 3);
    }
    @Test
    public void returnTitleOfMovieWhichIsRented(){
        assertEquals("Dead Pool",rental.getMovieTitle());
    }

    @Test
    public void returnRentalAmountForTheMovieRented() {
        assertEquals(9,rental.getAmount(),0.0001);
    }

    @Test
    public void returnsTrueWhenMovieIsRentedMoreThanGivenDays() {
        assertTrue(rental.isDaysRentedMoreThan(2));
    }

    @Test
    public void returnsTrueWhenMovieInTheRentalIsMatchedWithItsCategory() {
        assertTrue(rental.isRentedMovie(NewReleaseMovie.class));
    }
}
