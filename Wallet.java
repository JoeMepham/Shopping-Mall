public class Wallet {
    private double _money;
    private Shopper _owner;

    public Wallet(double money) {
        _money = money;
    }

    public Wallet (double money, Shopper owner) {
        _money = money;
        _owner = owner;
    }

    public void setOwner (Shopper owner) {
        _owner = owner;
    }

    public double remaining () {
        return _money;
    }

    public void putIn (double amount) {
        _money = _money + amount;
    }

    public void takeOut (double amount) {
        _money = _money - amount;
    }
}
