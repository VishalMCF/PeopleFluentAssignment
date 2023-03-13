import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductCatalog implements ICatalog {

    Map<String, Product> productMap = new HashMap<>();

    public void addToCatalog(List<String> tokens){
        String name = tokens.get(0);
        Double price = Double.parseDouble(tokens.get(1));
        String img = tokens.get(2);

        Product product = Product.getInstance();
        product.setName(name);
        product.setImg(img);
        product.setPrice(price);
        productMap.put(name, product);
    }

    @Override
    public void removeFromCatalog(String name) {
        if(productMap.containsKey(name)) {
            productMap.remove(name);
        }
    }

    public Product chooseProduct(String name){
        return productMap.get(name);
    }
}
