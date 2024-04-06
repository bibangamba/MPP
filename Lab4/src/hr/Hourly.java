package hr;

public class Hourly extends Employee {
  private static final int WEEKS_IN_MONTH = 4;
  private double hourlyWage;
  private int hoursPerWeek;

  public Hourly(String empId, double hourlyWage, int hoursPerWeek) {
    super(empId);
    this.hourlyWage = hourlyWage;
    this.hoursPerWeek = hoursPerWeek;
  }

  @Override
  public double calcGrossPay(int month, int year) {
    return this.hourlyWage * this.hoursPerWeek * WEEKS_IN_MONTH;
  }

  public double getHourlyWage() {
    return hourlyWage;
  }

  public int getHoursPerWeek() {
    return hoursPerWeek;
  }
}
