package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/20/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Motocycle extends Bicycle{
    private Manufacturer manufacturer; // who is creator
    private double engineVolume;
    private String label; // some identifier


    public Motocycle(String color, String material, Manufacturer manufacturer,double engineVolume,String label) {
        super(color, material);
        setManufacturer(manufacturer);
        setEngineVolume(engineVolume);
        setLabel(label);

    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume>0){
            this.engineVolume = engineVolume;}
        else{
            throw new IllegalArgumentException();
        }
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "manufacturer=" + manufacturer +
                ", engineVolume=" + engineVolume +
                ", label='" + label + '\'' +
                '}';
    }
}
