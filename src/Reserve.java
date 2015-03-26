import rooms.Room;
import services.Service;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Reserve {

    private Room room;
    private List<Service> services;

    public Reserve(Room room, Service ... services) {
        this.services = (services.length == 0) ? new LinkedList<>() : Arrays.asList(services);
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services.addAll(services);
    }
}
