package vechicle;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public interface Moveable {

    default void move(){
        System.out.println("moved");
    }
}
