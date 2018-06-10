package refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    private Movie mummy;
    private Movie frozen;
    private Movie deadPool;
    private double rentalAmount;

    @Before
    public void setUp() {
        mummy = new RegularMovie("Mummy");
        frozen = new ChildrenMovie("Frozen");
        deadPool = new NewReleaseMovie("DeadPool");
    }

    @Test
    public void returnCalculatedRentalAmountWhenRegularMovieIsRentedForTwoDays(){
        rentalAmount = mummy.calculateRentalAmount(2);

        assertEquals(2,rentalAmount,0.001);
    }

    @Test
    public void returnCalculatedRentalAMountWhenRegularMovieIsRentedForMoreThanTwoDays() {
        rentalAmount = mummy.calculateRentalAmount(3);

        assertEquals(3.5,rentalAmount,0.001);

    }

    @Test
    public void returnCalculatedRentalAmountWhenChildrenMovieIsRentedForThreeDays() {
        rentalAmount = frozen.calculateRentalAmount(3);

        assertEquals(1.5,rentalAmount,0.001);
    }

    @Test
    public void returnCalculatedRentalAmountWhenChildrenMovieIsRentedForMoreThanThreeDays() {
        rentalAmount = frozen.calculateRentalAmount(5);

        assertEquals(4.5,rentalAmount,0.001);
    }

    @Test
    public void returnCalculatedRentalAmountWhenNewReleasedIsRented() {
        rentalAmount = deadPool.calculateRentalAmount(3);

        assertEquals(9,rentalAmount,0.001);
    }
}
