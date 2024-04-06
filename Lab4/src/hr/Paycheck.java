package hr;

import static hr.Employee.*;

public final class Paycheck {
  private final double grossPay;
  private final double fica;
  private final double state;
  private final double local;
  private final double medicare;
  private final double socialSecurity;

  Paycheck(double grossPay) {
    this.grossPay = grossPay;
    this.fica = grossPay * FICA;
    this.state = grossPay * STATE;
    this.local = grossPay * LOCAL;
    this.medicare = grossPay * MEDICARE;
    this.socialSecurity = grossPay * SOCIAL_SECURITY;
  }

  public double getNetPay() {
    return this.grossPay
        - (this.fica + this.state + this.local + this.medicare + this.socialSecurity);
  }

  public double getGrossPay() {
    return grossPay;
  }

  public double getFica() {
    return fica;
  }

  public double getState() {
    return state;
  }

  public double getLocal() {
    return local;
  }

  public double getMedicare() {
    return medicare;
  }

  public double getSocialSecurity() {
    return socialSecurity;
  }

  public void print() {
    System.out.println(this.toString());
  }

  @Override
  public String toString() {

    return String.format(
        """
    Paystub:
    Gross Pay: %.1f
    Fica: %.2f
    State: %.2f
    Local: %.2f
    Medicare: %.2f
    Social Security: %.2f
    NET PAY: %.3f""",
        this.getGrossPay(), FICA, STATE, LOCAL, MEDICARE, SOCIAL_SECURITY, this.getNetPay());
  }
}
