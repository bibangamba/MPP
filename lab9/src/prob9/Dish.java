package prob9;

import java.util.*;

public class Dish {

  public static final List<Dish> menu =
      Arrays.asList(
          new Dish("pork", false, 800, Type.MEAT),
          new Dish("beef", false, 700, Type.MEAT),
          new Dish("chicken", false, 400, Type.MEAT),
          new Dish("french fries", true, 530, Type.OTHER),
          new Dish("rice", true, 350, Type.OTHER),
          new Dish("season fruit", true, 120, Type.OTHER),
          new Dish("pizza", true, 550, Type.OTHER),
          new Dish("prawns", false, 400, Type.FISH),
          new Dish("salmon", false, 450, Type.FISH));
  private final String name;
  private final boolean vegetarian;
  private final int calories;
  private final Type type;

  public Dish(String name, boolean vegetarian, int calories, Type type) {
    this.name = name;
    this.vegetarian = vegetarian;
    this.calories = calories;
    this.type = type;
  }

  public static void main(String[] args) {
    System.out.println(
        "a. Is there any Vegetarian meal available ( return type boolean): " + hasVegan(menu));
    System.out.println(
        "b. Is there any healthy menu have calories less than 1000 ( return type boolean): "
            + hasLowCalories(menu, 1000));
    System.out.println(
        "c. Is there any unhealthy menu have calories greater than 1000 ( return type boolean): "
            + hasHighCalories(menu, 1000));
    System.out.println(
        "d. find and return the first item for the type of MEAT( return type Optional<Dish>): "
            + getFirstMeat(menu).orElse(null));
    System.out.println(
        "e. calculateTotalCalories() in the menu using reduce. (return int): "
            + calculateTotalCalories(menu));
    System.out.println(
        "f. calculateTotalCaloriesMethodReference()in the menu using MethodReferences. (return int): "
            + calculateTotalCaloriesMethodReference(menu));
  }

  public static boolean hasVegan(List<Dish> menu) {
    return menu.stream().anyMatch(Dish::isVegetarian);
  }

  public static boolean hasLowCalories(List<Dish> menu, final int calories) {
    return menu.stream().anyMatch(d -> d.getCalories() <= calories);
  }

  public static boolean hasHighCalories(List<Dish> menu, final int calories) {
    return menu.stream().anyMatch(d -> d.getCalories() >= calories);
  }

  public static Optional<Dish> getFirstMeat(List<Dish> menu) {
    return menu.stream().filter(d -> d.getType() == Type.MEAT).findFirst();
  }

  public static Integer calculateTotalCalories(List<Dish> menu) {
    return menu.stream()
        .map(Dish::getCalories)
        .reduce((totalCals, dishCalories) -> totalCals + dishCalories)
        .orElse(0);
  }

  public static Integer calculateTotalCaloriesMethodReference(List<Dish> menu) {
    return menu.stream().map(Dish::getCalories).reduce(Integer::sum).orElse(0);
  }

  public String getName() {
    return name;
  }

  public boolean isVegetarian() {
    return vegetarian;
  }

  public int getCalories() {
    return calories;
  }

  public Type getType() {
    return type;
  }

  @Override
  public String toString() {
    return name;
  }

  public enum Type {
    MEAT,
    FISH,
    OTHER
  }
}
