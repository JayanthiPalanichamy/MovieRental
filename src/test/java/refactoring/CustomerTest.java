package refactoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    private Customer customer;
    private Movie deadPool;
    private Movie commando;
    private Movie mummy;
    private Movie coco;

    @Before
    public void setUp(){
        customer = new Customer("Jayanthi");
        deadPool = new NewReleaseMovie("Dead Pool");
        commando = new RegularMovie("Commando");
        mummy = new RegularMovie("Mummy");
        coco = new ChildrenMovie("COCO");
    }
    @Test
    public void returnCustomerStatementWhenNewReleasedMovieRentedForOneDay() {
        Rental rental = new Rental(deadPool, 1);

        customer.addRental(rental);
        String expectedResult = "Rental record for Jayanthi\n" +
                "\tDead Pool\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";

        assertEquals(expectedResult, customer.statement());
    }

    @Test
    public void returnCustomerStatementWhenRentingTwoRegularMoviesForOneDay() {
        Rental commandoRental = new Rental(commando, 1);
        Rental mummyRental = new Rental(mummy, 1);

        customer.addRental(commandoRental);
        customer.addRental(mummyRental);
        String expectedResult = "Rental record for Jayanthi\n" +
                "\tCommando\t2.0\n" +
                "\tMummy\t2.0\n" +
                "Amount owed is 4.0\n" +
                "You earned 2 frequent renter points";

        assertEquals(expectedResult, customer.statement());
    }

    @Test
    public void returnCustomerStatementWhenNewReleasedMovieIsRentedMoreThanADay() {
        Rental rental = new Rental(deadPool, 3);
        customer.addRental(rental);

        String expectedResult = "Rental record for Jayanthi\n" +
                "\tDead Pool\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points";

        assertEquals(expectedResult, customer.statement());
    }

    @Test
    public void returnCustomerStatementWhenOneChildrenMovieAndOneRegularMovieIsRented() {
        Rental cocoRental = new Rental(coco, 1);
        Rental mummyRental = new Rental(mummy, 1);

        customer.addRental(cocoRental);
        customer.addRental(mummyRental);
        String expectedResult = "Rental record for Jayanthi\n" +
                "\tCOCO\t1.5\n" +
                "\tMummy\t2.0\n" +
                "Amount owed is 3.5\n" +
                "You earned 2 frequent renter points";

        assertEquals(expectedResult, customer.statement());
    }
}
