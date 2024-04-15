package lesson7.prob1.partB;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
  private String name;
  private int salary;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return "(" + name + ", " + salary + ")";
  }

  @Override
  public boolean equals(Object e) {
    if (!(e instanceof Employee)) return false;
    Employee o = (Employee) e;
    return o.getName().equals(name) && o.getSalary() == salary;
  }

//  @Override
//  public int hashCode(){
//    return 1;
//  }

  @Override
  public int compareTo(Employee o) {
    return name.compareTo(o.name);
  }

}
