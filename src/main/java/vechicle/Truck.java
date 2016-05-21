package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Truck extends Car {
    private int size;// length
    private String cargo;

    public Truck(int speed, int weight, String label, Manufacturer model, int length) {
        setMaxSpeed(speed);
        setMaxWeightForCargo(weight);
        setLabel(label);
        setManufacturer(model);
        setSize(length);
        setCargo("Empty");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
