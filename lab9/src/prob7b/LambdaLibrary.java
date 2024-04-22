package prob7b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
  public static final QuadriFunction<List<Employee>, Integer, Character, Character, String> EMPLOYEES_SALARY_NAME_FILTER =
      (list, salary, minChar, maxChar) ->
          list.stream()
              .filter(e -> e.getSalary() > salary)
              .filter(
                  e -> {
                    char startsWith = e.getLastName().charAt(0);
                    return startsWith >= minChar && startsWith <= maxChar;
                  })
              .map(e -> e.getFirstName() + " " + e.getLastName())
              .sorted()
              .collect(Collectors.joining(", "));
}
