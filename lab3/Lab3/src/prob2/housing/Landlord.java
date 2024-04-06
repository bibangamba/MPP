package prob2.housing;

import java.util.LinkedList;
import java.util.List;

public class Landlord {
    private final List<Building> buildings;
    private double totalProfit;

    public Landlord() {
        buildings = new LinkedList<Building>();
    }


    public void addBuilding(Building b) {
        if (b == null) throw new IllegalArgumentException("The building can't be null");
        buildings.add(b);
    }

    public double calculateTotalProfit() {
        for (Building b : buildings) {
            totalProfit += b.getProfit();
        }
        return totalProfit;
    }
}
