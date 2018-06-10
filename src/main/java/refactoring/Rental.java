package refactoring;

public class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    public double getAmount() {
        return movie.calculateRentalAmount(daysRented);
    }

    private boolean isDaysRentedMoreThan(int days) {
        return daysRented > days;
    }

    private boolean isRentedMovie(Class<NewReleaseMovie> newReleaseMovieClass) {
        return movie.getClass() == newReleaseMovieClass;
    }

    public int getRenterPointer() {
        if (isNewReleaseRentedMoreThan1Days()) return 2;
        else return 1;
    }

    private boolean isNewReleaseRentedMoreThan1Days() {
        return isRentedMovie(NewReleaseMovie.class) && isDaysRentedMoreThan(1);
    }
}
