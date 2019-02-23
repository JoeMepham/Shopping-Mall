import java.util.ArrayList;

public class NatickCollection extends Mall {

    public NatickCollection() {
        this.addStore(new AppleStore(this));
        this.addStore(new NikeStore(this));
        this.addStore(new TacoBell(this));
    }
}
