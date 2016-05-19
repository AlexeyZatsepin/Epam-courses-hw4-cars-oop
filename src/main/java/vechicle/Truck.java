package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Truck extends Car {
    public Truck(int speed,int weight,String label, String model) {
        setMaxSpeed(speed);
        setMaxWeightForCargo(weight);
        setLabel(label);
        setModel(model);
    }
}
