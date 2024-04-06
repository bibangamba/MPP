package interfaces_diamond;

public interface A {
  default void print() {
    System.out.println("Interface A");
  }
}
