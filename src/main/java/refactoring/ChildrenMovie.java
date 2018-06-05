package refactoring;

public class ChildrenMovie implements Movie {
    private final String title;

    public ChildrenMovie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double calculateRentalAmount(int rentalDays) {
        if (rentalDays <= 3) return 1.5;
        else return (rentalDays - 3) * 1.5 + 1.5;
    }

}
