package Structural;

public class DecoratorPattern {

    public static void main(String args[]){
        IceCream iceCream = new ChocolateSyrup(new Sparkles(new WhippedCream(new IceCreamImpl())));
        System.out.println(iceCream.withToppings()+".");
    }
}
