package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Car implements Moveable{
    private int id;// unique number
    private int maxSpeed;
    private int maxWeightForCargo;
    private String label; // some identifier
    private Manufacturer manufacturer; // who is creator


    public void move() {
        System.out.println("moved");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed>0){
            this.maxSpeed = maxSpeed;
        }else{
            throw new IllegalArgumentException();
        }
    }

    public int getMaxWeightForCargo() {
        return maxWeightForCargo;
    }

    public void setMaxWeightForCargo(int maxWeightForCargo) {
        if (maxWeightForCargo>0){
            this.maxWeightForCargo = maxWeightForCargo;
        }else {
            throw new IllegalArgumentException();
        }
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", maxWeightForCargo=" + maxWeightForCargo +
                ", label='" + label + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
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
        return manufacturer != null ? manufacturer.equals(car.manufacturer) : car.manufacturer == null;

    }

    @Override
    public int hashCode() {
        int result = maxSpeed;
        result = 31 * result + maxWeightForCargo;
        result = 31 * result + (label != null ? label.hashCode() : 0);
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {

        this.manufacturer = manufacturer;
    }


}
