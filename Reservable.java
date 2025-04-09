package FlightReservationSystem;

interface Reservable {
    void bookSeat(String name, int age, String destination, String ticketType);
    void cancelSeat(String name);
    void displayFlightInfo();
}
