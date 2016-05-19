package roads;

import vechicle.Car;
import vechicle.Moveable;
import vechicle.Truck;

import java.util.List;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Trace {
    List<Moveable> existsMoveables;
    int countLines;
    int speedLimit;

    public List<? extends Moveable> getExistsMoveables() {
        return existsMoveables;
    }

    public void setExistsMoveables(List<Moveable> existsMoveables) {
        this.existsMoveables = existsMoveables;
    }


    public Car findCarByName(String name){
        for (Moveable vechicle:existsMoveables) {
            if ((vechicle instanceof Car)){
                Car car=(Car)vechicle;
                if (car.getLabel().equals(name)){
                    return car;
                }
            }
        }
        return null;
    }

    public int carCounter(){
        int count=0;
        for (Moveable vechicle:existsMoveables) {
            if (vechicle instanceof Car){
                count++;
            }
        }
        return count;
    }

    public int truckCounter(){
        int count=0;
        for (Moveable vechicle:existsMoveables) {
            if (vechicle instanceof Truck){
                count++;
            }
        }
        return count;
    }

}
