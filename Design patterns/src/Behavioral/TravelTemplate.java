package Behavioral;

public abstract class TravelTemplate {
    public void startTravel(){
        doPreparation();
        doTravel();
    }

    public abstract void doPreparation();
    public abstract void doTravel();
}
