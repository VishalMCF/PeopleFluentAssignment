public class DashBoard {

    private final ICart cart;
    private final ICatalog productCatalog;

    public DashBoard(ICatalog catalog, ICart cart){
        this.cart = cart;
        this.productCatalog = catalog;
    }

    public void addProduct(String productName){
        Product product = productCatalog.chooseProduct(productName);
        cart.addToCart(product, 1);
    }

    public ICart getCart(){
        return this.cart;
    }
}
