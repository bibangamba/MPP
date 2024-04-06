package prob2.housing;

public class Apartment {

    private double rent;

    public Apartment(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    public void updateRent(double newRent) {
        this.rent = newRent;
    }
}
