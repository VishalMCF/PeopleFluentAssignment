import java.util.Map;

public class Buy3OrgFor2 implements IOffer{

    private final static String ITEM_NAME = "Orange";

    @Override
    public void applyOnItem(ICart cart) {
        // check how many oranges are here
        Map<Product, Integer> map = cart.getItems();
        Product oranges = null;
        for(Product p: map.keySet()){
            if(p.getName().equals(ITEM_NAME)){
                oranges = p;
                break;
            }
        }
        if(oranges == null) return;
        int countOfOranges = map.get(oranges);
        int extraAdded = countOfOranges/2;
        map.put(oranges, countOfOranges+extraAdded);
    }
}
