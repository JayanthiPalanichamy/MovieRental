package refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RentalTest {
    private Movie deadPool;
    @Test
    public void returnTitleOfMovieWhichIsRented(){
        deadPool = new NewReleaseMovie("Dead Pool");
        Rental rental = new Rental(deadPool, 1);

        assertEquals("Dead Pool",rental.getMovieTitle());
    }

    @Test
    public void returnRentalAmountForTheMovieRented() {
        deadPool = new NewReleaseMovie("Dead Pool");
        Rental rental = new Rental(deadPool, 1);

        assertEquals(3,rental.getAmount(),0.0001);
    }
}
