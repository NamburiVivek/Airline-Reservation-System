package FlightReservationSystem;

public class Flight extends Transport implements Reservable {
    private TicketType premiumEconomyTicket;
    private TicketType businessTicket;
    private TicketType economyTicket;
    public Flight(String flightNumber, String destination, int capacity, double economyPrice) {
        super(flightNumber, destination, capacity, economyPrice);
        this.economyTicket = new TicketType("Economy", economyPrice);
        this.businessTicket = new TicketType("Business", economyPrice * 1.5);
        this.premiumEconomyTicket = new TicketType("PremiumEconomy", economyPrice * 2.0);
    }
    public void bookSeat(String name, int age, String destination, String ticketType) {
        TicketType ticket = null;
        switch (ticketType.toLowerCase()) {
            case "premiumeconomy":
                ticket = premiumEconomyTicket;
                break;
            case "business":
                ticket = businessTicket;
                break;
            case "economy":
                ticket = economyTicket;
                break;
            default:
                System.out.println("Invalid ticket type. Booking failed.");
                return;
        }
        if (getAvailableSeats() > 0) {
            addPassenger(new Customer(name, age, getTransportNumber(), destination, ticketType));
            Payment payment = new Payment();
            boolean paymentStatus = payment.processPayment(ticket.getPrice());
            
            if (paymentStatus) {
                System.out.println("Booking successful! Ticket Type: " + ticket.getType() + " | Price: ₹" + ticket.getPrice());
            } else { 
                cancelSeat(name);
            }
        } else {
            System.out.println("No available seats.");
        }
    }
    public void displayFlightInfo() {
        super.displayInfo();

        System.out.println("Ticket Prices: ");
        premiumEconomyTicket.displayTicketInfo();
        businessTicket.displayTicketInfo();
        economyTicket.displayTicketInfo();
    }
    public void displayPassengerList() {
        System.out.println("Passengers for Flight " + getTransportNumber() + ":");
        for (Customer passenger : getPassengers()) {
            passenger.displayPassengerInfo();
        }
    }
    public void cancelSeat(String name) {
        super.cancelSeat(name);
    }
}