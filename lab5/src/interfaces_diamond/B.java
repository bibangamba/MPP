package interfaces_diamond;

public interface B {
  default void print() {
    System.out.println("Interface B ");
  }
}
