package prob2.housing;

import java.util.LinkedList;
import java.util.List;

public class Building {

    private final double maintenanceCosts;
    private final List<Apartment> apartments;
    private double profit;

    public Building(double costs) {
        maintenanceCosts = costs;
        apartments = new LinkedList<Apartment>();
    }

    public void addApartment(Apartment ap) {
        if (ap == null) throw new IllegalArgumentException("Apartment should not be null");
        apartments.add(ap);
    }

    public double getProfit() {

        for (Apartment ap : apartments) {
            profit += ap.getRent();

        }

        return profit - maintenanceCosts;

    }
}
