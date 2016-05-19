package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class PassengerCar extends Car {
    public PassengerCar(int speed,int weight,String label, String model) {
        setLabel(label);
        setMaxWeightForCargo(weight);
        setMaxSpeed(speed);
        setModel(model);
    }

}
