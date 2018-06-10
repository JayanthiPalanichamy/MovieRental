package refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    private Movie deadPool;
    private Rental rental;

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
    public void returnFrequentRentersPointsWhenNewReleasedMovieIsRentedForMoreThanADay() {
        assertEquals(2,rental.getRenterPointer());
    }

    @Test
    public void returnFrequentPointForOtherMovies() {
        Movie mummy = new RegularMovie("Mummy");
        Rental rental1 = new Rental(mummy,4);

        assertEquals(1,rental1.getRenterPointer());
    }
}
