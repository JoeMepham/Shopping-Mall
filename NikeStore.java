public class NikeStore extends Store {
    public NikeStore (Mall mall) {
        setMall(mall);
        setName("Nike");
        this.addProduct(new Hat(this));
        this.addProduct(new Jacket(this));
        this.addProduct(new Shoes(this));

    }
}
