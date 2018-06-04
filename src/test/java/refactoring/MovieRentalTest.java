package refactoring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MovieRentalTest {
    @Test
    public void returnAmount3ForNewReleasedMovieRentedForOneDay(){
        Movie deadPool = new Movie("Dead Pool",1);
        Rental rental = new Rental(deadPool,1);
        Customer customer = new Customer("Jayanthi");
        customer.addRental(rental);

        assertEquals("Rental record for Jayanthi\n" +
                "\tDead Pool\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points",customer.statement());
    }

    @Test
    public void returnAmount3ForRentingTwoRegularMoviesForOneDay() {
        Movie commando = new Movie("Commando",0);
        Movie mummy = new Movie("Mummy",0);
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
}
