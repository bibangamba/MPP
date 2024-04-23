package prob8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice {
  public static void main(String... args) {
    Trader raoul = new Trader("Raoul", "Cambridge");
    Trader mario = new Trader("Mario", "Milan");
    Trader alan = new Trader("Alan", "Cambridge");
    Trader brian = new Trader("Brian", "Cambridge");

    List<Transaction> transactions =
        Arrays.asList(
            new Transaction(brian, 2011, 300),
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950));

    // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
    System.out.println("### Query1");
    transactions.stream()
        .filter(t -> t.getYear() >= 2011)
        .sorted(Comparator.comparing(Transaction::getValue))
        .forEach(System.out::println);

    // Query 2: What are all the unique cities where the traders work?
    System.out.println("### Query2");
    transactions.stream().map(t -> t.getTrader().getCity()).distinct().forEach(System.out::println);

    // Query 3: Find all traders from Cambridge and sort them by name.
    System.out.println("### Query3");
    transactions.stream()
        .map(Transaction::getTrader)
        .filter(t -> t.getCity().equals("Cambridge"))
        .sorted(Comparator.comparing(Trader::getName))
        .forEach(System.out::println);

    // Query 4: Return a string of all traders names sorted alphabetically.
    System.out.println("### Query4");
    String traderNames = transactions.stream()
        .map(Transaction::getTrader)
        .filter(t -> t.getCity().equals("Cambridge"))
        .sorted(Comparator.comparing(Trader::getName))
        .map(Trader::getName)
        .collect(Collectors.joining(", "));
    System.out.println(traderNames);

    // Query 5: Are there any trader based in Milan?
    System.out.println("### Query5");
    System.out.println(
        "Are there any trader based in Milan? "
            + transactions.stream()
                .map(Transaction::getTrader)
                .anyMatch(t -> t.getCity().equals("Milan")));

    // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
    System.out.println("### Query6");
    transactions.stream()
        .map(
            t -> {
              if (t.getTrader().getCity().equals("Milan")) {
                t.getTrader().setCity("Cambridge");
              }
              return t;
            })
        .forEach(System.out::println);

    // Query 7: What's the highest value in all the transactions?
    System.out.println(
        "What's the highest value in all the transactions? "
            + transactions.stream()
                .map(Transaction::getValue)
                .max(Integer::compareTo)
                .orElse(null));
  }
}
