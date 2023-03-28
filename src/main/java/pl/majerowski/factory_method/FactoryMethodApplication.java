package pl.majerowski.factory_method;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.majerowski.factory_method.logistics.Logistics;
import pl.majerowski.factory_method.transport.Ship;
import pl.majerowski.factory_method.transport.Transport;
import pl.majerowski.factory_method.transport.Truck;

@SpringBootApplication
public class FactoryMethodApplication {

    public static void main(String[] args) {
        Transport truck = new Truck();
        truck.deliver();

        Transport ship = new Ship();
        ship.deliver();
    }

}
