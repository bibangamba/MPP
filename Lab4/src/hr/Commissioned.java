package hr;

import java.util.ArrayList;
import java.util.List;

public class Commissioned extends Employee {
  private float commission;
  private double baseSalary;
  private List<Order> orders;

  public Commissioned(String empId, float commission, double baseSalary, List<Order> orders) {
    super(empId);
    this.commission = commission;
    this.baseSalary = baseSalary;
    this.orders = orders;
  }

  public void addOrder(Order order) {
    this.orders.add(order);
  }

  public void addOrders(List<Order> orders) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.addAll(orders);
  }

  @Override
  double calcGrossPay(int month, int year) {
    double totalOrderAmountFromLastMonth = 0;
    int lastMonth = month - 1 > 0 ? month - 1 : 12;
    for (Order o : this.orders) {
      if (o.getOrderDate().getMonthValue() == lastMonth) {
        totalOrderAmountFromLastMonth += o.getOrderAmount();
      }
    }

    return this.baseSalary + (totalOrderAmountFromLastMonth * this.commission);
  }
}
