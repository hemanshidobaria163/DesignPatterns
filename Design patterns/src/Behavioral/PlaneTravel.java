package Behavioral;

public class PlaneTravel extends TravelTemplate {
    @Override
    public void doPreparation() {
        System.out.println("Book plane tickets, check in luggage, go to the airport, board plane");
    }

    @Override
    public void doTravel() {
        System.out.println("Fly in the plane to the destination.");
    }
}
