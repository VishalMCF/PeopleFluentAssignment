import java.util.Map;
import java.util.Set;

public class Buy1AppleGet1Free implements IOffer{

    private final static String ITEM_NAME = "Apple";

    @Override
    public void applyOnItem(ICart cart) {
        Map<Product, Integer> map = cart.getItems();
        Set<Product> productSet = map.keySet();
        Product appleProduct = null;
        for(Product p: productSet){
            if(p.getName().equals(ITEM_NAME)){
                appleProduct = p;
                break;
            }
        }
        if(appleProduct == null) return;
        map.put(appleProduct, map.get(appleProduct)*2);
    }
}
