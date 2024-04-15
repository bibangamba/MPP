package lesson7.prob3;

import lesson7.prob2.intfaces2.Circle;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
  @SuppressWarnings("unused")
  public static void main(String[] args) {
    List<String> list =
        Arrays.asList(
            "Hello there",
            "Goodbye",
            "Back soon",
            "Away",
            "On Vacation",
            "Everywhere you want to be");

    System.out.println("########## Lambda: \n");
    list.forEach(str -> System.out.println(str.toUpperCase() + "\n"));

    System.out.println("########## Anonymous Class: \n");
    list.forEach(
        new Consumer<String>() {
          @Override
          public void accept(String s) {
            System.out.println(s.toUpperCase() + "\n");
          }
        });

    System.out.println("########## Inner Class: \n");
    ForEachExample forEachExample = new ForEachExample();
    list.forEach(forEachExample.getConsumer());
  }

  StringConsumer getConsumer() {
    return new StringConsumer();
  }

  // implement a Consumer
  class StringConsumer implements Consumer<String> {

    @Override
    public void accept(String s) {
      System.out.println(s.toUpperCase() + "\n");
    }
  }
}
