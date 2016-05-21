package roads;

import vechicle.Car;
import vechicle.Moveable;
import vechicle.Truck;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */

/**
 * Track is same trace that have 3 lines and speed limit
 */
public class Track extends Trace {

    /**
     *
     * @param speedLimit limit on this road
     */
    public Track(int speedLimit){
        countLines=3;
        this.speedLimit=speedLimit;
    }




}
