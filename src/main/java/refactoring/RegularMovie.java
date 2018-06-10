package refactoring;

public class RegularMovie extends Movie {

    public static final int NORMAL_COST = 2;
    public static final double EXTRA_FARE = 1.5;
    public static final int MAX_DAYS_TILL_NORMAL_COST = 2;

    public RegularMovie(String title) {
        super(title);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double calculateRentalAmount(int rentalDays) {
        if (rentalDays <= MAX_DAYS_TILL_NORMAL_COST) return NORMAL_COST;
        else return (rentalDays - 2) * EXTRA_FARE + NORMAL_COST;
    }
}
