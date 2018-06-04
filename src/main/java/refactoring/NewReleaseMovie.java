package refactoring;

public class NewReleaseMovie implements Movie {
    private final String title;

    public NewReleaseMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public double calculateRentalAmount(int rentalDays) {
        return rentalDays * 3;
    }

}
