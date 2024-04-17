import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyClass {
  int x;
  String y;

  public MyClass(int x, String y) {
    this.x = x;
    this.y = y;
  }

  public static void main(String[] args) {
    MyClass myclass = new MyClass(1, "A");
    MyClass myclass1 = new MyClass(1, "B");
    myclass.myMethod(myclass); // print true
    myclass.myMethod(myclass1); // print false

  }

  // testing method to check the equality, write a lambda to do this
  public void myMethod(MyClass cl) {
    // Implement
    Predicate<MyClass> expr = this::equals;
    System.out.println(expr.test(cl));
  }

  @Override
  public boolean equals(Object ob) {
    if (ob == null) return false;
    if (ob.getClass() != getClass()) return false;
    MyClass mc = (MyClass) ob;
    return mc.x == x && mc.y.equals(y);
  }
}
