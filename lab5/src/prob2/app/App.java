package prob2.app;

import prob2.Vehicle;
import prob2.VehicleFactory;

public class App {
  public static void main(String[] args) {
    Vehicle v = VehicleFactory.getVehicle("car");
    if (v != null) v.startVehicle();

    v = VehicleFactory.getVehicle("truck");
    if (v != null) v.startVehicle();
  }
}
