package FlightReservationSystem;

public class FlightDetails { 
    private String flightNumber; 
    private String destination; 
    private String ticketType; 
 
    public FlightDetails(String flightNumber, String destination, String ticketType) { 
        this.flightNumber = flightNumber; 
        this.destination = destination; 
        this.ticketType = ticketType; 
    } 
 
    public String getFlightNumber() { 
        return flightNumber; 
    } 
 
    public String getDestination() { 
        return destination; 
    } 
 
    public String getTicketType() { 
        return ticketType; 
    } 
} 