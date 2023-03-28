package pl.majerowski.factory_method.logistics;

import pl.majerowski.factory_method.transport.Transport;

public abstract class Logistics {

    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
    }
}
