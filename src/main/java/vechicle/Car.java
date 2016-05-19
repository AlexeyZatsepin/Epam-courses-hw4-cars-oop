package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Car implements Moveable{
    private int maxSpeed;
    private int maxWeightForCargo;
    private String label;
    private String model;


    public void move() {
        System.out.println("moved");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxWeightForCargo() {
        return maxWeightForCargo;
    }

    public void setMaxWeightForCargo(int maxWeightForCargo) {
        this.maxWeightForCargo = maxWeightForCargo;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeightForCargo=" + maxWeightForCargo +
                ", label='" + label + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (maxSpeed != car.maxSpeed) return false;
        if (maxWeightForCargo != car.maxWeightForCargo) return false;
        if (label != null ? !label.equals(car.label) : car.label != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;

    }

    @Override
    public int hashCode() {
        int result = maxSpeed;
        result = 31 * result + maxWeightForCargo;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        return result;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
