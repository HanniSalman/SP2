import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int fee = 0;
        for(Car car : fleet){
            fee += car.getRegistrationFee();
        }
        return fee;
    }

    @Override
    public String toString(){
        return "Fleet of " + fleet.size() + " cars";
    }
}
