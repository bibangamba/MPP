import java.util.*;

public class Product {
  final String title;
  final double price;
  final int model;

  public Product(String title, Double price, int model) {
    this.title = title;
    this.price = price;
    this.model = model;
  }

  public static void main(String[] args) {
    // A & B two comparators
    Product bike = new Product("Bike", 459.99, 54);
    List<Product> prods =
        new ArrayList<>() {
          {
            add(bike);
            add(new Product("Tyre", 39.99, 55));
            add(new Product("Lamp", 19.99, 56));
          }
        };

    TitleComparator tc = new TitleComparator();
    Collections.sort(prods, tc);
    System.out.println("A&B sorted by title: " + prods);
    PriceComparator pc = new PriceComparator();
    Collections.sort(prods, pc);
    System.out.println("A&B sorted by price: " + prods);
    System.out.println("###########\n");

    // part C
    List<Product> prodsC =
        new ArrayList<>() {
          {
            add(bike);
            add(new Product("Tyre", 39.99, 55));
            add(new Product("Lamp", 19.99, 56));
          }
        };
    bike.sortProdListWithLocalClass(prodsC, SortBy.BY_TITLE);
    System.out.println("pt.C sorted by title: " + prodsC);
    bike.sortProdListWithLocalClass(prodsC, SortBy.BY_PRICE);
    System.out.println("pt.C sorted by price: " + prodsC);
    System.out.println("###########\n");


    // part D
    List<Product> prodsD =
        new ArrayList<>() {
          {
            add(bike);
            add(new Product("Tyre", 39.99, 55));
            add(new Product("Lamp", 19.99, 56));
          }
        };
    bike.sortProdListWithLambda(prodsD, SortBy.BY_TITLE);
    System.out.println("pt.D sorted by title: " + prodsD);
    bike.sortProdListWithLambda(prodsD, SortBy.BY_PRICE);
    System.out.println("pt.D sorted by title: " + prodsD);
    System.out.println("###########\n");

  }

  public void sortProdListWithLocalClass(List<Product> prods, SortBy mode) {
    class ProductComparator implements Comparator<Product> {

      @Override
      public int compare(Product o1, Product o2) {
        if (mode == SortBy.BY_TITLE) {
          return o1.getTitle().compareTo(o2.getTitle());
        } else {
          return (int) (o1.getPrice() - o2.getPrice());
        }
      }
    }

    Collections.sort(prods, new ProductComparator());
  }

  public void sortProdListWithLambda(List<Product> prods, SortBy mode) {
    Collections.sort(
        prods,
        (p1, p2) -> {
          if (mode == SortBy.BY_TITLE) {
            return p1.getTitle().compareTo(p2.getTitle());
          } else {
            return (int) (p1.getPrice() - p2.getPrice());
          }
        });
  }

  public String getTitle() {
    return title;
  }

  public double getPrice() {
    return price;
  }

  public int getModel() {
    return model;
  }

  @Override
  public String toString() {
    return String.format("\n %s : %s : %s", title, price, model);
  }

  static enum SortBy {
    BY_TITLE,
    BY_PRICE
  }

  static class TitleComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
      return p1.getTitle().compareTo(p2.getTitle());
    }
  }

  static class PriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
      return (int) (p1.getPrice() - p2.getPrice());
    }
  }
}
