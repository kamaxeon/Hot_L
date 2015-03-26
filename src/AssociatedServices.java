import rooms.*;
import rooms.Double;
import services.EarlyCheckin;
import services.Laundry;
import services.Service;
import services.Wifi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AssociatedServices extends HashMap<Class<? extends Room>, List<Service>>{
    public AssociatedServices() {
        super();
        buildAssociatedServices();
    }

    private void buildAssociatedServices() {
        put(Single.class, new LinkedList<>());
        put(Double.class, new LinkedList<>());
        put(Suite.class, Arrays.asList(new Wifi(), new LateCheckout()));
        put(NuptialSuite.class, Arrays.asList(new Wifi(), new LateCheckout(), new Laundry(), new EarlyCheckin()));
    }

}
