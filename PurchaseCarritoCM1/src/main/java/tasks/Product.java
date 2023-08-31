public class Product { //presenta los productos disponibles para la compra
    private String name;
    private double price;
    private String productDetail;
    private boolean isInCart;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.productDetail = "";
        this.isInCart = false;
    }

    public String getame() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public String getProductDetail(){
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public boolean isInCart() {
        return isInCart;
    }
    public void removeFromCart(){
        isInCart = false;
    }
}