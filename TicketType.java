package FlightReservationSystem;

public class TicketType {
    private String type;
    private double price;

    // Constructor to initialize the ticket type and price
    public TicketType(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void displayTicketInfo() {
        System.out.println("Ticket Type: " + type + " | Price: $" + price);
    }
}
