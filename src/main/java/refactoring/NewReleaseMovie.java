package refactoring;

public class NewReleaseMovie extends Movie {
    public static final int COST_PER_DAY = 3;

    public NewReleaseMovie(String title) {
        super(title);
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double calculateRentalAmount(int rentalDays) {
        return rentalDays * COST_PER_DAY;
    }

}
