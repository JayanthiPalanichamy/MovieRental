package refactoring;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public double calculateRentalAmount(int rentalDays) {
        if (rentalDays <= 2) return 2;
        else return (rentalDays - 2) * 1.5 + 2;
    }
}
