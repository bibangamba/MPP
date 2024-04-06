package prob2B.main;

import prob2B.Order;
import prob2B.OrderLine;
import prob2B.OrdersFactory;

import java.time.LocalDate;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Order order = OrdersFactory.createOrder(LocalDate.of(2024, 3, 29), "1234A", 29.99, 3);
    OrderLine orderLine1 = OrdersFactory.createOrderLine(order, "4321Q", 49.99, 1);
    order.addOrderLine(orderLine1);

    OrderLine orderLine2 = OrdersFactory.createOrderLine(order, "9890B", 19.99, 1);
    OrderLine orderLine3 = OrdersFactory.createOrderLine(order, "2354B", 139.99, 1);
    order.addOrderLines(List.of(orderLine2, orderLine3));

    System.out.println(order.getOrderLines());
  }
}
