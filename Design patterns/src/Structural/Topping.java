package Structural;

public abstract class Topping implements IceCream {
    private IceCream iceCream;

    public Topping(IceCream iceCream) {

        this.iceCream = iceCream;
    }

    @Override
    public String withToppings() {

        return iceCream.withToppings();
    }
}
