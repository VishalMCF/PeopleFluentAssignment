import java.util.Map;

public interface ICart {
    void addToCart(Product product, int quantity);
    double getTotal();
    Map<Product, Integer> getItems();
    void setTotalValue(double value);
}
