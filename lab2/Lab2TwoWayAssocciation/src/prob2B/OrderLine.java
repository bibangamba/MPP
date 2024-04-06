package prob2B;

public class OrderLine {

  private String orderLineNum;
  private double price;
  private int quantity;
  private Order order;

  OrderLine(Order order) {
    if(order == null) throw new IllegalArgumentException("Order cannot be null");
    this.order = order;
  }

  public String getOrderLineNum() {
    return orderLineNum;
  }

  public void setOrderLineNum(String orderLineNum) {
    this.orderLineNum = orderLineNum;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Order getOrder() {
    return order;
  }

  @Override
  public String toString() {
    return orderLineNum + "_" + price + "_" + quantity;
  }
}
