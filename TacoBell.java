public class TacoBell extends Store {
    public TacoBell (Mall mall) {
        setMall(mall);
        setName("Taco-Bell");
        this.addProduct(new Taco(this));
        this.addProduct(new Soda(this));
        this.addProduct(new Burrito(this));
    }
}