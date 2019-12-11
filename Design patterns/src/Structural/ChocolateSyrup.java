package Structural;

public class ChocolateSyrup extends Topping {

    public ChocolateSyrup(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public String withToppings() {

        return super.withToppings() + " with Chocolate syrup ";
    }
}
