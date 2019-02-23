import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Store {
    private String _name;
    private Mall _mall;
    private ArrayList<ShoppingCart> _carts = new ArrayList<ShoppingCart>();
    private ArrayList<Item> _products = new ArrayList<Item>();

    public void setMall (Mall mall) {
        _mall = mall;
    }

    public void setName (String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }

    public void addProduct(Item product) {
        _products.add(product);
        product.soldIn(this);
    }
    public Iterator getProducts() {
        return _products.iterator();
    }

    public void newCustomer(Shopper shopper) {
        ShoppingCart cart = new ShoppingCart(shopper, this);
        _carts.add(cart);
        Item item;
        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";

        do {
            System.out.print("What item would you like to purchase?\n");
            Iterator<Item> items = getProducts();
            while (items.hasNext()) {
                item = items.next();
                System.out.print(item.getName()+"\n");
            }
            String itemName = scan.next();
            shopper.buyFrom(this, findProduct(itemName));

            System.out.print("Continue shopping at this Store (y/n)? ");
            keepShopping = scan.next();

        } while (keepShopping.equals("y"));

        shopper.checkout();
    }

    public Item findProduct(String itemName) {
        Item item = null;
        Iterator<Item> items = getProducts();

        while (items.hasNext()) {
            item = items.next();
            System.out.println("comparing "+item.getName()+" and "+itemName);
            if (item.getName().equals(itemName)) {
                break;
            }
        }
        return item;
    }

}
