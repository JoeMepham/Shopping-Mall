import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingCart {
    private Shopper _shopper;
    private Store _store;
    private ArrayList<Item> _items = new ArrayList<Item>();

    public ShoppingCart(Shopper shopper, Store store) {
        _shopper = shopper;
        _store = store;
        shopper.setShoppingCart(this);
    }

    public Store getStore() {
        return _store;
    }

    public Iterator<Item> getPurchases() {
        return _items.iterator();
    }

    public void add(Item item) {
        _items.add(item);
    }
}
