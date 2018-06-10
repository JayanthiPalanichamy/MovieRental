package refactoring;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title) {
        super(title);
    }

    public String getTitle() {
        return title;
    }

    public double calculateRentalAmount(int rentalDays) {
        if (rentalDays <= 3) return 1.5;
        else return (rentalDays - 3) * 1.5 + 1.5;
    }

}
