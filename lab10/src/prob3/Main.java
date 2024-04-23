package prob3;

import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    test1();
  }

  public static <T> boolean contains1(List<T> list, T s) {
    for (T x : list) {
      if (x == null && s == null) return true;
      if (s == null || x == null) continue;
      if (x.equals(s)) return true;
    }
    return false;
  }

  public static void test1() {
    List<String> list = Arrays.asList("Bob", "Joe", "Tom");
    System.out.println("Contains 'Bob': " + Main.contains1(list, "Bob"));
    System.out.println("Contains 'Job': " + Main.contains1(list, "Job"));

    List<Integer> list2 = Arrays.asList(23, 42, 53, 2, 12, 342);
    System.out.println("Contains 12: " + Main.contains1(list2, 12));
    System.out.println("Contains 23: " + Main.contains1(list2, 23));
    System.out.println("Contains 13: " + Main.contains1(list2, 13));
  }
}
