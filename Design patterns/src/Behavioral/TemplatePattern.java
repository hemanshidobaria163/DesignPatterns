package Behavioral;

public class TemplatePattern {

    public static void main(String args[]){
        TravelTemplate travel1 = new CarTravel();
        TravelTemplate travel2 = new PlaneTravel();
        System.out.println("Travelling by Car");
        travel1.startTravel();
        System.out.println("-----------------");
        System.out.println("Travelling by Plane");
        travel2.startTravel();
    }
}
