package prob2.main;

import prob2.housing.Apartment;
import prob2.housing.Building;
import prob2.housing.Landlord;

public class Main {
    public static void main(String[] args) {

        Landlord landlord = new Landlord();
        Building building1 = new Building(200);
        landlord.addBuilding(building1);
        building1.addApartment(new Apartment(500));
        building1.addApartment(new Apartment(800));
        System.out.printf("Total profit (expected 1100.0): %.0f", landlord.calculateTotalProfit());


    }
}