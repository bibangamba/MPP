package lesson7.prob2.intfaces2;

public interface Polygon extends ClosedCurve {
  default double computePerimeter() {
    double perimeter = 0;
      for (double side : getLengths()) {
          perimeter += side;
      }
    return perimeter;
  }

  double[] getLengths();
}
