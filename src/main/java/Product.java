public class Product {

    private String name;
    private Double price;
    private String img;

    private Product(){}

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double p) {
        price = p;
    }

    public static Product getInstance(){
        return new Product();
    }
}
