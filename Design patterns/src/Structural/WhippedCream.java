package Structural;

public class WhippedCream extends Topping {

    public WhippedCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String withToppings() {

        return super.withToppings() + " with Whipped Cream ";
    }
}
