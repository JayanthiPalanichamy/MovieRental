package refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieTest {
    @Test
    public void returnCustomerStatementWhenNewReleasedMovieRentedForOneDay(){
        Movie deadPool = new NewReleaseMovie("Dead Pool");
        Rental rental = new Rental(deadPool,1);
        Customer customer = new Customer("Jayanthi");
        customer.addRental(rental);

        assertEquals("Rental record for Jayanthi\n" +
                "\tDead Pool\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void returnCustomerStatementWhenRentingTwoRegularMoviesForOneDay() {
        Movie commando = new RegularMovie("Commando");
        Movie mummy = new RegularMovie("Mummy");
        Rental commandoRental = new Rental(commando,1);
        Rental mummyRental = new Rental(mummy,1);
        Customer customer = new Customer("Jayanthi");
        customer.addRental(commandoRental);
        customer.addRental(mummyRental);

        assertEquals("Rental record for Jayanthi\n" +
                "\tCommando\t2.0\n" +
                "\tMummy\t2.0\n" +
                "Amount owed is 4.0\n" +
                "You earned 2 frequent renter points",customer.statement());
    }

    @Test
    public void returnCustomerStatementWhenNewReleasedMovieIsRentedMoreThanADay() {
        Movie deadPool = new NewReleaseMovie("Dead Pool");
        Rental rental = new Rental(deadPool,3);
        Customer customer = new Customer("Jayanthi");
        customer.addRental(rental);

        assertEquals("Rental record for Jayanthi\n" +
                "\tDead Pool\t9.0\n" +
                "Amount owed is 9.0\n" +
                "You earned 2 frequent renter points",customer.statement());
    }

    @Test
    public void returnCustomerStatementWhenOneChildrenMovieAndOneRegularMovieIsRented() {
        Movie coco = new ChildrenMovie("COCO");
        Rental cocoRental = new Rental(coco,1);
        Movie mummy = new RegularMovie("Mummy");
        Rental mummyRental = new Rental(mummy,1);
        Customer customer = new Customer("Jayanthi");
        customer.addRental(cocoRental);
        customer.addRental(mummyRental);

        assertEquals("Rental record for Jayanthi\n" +
                "\tCOCO\t1.5\n" +
                "\tMummy\t2.0\n" +
                "Amount owed is 3.5\n" +
                "You earned 2 frequent renter points",customer.statement());
    }
}
