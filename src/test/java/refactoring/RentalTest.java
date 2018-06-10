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
}
