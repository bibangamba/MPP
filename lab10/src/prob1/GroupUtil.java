package prob1;

import java.util.*;

public class GroupUtil {
  // Fix this code
  public static <T> Group<T> copy(Group<T> group) {
    List<T> elements = group.getElements();
    Group<T> grp = new Group<T>(group.getSpecialElement(), elements);
    return grp;
  }

  // Qn. 2
  public static <T extends Comparable<? super T>> T secondSmallest(List<T> elements) {
    Collections.sort(elements);
    return elements.get(1);
  }

  // Test using this main method
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(0, 1, 2, 3, 4);
    Group<Integer> group = new Group<>(0, list);
    System.out.println(group);
    System.out.println(GroupUtil.copy(group));

    System.out.println(secondSmallest(list));
  }
}
