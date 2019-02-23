public class Purchase {
    private Store _store;
    private Item _item;

    public Purchase (Store store, Item item) {
        _store = store;
        _item = item;
    }

    public Store getStore() {
        return _store;
    }

    public Item getItem() {
        return _item;
    }
}
