package pl.majerowski.factory_method.logistics;

import pl.majerowski.factory_method.transport.Ship;
import pl.majerowski.factory_method.transport.Transport;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
