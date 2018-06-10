package refactoring;

public class ChildrenMovie extends Movie {
    public static final double NORMAL_COST = 1.5;
    public static final double EXTRA_FARE = 1.5;
    public static final int MAX_DAYS_TILL_NORMAL_COST = 3;

    public ChildrenMovie(String title) {
        super(title);
    }

    public String getTitle() {
        return title;
    }

    public double calculateRentalAmount(int rentalDays) {
        if (rentalDays <= MAX_DAYS_TILL_NORMAL_COST) return NORMAL_COST;
        else return (rentalDays - MAX_DAYS_TILL_NORMAL_COST) * EXTRA_FARE + NORMAL_COST;
    }

}
