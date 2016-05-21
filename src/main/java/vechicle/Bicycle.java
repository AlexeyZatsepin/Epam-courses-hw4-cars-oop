package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Bicycle implements Moveable{
    private String color;
    private String material;

    public Bicycle(String color,String material) {
        setColor(color);
        setMaterial(material);
    }

    @Override
    public void move() {
        System.out.println("move by bicycle");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
