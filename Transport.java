package FlightReservationSystem;

import java.util.ArrayList;

public class Transport {
    private String transportNumber;
    private String destination;
    private int capacity;
    private int bookedSeats;
    private double baseTicketPrice;
    private ArrayList<Customer> passengers;

    public Transport(String transportNumber, String destination, int capacity, double baseTicketPrice) {
        this.transportNumber = transportNumber;
        this.destination = destination;
        this.capacity = capacity;
        this.baseTicketPrice = baseTicketPrice;
        this.bookedSeats = 0;
        this.passengers = new ArrayList<>();
    }

    public String getTransportNumber() {
        return transportNumber;
    }

    public String getDestination() {
        return destination;
    }

    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }

    public double getBaseTicketPrice() {
        return baseTicketPrice;
    }

    public ArrayList<Customer> getPassengers() {
        return passengers;
    }

    public void addPassenger(Customer passenger) {
        if (bookedSeats < capacity) {
            passengers.add(passenger);
            bookedSeats++;
        } else {
            System.out.println("No available seats.");
        }
    }

    public void cancelSeat(String name) {
        for (Customer p : passengers) {
            if (p.getName().equalsIgnoreCase(name)) {
                passengers.remove(p);
                bookedSeats--;
                System.out.println("Booking canceled for " + name + ".");
                return;
            }
        }
        System.out.println("Passenger not found.");
    }
    public void displayInfo() {
        System.out.println("\nTransport: " + transportNumber + " | Destination: " + destination);
        System.out.println("Seats: " + bookedSeats + "/" + capacity + " | Base Price: $" + baseTicketPrice);
    }
}

