package FlightManager;

import FlightReservationSystem.Flight; 
import java.util.ArrayList; 
 
public class FlightManager { 
    private ArrayList<Flight> flights; 
 
    public FlightManager() { 
        flights = new ArrayList<>(); 
        flights.add(new Flight("6E-339", "Mumbai", 100, 8500.00)); 
        flights.add(new Flight("6E-5856", "Hyderabad", 150, 4250.00)); 
        flights.add(new Flight("6E-5855", "Prayoraj", 120, 10240.00)); 
        flights.add(new Flight("6E-848", "NewDelhi", 130, 8955.00)); 
        flights.add(new Flight("6E-475", "Nasik", 110, 14986.00)); 
        flights.add(new Flight("6E-2409", "Jammu", 140, 36954.00)); 
        flights.add(new Flight("6E-6301", "Kanpur", 125, 22308.00)); 
        flights.add(new Flight("6E-6809", "Vijayawada", 135, 14306.00)); 
        flights.add(new Flight("6E-2201", "Chennai", 115, 7210.00)); 
        flights.add(new Flight("6E-5888", "Ajmer", 105, 9845.00)); 
    } 
 
    public void displayFlights() { 
        for (Flight flight : flights) { 
            flight.displayFlightInfo(); 
        } 
    } 
 
    public Flight findFlight(String flightNumber) { 
        for (Flight flight : flights) { 
            if (flight.getTransportNumber().equalsIgnoreCase(flightNumber)) { 
                return flight; 
            } 
        } 
        return null; 
    } 
 
    public ArrayList<Flight> getFlights() { 
        return flights; 
    } 
 
} 