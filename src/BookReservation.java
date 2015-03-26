import java.util.*;

public class BookReservation {
    private Map<String, Reserve> reservations;

    public BookReservation() {
        reservations = new HashMap<>();
    }

    public List<Reserve> getReservations() {
        return new ArrayList<>(reservations.values());
    }

    public Reserve get(String username) {
        return reservations.get(username);
    }

    public void add(String username, Reserve reserve) {
        reservations.put(username, reserve);
    }
}
