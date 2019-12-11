package Behavioral;

public class CarTravel extends TravelTemplate {
    @Override
    public void doPreparation() {
        System.out.println("Add gas in car, add luggage in trunk, check tire pressure.");
    }

    @Override
    public void doTravel() {
        System.out.println("Drive the car to destination.");
    }
}
