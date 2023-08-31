import java.util.ArrayList;
import java.util.List;

public class ShoppingCart { //presenta el carrito de compras y sus opciones
    private final List<Product> items = new ArrayList<>();
    private Product Product;

    public void addItem(Product) {
        items.add(Product);
    }

    public List<Product> getItems() {
        return items;
    }
    public double calculateTotalPrice(){
        double total = 0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }
}
