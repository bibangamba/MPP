package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
  private final LocalDate orderDate;
  private final List<OrderLine> orderLines;

  Order(LocalDate orderDate) {
    if (orderDate == null) throw new IllegalArgumentException("Order Date cannot be null");
    this.orderDate = orderDate;
    this.orderLines = new ArrayList<>();
  }

  public LocalDate getOrderDate() {
    return orderDate;
  }

  public List<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void addOrderLines(List<OrderLine> orderLines) {
    this.orderLines.addAll(orderLines);
  }

  public void addOrderLine(OrderLine orderLine) {
    this.orderLines.add(orderLine);
  }
}
