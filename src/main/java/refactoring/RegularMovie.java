package refactoring;

public class RegularMovie implements Movie {
    private final String title;

    public RegularMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double calculateRentalAmount(int rentalDays) {
        double amount =0;
        amount += 2;
        if (rentalDays > 2)
            amount += (rentalDays - 2) * 1.5;
        return amount;
    }
}
