package roads;

import vechicle.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public abstract class Trace {

    List<Moveable> existsMoveables;// list of exists vechicles on road
    int countLines; //lines on road
    int speedLimit; // speed limit on road

    public List<? extends Moveable> getExistsMoveables() {
        return existsMoveables;
    }

    public void setExistsMoveables(List<Moveable> existsMoveables) {
        this.existsMoveables = existsMoveables;
    }

    /**
     *
     * @param manufacturer title
     * @return moveables made by this ,manufacturer
     */
    public List<Moveable> findByManufacturer(Manufacturer manufacturer){
        List<Moveable> list=new ArrayList<>();
        for(Moveable vehicle:existsMoveables){
            if(vehicle instanceof Car){
                if (((Car) vehicle).getManufacturer()==manufacturer){
                    list.add(vehicle);
                }
            }else if (vehicle instanceof Motocycle){
                list.add(vehicle);
            }
        }
        return list;
    }

    /**
     *
     * @param label of vechicle
     * @param manufacturer title
     * @return true if this vehicle founded
     */
    public boolean findVehicleByAttrs(String label,Manufacturer manufacturer){
        for(Moveable vehicle:existsMoveables){
                    if(vehicle instanceof Car){
                        Car car = (Car)vehicle;
                        return car.getManufacturer().equals(manufacturer)&&car.getLabel().equals(label);
                    }else if(vehicle instanceof Motocycle){
                        Motocycle motocycle=(Motocycle) vehicle;
                        return motocycle.getManufacturer().equals(manufacturer)&&motocycle.getLabel().equals(label);
                    }
        }
        return false;
    }

    /**
     *
     * @return cars count at this moment on this road
     */
    public int carCounter(){
        int count=0;
        for (Moveable vechicle:existsMoveables) {
            if (vechicle instanceof Car){
                count++;
            }
        }
        return count;
    }

    /**
     *
     * @return truck count at this moment on this road
     */
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
