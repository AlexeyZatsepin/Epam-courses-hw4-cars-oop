package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Truck extends Car {
    private int size;

    public Truck(int speed,int weight,String label, String model,int size) {
        setMaxSpeed(speed);
        setMaxWeightForCargo(weight);
        setLabel(label);
        setModel(model);
        setSize(size);
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
