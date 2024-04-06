package prob2;

public final class VehicleFactory {
  private VehicleFactory() {}

  public static Vehicle getVehicle(String v) {
    Vehicle vehicle;
    switch (v.toLowerCase()) {
      case "bus":
        vehicle = new Bus();
        break;
      case "truck":
        vehicle = new Truck();
        break;
      case "car":
        vehicle = new Car();
        break;
      case "electriccar":
        vehicle = new ElectricCar();
        break;
      default:
        System.out.println("Unknown vehicle type: " + v);
        vehicle = null;
    }
    return vehicle;
  }
}
