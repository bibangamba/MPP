package lesson7.prob2.intfaces2;

public class Ellipse implements ClosedCurve {
  double semiAxis;
  double elateral;

  public Ellipse(double semiAxis, double elateral) {
    this.semiAxis = semiAxis;
    this.elateral = elateral;
  }

  @Override
  public double computePerimeter() {
    return 4 * semiAxis * elateral;
  }
}
