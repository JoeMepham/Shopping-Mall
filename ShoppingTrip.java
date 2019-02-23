import java.util.ArrayList;
import java.util.Iterator;

public class ShoppingTrip {

    private Shopper _shopper;
    private ShoppingCart _cart;
    private ArrayList<Purchase> _purchases = new ArrayList<Purchase>();

    public static void main(String[] args) {
        Mall theMall = new NatickCollection();
        Shopper theShopper = new Shopper("Joe",6000.00);
        theShopper.visit(theMall);
    }

    public Iterator<Purchase> getPurchases() {
        return _purchases.iterator();
    }

    public void addPurchase(Purchase item) {
        _purchases.add(item);
    }
}
