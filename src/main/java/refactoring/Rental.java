package refactoring;

public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
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
