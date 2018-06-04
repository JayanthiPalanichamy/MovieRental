package refactoring;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String statement() {
        String result = "Rental record for " + getName() + "\n";
        result = getAmountSummary(result);
        result += "Amount owed is " + String.valueOf(getTotalAmount()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private String getAmountSummary(String result) {
        for (Rental rental : rentals) {
            double amount = rental.getAmount();
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(amount) + "\n";
        }
        return result;
    }

    private double getTotalAmount() {
        return rentals.stream().mapToDouble(rental ->rental.getAmount()).sum();
    }

    private int getFrequentRenterPoints() {
        int frequentRenterPoints=0;
        for (Rental rental : rentals) {
            frequentRenterPoints++;
            if (isNewReleaseRentedMoreThan1Days(rental))
                frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }

    private boolean isNewReleaseRentedMoreThan1Days(Rental rental) {
        return rental.isRentedMovie(NewReleaseMovie.class) && rental.isDaysRentedMoreThan(1) ;
    }


}
