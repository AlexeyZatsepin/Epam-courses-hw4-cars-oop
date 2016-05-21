package vechicle;

import java.util.ArrayList;
import java.util.List;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */

/**
 * Passenger car is car that can have passengers
 */
public class PassengerCar extends Car {
    private int passengersCount; //max count of passengers
    private List passengers;

    public PassengerCar(int speed, int weight, String label, Manufacturer model, int passengers) {
        setLabel(label);
        setMaxWeightForCargo(weight);
        setMaxSpeed(speed);
        setManufacturer(model);
        setPassengersCount(passengers);
        setPassengers(new ArrayList());
    }

    public int getPassengersCount() {
        return passengersCount;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public List getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList passengers) {
        if (passengers.size()<=passengersCount){
            this.passengers = passengers;
        }else{
            throw new IllegalArgumentException();
        }
    }
}
