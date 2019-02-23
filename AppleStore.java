public class AppleStore extends Store {
    public AppleStore (Mall mall) {
        setMall(mall);
        setName("Apple");
        this.addProduct(new Iphone(this));
        this.addProduct(new Ipad(this));
        this.addProduct(new MacBook(this));
    }
}
