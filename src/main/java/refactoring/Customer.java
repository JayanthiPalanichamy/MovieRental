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
        String result = "Rental record for " + name + "\n";
        result += getIndividualAmountSummary();
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private String getIndividualAmountSummary() {
        String result = "";
        for (Rental rental : rentals) {
            result += "\t" + rental.getMovieTitle() + "\t" + String.valueOf(rental.getAmount()) + "\n";
        }
        return result;
    }

    private double getTotalAmount() {
        return rentals.stream().mapToDouble(rental -> rental.getAmount()).sum();
    }

    private int getFrequentRenterPoints() {
        return rentals.stream().mapToInt(rental -> rental.getRenterPointer()).sum();
    }
}
