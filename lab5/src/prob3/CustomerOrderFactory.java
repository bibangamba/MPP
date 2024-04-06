package prob3;

import java.time.LocalDate;

public final class CustomerOrderFactory {
  private CustomerOrderFactory() {}

  public static Customer createCustomer(String name) {
    if (name == null) throw new IllegalArgumentException("Customer name cannot be null");
    return new Customer(name);
  }

  public static Order createOrder(Customer customer, LocalDate date) {
    if (customer == null) throw new IllegalArgumentException("Customer cannot be null");
    Order order = new Order(date);
    customer.addOrder(order);
    return order;
  }

  public static void addItem(Order order, String itemName) {
    if (order == null) throw new IllegalArgumentException("Order cannot be null");
    order.addItem(itemName);
  }
}
