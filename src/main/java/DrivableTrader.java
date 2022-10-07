import java.util.ArrayList;
import java.util.List;

public class DrivableTrader extends Trader<Drivable>{
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist,
                  int money) {
        super(inventory, wishlist, money);
    }
    public DrivableTrader(int money) {
        super(money);
    }

    @Override
    public int getSellingPrice(Drivable object) {
        int super_price = super.getSellingPrice(object);
        if (super_price == Tradable.MISSING_PRICE) {
            return super_price;
        }
        return object.getMaxSpeed() + super_price;
    }
}