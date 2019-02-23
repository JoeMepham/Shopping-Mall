import java.util.ArrayList;

public abstract class Item {
    private Double _price;
    private String _name;
    private ArrayList<Store> _soldInStores = new ArrayList<Store>();

    public void addToStore (String name, Double price, Store store) {
        setName(name);
        setPrice(price);
        soldIn(store);
    }
    public void setName(String name) {
        _name = name;
    }
    public String getName() {
        return _name;
    }
    public void setPrice(Double price) {
        _price = price;
    }
    public Double getPrice() {
        return _price;
    }
    public void soldIn(Store store) {
        _soldInStores.add(store);
    }
}
