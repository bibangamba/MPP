package prob10;

import java.util.Arrays;
import java.util.function.BiFunction;

class Human {
  String name;
  int age;
  String gender;

  public Human(String name) {
    this.name = name;
  }

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Human(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
  }
}

public class ConstructorReference {
  public static void main(String args[]) {
    Human[] list = {
      new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male")
    };

    // Query 1  : Print only Female canditates names
    //	Stream.of(list).
    System.out.println("Female candidate names: ");
    Arrays.stream(list)
        .filter(h -> h.gender.equals("Female"))
        .map(Human::getName)
        .forEach(System.out::println);

    // Query 2 : Cretae an objecy by choosing suitable Interface to the specified
    // constructors(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. Then
    // print the object status
    BiFunction<String, Integer, Human> humanCreator = Human::new;
    System.out.println("\n<Human::new> BiFunction \n" + humanCreator.apply("Frank", 104));

    // Query 3 : Count the male candidates whose age is more than 30
    System.out.println(
        "\nNumber of male candidates over age 30: "
            + Arrays.stream(list)
                .filter(h -> h.gender.equals("Male"))
                .filter(h -> h.age > 30)
                .count());
  }
}
