package Structural;

public class Caramel extends Topping {

    public Caramel(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String withToppings() {

        return super.withToppings() + " with Caramel ";
    }
}
