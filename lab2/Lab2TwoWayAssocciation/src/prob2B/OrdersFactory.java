package prob2B;

import java.time.LocalDate;

public class OrdersFactory {
  Order order;

  private OrdersFactory() {}

  public static Order createOrder(
      LocalDate orderDate, String orderLineNum, double price, int quantity) {
    Order order = new Order(orderDate);

    OrderLine orderLine = new OrderLine(order);
    orderLine.setOrderLineNum(orderLineNum);
    orderLine.setPrice(price);
    orderLine.setQuantity(quantity);

    order.addOrderLine(orderLine);
    return order;
  }

  public static OrderLine createOrderLine(
      Order order, String orderLineNum, double price, int quantity) {
    OrderLine orderline = new OrderLine(order);
    orderline.setOrderLineNum(orderLineNum);
    orderline.setPrice(price);
    orderline.setQuantity(quantity);

    return orderline;
  }
}
