package refactoring;

public class ChildrenMovie implements Movie {
    private final String title;

    public ChildrenMovie(String title) {
        this.title =title;
    }

    public String getTitle() {
        return title;
    }

    public double calculateRentalAmount(int rentalDays) {
        double amount =0;
        amount += 1.5;
        if (rentalDays > 3)
            amount += (rentalDays - 3) * 1.5;
        return amount;
    }
}
