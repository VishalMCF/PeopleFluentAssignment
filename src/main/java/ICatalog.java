import java.util.List;

public interface ICatalog {

    void addToCatalog(List<String> details);
    void removeFromCatalog(String name);
    Product chooseProduct(String name);
}
