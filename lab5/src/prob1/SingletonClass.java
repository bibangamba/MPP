package prob1;

import java.util.Random;

public class SingletonClass {
  private static SingletonClass instance;
  ;
  private String key;

  private SingletonClass() {
    generateAvastKey();
  }

  public static SingletonClass getSingletonObject() {
    if (instance != null) {
      System.out.println("Unsuccessful to produce the key....");
      return null;
    }
    instance = new SingletonClass();
    return instance;
  }

  private void generateAvastKey() {
    Random r = new Random();
    this.key = "" + r.nextInt(1000000, 9999999);

    System.out.println("Key generated Successfully");
    System.out.printf("Your key to activate Avast anti virus is:%s %n", this.key);
  }
}
