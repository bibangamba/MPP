package hr;


public abstract class Employee {
  public static final float FICA = 0.23f;
  public static final float STATE = 0.05f;
  public static final float LOCAL = 0.01f;
  public static final float MEDICARE = 0.03f;
  public static final float SOCIAL_SECURITY = 0.075f;
  private String empId;

  public Employee(String empId){
    this.empId = empId;
  }

  public void print(int month, int year) {

    System.out.printf("Employee Id : %s%n", this.empId);
    System.out.println(calcCompensation(month, year));
  }

  public String getEmpId() {
    return empId;
  }

  abstract double calcGrossPay(int month, int year);

  Paycheck calcCompensation(int month, int year) {
    double grossPay = this.calcGrossPay(month, year);

    return new Paycheck(grossPay);
  }
}
