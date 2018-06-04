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

    public boolean isDaysRentedMoreThan(int days) {
        return daysRented >days;
    }

    public boolean isRentedMovie(Class<NewReleaseMovie> newReleaseMovieClass) {
        return movie.getClass()==newReleaseMovieClass;
    }
}
