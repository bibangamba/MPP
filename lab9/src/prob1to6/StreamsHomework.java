package prob1to6;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsHomework {
  public static void main(String[] args) {
    // No.1
    System.out.println(Stream.of("Bill", "Thomas", "Mary").collect(Collectors.joining(", ")));

    // No.2
    Stream<Integer> myIntStream = Stream.of(3, 21, 43, 53, 1, 334, 4);
    IntSummaryStatistics summary =
        myIntStream.collect(Collectors.summarizingInt(Integer::intValue));
    System.out.printf("Max: %d and Min:%d %n", summary.getMax(), summary.getMin());

    // No.3
    System.out.println(
        new StreamsHomework()
            .countWords(List.of("Bill", "Thomas", "Mary", "Mart", "Jade"), 'a', 'd', 4));

    // No. 4
    printSquares(4);

    // No. 5
    System.out.println(streamSection(nextStream(), 1, 3).toList()); // [ccc, ddd]
    System.out.println(streamSection(nextStream(), 3, 5).toList()); // [eee, fff]
    System.out.println(streamSection(nextStream(), 0, 4).toList()); // [bbb, ccc, ddd, eee]

    // No. 6
    Set<Set<String>> setOfSets = Set.of(Set.of("A", "B"), Set.of("D"), Set.of("1", "3", "5"));
    Set<String> union = new StreamsHomework().union(setOfSets);
    System.out.println(union);

    List<? super Integer> nums = new ArrayList<>();
    nums.add(2);
    nums.add(3);
    System.out.println(nums);
  }

  public static void printSquares(int num) {
    String squares =
        Stream.iterate(1, n -> n + 1)
            .limit(num)
            .map(x -> x * x)
            .map(x -> Integer.toString(x))
            .collect(Collectors.joining(", "));
    System.out.println(squares);
  }

  public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
    return stream.skip(m + 1).limit(n - m);
  }

  private static Stream<String> nextStream() {
    return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
  }

  public int countWords(List<String> words, char c, char d, int len) {
    return (int)
        words.stream()
            .filter(str -> str.length() == len)
            .filter(str -> str.indexOf(c) != -1)
            .filter(str -> str.indexOf(d) == -1)
            .count();
  }

  public Set<String> union(Set<Set<String>> sets) {
    return sets.stream()
        .reduce(
            new HashSet<>(),
            (accum, set) -> {
              accum.addAll(set);
              return accum;
            });
  }
}
