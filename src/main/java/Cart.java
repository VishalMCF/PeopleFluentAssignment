import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cart implements ICart,IApplyOffer{

    private final Map<Product, Integer> items;
    private double totalValue;

    public Cart(){
        items = new HashMap<>();
    }

    public void addToCart(Product product, int quantity){

        if(!items.containsKey(product)){
            items.put(product, 1);
        }else{
            items.put(product, items.get(product)+1);
        }
    }

    @Override
    public double getTotal() {
        double sum = 0;
        for(Product item: items.keySet()){
            sum += item.getPrice()*items.get(item);
        }
        this.totalValue = sum;
        return sum;
    }

    @Override
    public void applyOffer(IOffer offer) {
        offer.applyOnItem(this);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }
}
