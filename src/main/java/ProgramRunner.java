
import roads.Trace;
import roads.Track;
import vechicle.*;

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
        vechicles.add(new Truck(100,1000,"XL-TRUCK",Manufacturer.Volvo,30));
        vechicles.add(new PassengerCar(300,400,"HS-QW",Manufacturer.Nissan,4));
        vechicles.add(new PassengerCar(400,300,"CX-RE", Manufacturer.Ford,4));
        vechicles.add(new PassengerCar(200,200,"CX-RE", Manufacturer.Volkswagen,6));
        vechicles.add(new Bicycle("red","iron"));
        vechicles.add(new Motocycle("blue","iron",Manufacturer.BMW,200,"GX"));
        vechicles.add(new Motocycle("blue","iron",Manufacturer.Yamaha,300,"CA 234-34 B"));
        trace.setExistsMoveables(vechicles);

        System.out.println(trace.findByManufacturer(Manufacturer.Ford).toString());
        System.out.printf("Trucks from cars: %d/%d%n", trace.truckCounter(), trace.carCounter());
        System.out.println("If YAMAHA CA 234-34 B ride here? It is "+ trace.findVehicleByAttrs("CA 234-34 B",Manufacturer.Yamaha));


    }
}
