public class Booker {
    private BookReservation bookReservation;

    public Booker(BookReservation bookReservation) {
        this.bookReservation = bookReservation;
    }

    public void push(String username, Reserve reserve) {
        reserve.setServices(new AssociatedServices().get(reserve.getRoom().getClass()));
        bookReservation.add(username, reserve);
    }
}
