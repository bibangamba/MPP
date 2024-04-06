package prob3.extpackage;

import java.time.LocalDate;
import prob3.Customer;
import prob3.CustomerOrderFactory;
import prob3.Order;

public class Main {
  public static void main(String[] args) {
    Customer customer = CustomerOrderFactory.createCustomer("Bob");

    Order order = CustomerOrderFactory.createOrder(customer, LocalDate.now());
    CustomerOrderFactory.addItem(order, "Shirt");
    CustomerOrderFactory.addItem(order, "Laptop");

    order = CustomerOrderFactory.createOrder(customer, LocalDate.now());
    CustomerOrderFactory.addItem(order, "Pants");
    CustomerOrderFactory.addItem(order, "Knife set");

    System.out.println(customer.getOrders());
  }
}
