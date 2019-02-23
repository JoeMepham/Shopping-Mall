import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public abstract class Mall {
    private ArrayList<Store> _stores = new ArrayList<Store>();
    private ArrayList<Shopper> _visitors = new ArrayList<Shopper>();

    public void addStore(Store store) {
        _stores.add(store);
    }

    public Iterator getStores() {
        return _stores.iterator();
    }

    public Store enterStore(Shopper shopper, String storeName) {
        Store store = null;
        Iterator<Store> stores = getStores();

        while (stores.hasNext()) {
            store = stores.next();
            System.out.println("checking: "+store.getName()+" and "+storeName);
            if (store.getName().toLowerCase().equals(storeName.toLowerCase())) {
                break;
            }
        }
        if (store != null) store.newCustomer(shopper);
        return store;
    }

    public void addVisitor(Shopper shopper) {
        _visitors.add(shopper);
        Scanner scan = new Scanner(System.in);

        String keepShopping = "y";
        do {

            System.out.println("What store would you like to visit?");
            Iterator<Store> stores = getStores();
            while (stores.hasNext()) {
                System.out.print(stores.next().getName()+"\n");
            }

            String storeName = scan.next();
            System.out.println("Entering "+storeName);
            Store theStore = enterStore(shopper, storeName);

            System.out.print("Continue shopping at this Mall (y/n)? ");
            keepShopping = scan.next();

        } while (keepShopping.equals("y"));
        _visitors.remove(shopper);
        shopper.leaveMall();

    }
}
