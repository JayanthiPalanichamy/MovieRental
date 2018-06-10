package refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        StringBuilder result=new StringBuilder();
        result.append("Rental record for " + name + "\n");
        result.append(getIndividualAmountSummary());
        result.append("Amount owed is " + String.valueOf(getTotalAmount()) + "\n");
        result.append("You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points");

        return result.toString();
    }

    private String getIndividualAmountSummary() {
        StringBuilder result=new StringBuilder();
        for (Rental rental : rentals) {
            result.append("\t" + rental.getMovieTitle() + "\t" + String.valueOf(rental.getAmount()) + "\n");
        }
        return result.toString();
    }

    private double getTotalAmount() {
        return rentals.stream().mapToDouble(Rental::getAmount).sum();
    }

    private int getFrequentRenterPoints() {
        return rentals.stream().mapToInt(Rental::getRenterPointer).sum();
    }
}
