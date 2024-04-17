import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Problem4 {
  public static void main(String[] args) {
    String[] names = {"Alexis", "Tim", "Kyleen", "Kristy"};

//    Comparator<String> strComp = (x, y) -> x.compareToIgnoreCase(y); // lambda
//    Comparator<String> strCompMethodRef = String::compareToIgnoreCase; // method ref

    Arrays.sort(names, String::compareToIgnoreCase);
    Function<String[], List<String>> func = Arrays::asList;
    List<String> list = func.apply(names);
    Consumer<List<String>> stringConsumer = System.out::println;
    stringConsumer.accept(list);
  }
}
