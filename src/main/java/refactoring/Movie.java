package refactoring;

public abstract class Movie {
    protected final String title;

    protected Movie(String title) {
        this.title = title;
    }

    abstract String getTitle();

    abstract double calculateRentalAmount(int rentalDays);
}
