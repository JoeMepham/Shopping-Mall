import java.util.Iterator;

public class Shopper {
    private String _name;
    private Wallet _wallet;
    private ShoppingTrip _trip;
    private ShoppingCart _currentShoppingCart;

    public Shopper (String name) {
        _name = name;
    }

    public Shopper (String name, double money) {
        _name = name;
        _wallet = new Wallet(money, this);
    }

    public Wallet getWallet() {
        return _wallet;
    }

    public ShoppingTrip getShoppingTrip() {
        return _trip;
    }

    public void setShoppingCart(ShoppingCart cart) {
        _currentShoppingCart = cart;
    }

    public ShoppingCart getCurrentShoppingCart() {
        return _currentShoppingCart;
    }

    public void visit(Mall mall) {
        _trip = new ShoppingTrip();
        mall.addVisitor(this);
    }

    public void buyFrom(Store store, Item product) {
        _currentShoppingCart.add(product);
    }

    public void checkout() {
        Iterator purchases = getCurrentShoppingCart().getPurchases();
        Item item;
        Purchase purchase;
        while (purchases.hasNext()) {
            item = (Item)purchases.next();
            if (getWallet().remaining() - item.getPrice() >= 0) {
                getWallet().takeOut(item.getPrice());
                getShoppingTrip().addPurchase(new Purchase(getCurrentShoppingCart().getStore(), item));
            } else {
                System.out.println("You don't have enough money to buy "+item.getName()+"\n");
            }
        }
    }

    public void leaveMall() {
        Item item;
        Purchase purchase;
        Iterator purchases = getShoppingTrip().getPurchases();
        System.out.println("You ended your shopping trip with");
        while (purchases.hasNext()) {
            purchase = (Purchase)purchases.next();
            item = purchase.getItem();
            System.out.println(item.getName()+" bought at "+purchase.getStore().getName()+" for "+item.getPrice());
        }
        System.out.println("You have " + getWallet().remaining() + "left in your wallet");
    }

}
