package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class Bicycle implements Moveable{
    private String color;

    public Bicycle(String red) {
        setColor(red);
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


}
