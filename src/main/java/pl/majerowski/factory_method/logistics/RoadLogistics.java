package pl.majerowski.factory_method.logistics;

import pl.majerowski.factory_method.transport.Transport;
import pl.majerowski.factory_method.transport.Truck;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
