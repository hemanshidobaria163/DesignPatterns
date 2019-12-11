package Structural;

public class Sparkles extends Topping {

    public Sparkles(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String withToppings() {

        return super.withToppings() + " with Sparkles ";
    }
}
