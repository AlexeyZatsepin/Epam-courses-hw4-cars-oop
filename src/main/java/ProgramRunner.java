
import roads.Trace;
import roads.Track;
import vechicle.Bicycle;
import vechicle.Moveable;
import vechicle.PassengerCar;
import vechicle.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * Epam_homework_cars_OOP
 * Created 5/19/16, with IntelliJ IDEA
 *
 * @author Alex
 */
public class ProgramRunner {
    public static void main(String[] args) {
        Trace trace = new Track(300);
        List<Moveable> vechicles=new ArrayList<>();
        vechicles.add(new Truck(100,1000,"BMW","XL"));
        vechicles.add(new PassengerCar(300,400,"Ford","fordX"));
        vechicles.add(new PassengerCar(400,300,"Lambargini","new"));
        vechicles.add(new Bicycle("red"));
        trace.setExistsMoveables(vechicles);

        System.out.println(trace.findCarByName("Ford").toString());
        System.out.printf("Trucks: %d/%d%n", trace.truckCounter(), trace.carCounter());


    }
}
