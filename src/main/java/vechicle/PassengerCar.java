package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class PassengerCar extends Car {
    private int passengers;
    public PassengerCar(int speed,int weight,String label, String model, int passengers) {
        setLabel(label);
        setMaxWeightForCargo(weight);
        setMaxSpeed(speed);
        setModel(model);
        setPassengers(passengers);
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
}
