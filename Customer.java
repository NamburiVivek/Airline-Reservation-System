package FlightReservationSystem;

public class Customer extends FlightDetails { 
    private String name; 
    private int age; 
    
 
    public Customer(String name, int age, String flightNumber, String destination, String 
ticketType) { 
        super(flightNumber, destination, ticketType); 
        this.name = name; 
        this.age = age; 
         
    } 
 
    public String getName() { 
        return name; 
    } 
 
    public void displayPassengerInfo() { 
        System.out.println("Passenger: " + name + " | Age: " + age  ); 
        System.out.println("Flight: " + getFlightNumber() + " | Destination: " + getDestination() 
+ " | Ticket Type: " + getTicketType()); 
    } 
}
