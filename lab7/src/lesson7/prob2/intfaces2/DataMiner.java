package lesson7.prob2.intfaces2;

import java.util.ArrayList;
import java.util.List;

public class DataMiner {
  List<ClosedCurve> objects = new ArrayList<>();

  public static void main(String[] args) {
    DataMiner dm = new DataMiner();
    dm.objects.add(new Rectangle(5, 7));
    dm.objects.add(new Rectangle(2, 9));
    dm.objects.add(new Circle(6));
    dm.objects.add(new EquilateralTriangle(8));
    dm.objects.add(new Ellipse(8, 2));
    System.out.println(dm.computeAveragePerimeter());
  }

  // OO (good) way of performing computation
  public double computeAveragePerimeter() {
    if (objects == null || objects.isEmpty()) return 0.0;
    double sum = 0.0;
    for (int i = 0; i < objects.size(); ++i) {
      System.out.printf(
          "Perimeter for: %s — %f%n",
          objects.get(i).getClass().getSimpleName(), objects.get(i).computePerimeter());
      objects.get(i).computePerimeter();
      sum += objects.get(i).computePerimeter();
    }
    return sum / objects.size();
  }
}
