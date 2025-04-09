package FlightReservationSystem;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import FlightManager.FlightManager;

public class AirlineReservationSystem {
    private static FlightManager flightManager = new FlightManager();
    private static Scanner scanner = new Scanner(System.in);
    private static List<User> users = new ArrayList<>();
    private static User loggedInUser = null;

    public static void main(String[] args) {
        System.out.println("Welcome to Airline Reservation System!");
        welcomeScreen();
        while (true) {
            System.out.println("1.Customer Register\n2.Customer Login\n3.Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                	System.out.println("create a account for login");
                	welcomeS();
                    registerUser();
                    break;
                case 2:
                	welcomeSc();
                    if (loginUser()) {
                    	
                        userMenu();
                    }
                    break;
                case 3:
                    System.out.println(" ░░░░░░░░░ Thanks for using the Bharath Airlines ░░░░░░░░░");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void userMenu() {
        boolean running = true;
        while (running) {
            try {
                System.out.println("1. View Flights");
                System.out.println("2. Search Flight by Destination");
                System.out.println("3. Book Flight");
                System.out.println("4. Cancel Booking");
                System.out.println("5. Display Bookings");
                System.out.println("6. Logout");
                
                System.out.print("Choose an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1: welcome();flightManager.displayFlights(); break;
                    case 2: searchFlight(); break;
                    case 3: welcomeScre();bookFlight(); break;
                    case 4: welcomeScr();cancelBooking(); break;
                    case 5: displayBookings(); break;
                    case 6:welcomeScree();
                        System.out.println("Logging out...succesfully............!!!!!!!!!!!");
                        loggedInUser = null;
                        running = false;
                        break;
                    
                    default:
                        System.out.println("Invalid choice! Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); 
            }
        }
    }
public static void welcomeScreen() {
    String artWork;
        artWork = """

                888       888          888                                                888                   888888b.   888                               888      888                       d8888 d8b         888 d8b                           \s
                888   o   888          888                                                888                   888  "88b  888                               888      888                      d88888 Y8P         888 Y8P                           \s
                888  d8b  888          888                                                888                   888  .88P  888                               888      888                     d88P888             888                               \s
                888 d888b 888  .d88b.  888  .d8888b  .d88b.  88888b.d88b.   .d88b.        888888  .d88b.        8888888K.  88888b.   8888b.  888d888 8888b.  888888   88888b.                d88P 888 888 888d888 888 888 88888b.   .d88b.  .d8888b \s
                888d88888b888 d8P  Y8b 888 d88P"    d88""88b 888 "888 "88b d8P  Y8b       888    d88""88b       888  "Y88b 888 "88b     "88b 888P"      "88b 888      888 "88b              d88P  888 888 888P"   888 888 888 "88b d8P  Y8b 88K     \s
                88888P Y88888 88888888 888 888      888  888 888  888  888 88888888       888    888  888       888    888 888  888 .d888888 888    .d888888 888      888  888             d88P   888 888 888     888 888 888  888 88888888 "Y8888b.\s
                8888P   Y8888 Y8b.     888 Y88b.    Y88..88P 888  888  888 Y8b.           Y88b.  Y88..88P       888   d88P 888  888 888  888 888    888  888 Y88b.    888  888            d8888888888 888 888     888 888 888  888 Y8b.          X88\s
                888P     Y888  "Y8888  888  "Y8888P  "Y88P"  888  888  888  "Y8888         "Y888  "Y88P"        8888888P"  888  888 "Y888888 888    "Y888888  "Y888   888  888          d88P      888 888 888     888 888 888  888  "Y8888   88888P'\s
                                                                                                                                                                                                                     \s
                                                                                                                                                                                                                     \s
                                                                                                                                                                                                                     \s
                """;
   
    System.out.println(artWork);
}
public static void welcomeSc() {
    String artWork;

    	
    artWork = """

            .o88b. db    db .d8888. d888888b  .d88b.  .88b  d88. d88888b d8888b.      db       .d88b.   d888b  d888888b d8b   db\s
           d8P  Y8 88    88 88'  YP `~~88~~' .8P  Y8. 88'YbdP`88 88'     88  `8D      88      .8P  Y8. 88' Y8b   `88'   888o  88\s
           8P      88    88 `8bo.      88    88    88 88  88  88 88ooooo 88oobY'      88      88    88 88         88    88V8o 88\s
           8b      88    88   `Y8b.    88    88    88 88  88  88 88~~~~~ 88`8b        88      88    88 88  ooo    88    88 V8o88\s
           Y8b  d8 88b  d88 db   8D    88    `8b  d8' 88  88  88 88.     88 `88.      88booo. `8b  d8' 88. ~8~   .88.   88  V888\s
            `Y88P' ~Y8888P' `8888Y'    YP     `Y88P'  YP  YP  YP Y88888P 88   YD      Y88888P  `Y88P'   Y888P  Y888888P VP   V8P\s
                                                                                                                                \s
                                                                                                                                \s
           """;
   
    System.out.println(artWork);
}
public static void welcomeS() {
    String artWork;

    	
    artWork = """

            .o88b. db    db .d8888. d888888b  .d88b.  .88b  d88. d88888b d8888b.      .d8888. d888888b  d888b  d8b   db db    db d8888b.\s
           d8P  Y8 88    88 88'  YP `~~88~~' .8P  Y8. 88'YbdP`88 88'     88  `8D      88'  YP   `88'   88' Y8b 888o  88 88    88 88  `8D\s
           8P      88    88 `8bo.      88    88    88 88  88  88 88ooooo 88oobY'      `8bo.      88    88      88V8o 88 88    88 88oodD'\s
           8b      88    88   `Y8b.    88    88    88 88  88  88 88~~~~~ 88`8b          `Y8b.    88    88  ooo 88 V8o88 88    88 88~~~  \s
           Y8b  d8 88b  d88 db   8D    88    `8b  d8' 88  88  88 88.     88 `88.      db   8D   .88.   88. ~8~ 88  V888 88b  d88 88     \s
            `Y88P' ~Y8888P' `8888Y'    YP     `Y88P'  YP  YP  YP Y88888P 88   YD      `8888Y' Y888888P  Y888P  VP   V8P ~Y8888P' 88     \s
                                                                                                                                        \s
                                                                                                                                        \s
           """;
   
    System.out.println(artWork);
}
public static void welcome() {
    String artWork;

    	
    artWork = """
            
            d88888b db      d888888b  d888b  db   db d888888b       d888888b d8b   db d88888b  .d88b.              \s
            88'     88        `88'   88' Y8b 88   88 `~~88~~'         `88'   888o  88 88'     .8P  Y8.             \s
            88ooo   88         88    88      88ooo88    88             88    88V8o 88 88ooo   88    88             \s
            88~~~   88         88    88  ooo 88~~~88    88             88    88 V8o88 88~~~   88    88             \s
            88      88booo.   .88.   88. ~8~ 88   88    88            .88.   88  V888 88      `8b  d8'             \s
            88      Y88888P Y888888P  Y888P  YP   YP    YP          Y888888P VP   V8P YP       `Y88P'              \s
                                                                                                    \s
                                                                                                    \s
            """;
   
    System.out.println(artWork);
}
public static void welcomeScre() {
    String artWork;

    	
    artWork = """
            
            d8888b.  .d88b.   .d88b.  db   dD      d88888b db      d888888b  d888b  db   db d888888b\s
            88  `8D .8P  Y8. .8P  Y8. 88 ,8P'      88'     88        `88'   88' Y8b 88   88 `~~88~~'\s
            88oooY' 88    88 88    88 88,8P        88ooo   88         88    88      88ooo88    88   \s
            88~~~b. 88    88 88    88 88`8b        88~~~   88         88    88  ooo 88~~~88    88   \s
            88   8D `8b  d8' `8b  d8' 88 `88.      88      88booo.   .88.   88. ~8~ 88   88    88   \s
            Y8888P'  `Y88P'   `Y88P'  YP   YD      YP      Y88888P Y888888P  Y888P  YP   YP    YP   \s
                                                                                                    \s
                                                                                                    \s
            """;
   
    System.out.println(artWork);
}
public static void welcomeScr() {
    String artWork;

    	
    artWork = """
            
            .o88b.  .d8b.  d8b   db  .o88b. d88888b db           d88888b db      d888888b  d888b  db   db d888888b\s
           d8P  Y8 d8' `8b 888o  88 d8P  Y8 88'     88           88'     88        `88'   88' Y8b 88   88 `~~88~~'\s
           8P      88ooo88 88V8o 88 8P      88ooooo 88           88ooo   88         88    88      88ooo88    88   \s
           8b      88~~~88 88 V8o88 8b      88~~~~~ 88           88~~~   88         88    88  ooo 88~~~88    88   \s
           Y8b  d8 88   88 88  V888 Y8b  d8 88.     88booo.      88      88booo.   .88.   88. ~8~ 88   88    88   \s
            `Y88P' YP   YP VP   V8P  `Y88P' Y88888P Y88888P      YP      Y88888P Y888888P  Y888P  YP   YP    YP   \s
                                                                                                                  \s
                                                                                                                  \s
           """;
   
    System.out.println(artWork);
}

public static void welcomeScree() {
    String artWork;

    
    artWork = """

            db       .d88b.   d888b   d888b  d88888b d8888b.       .d88b.  db    db d888888b\s
            88      .8P  Y8. 88' Y8b 88' Y8b 88'     88  `8D      .8P  Y8. 88    88 `~~88~~'\s
            88      88    88 88      88      88ooooo 88   88      88    88 88    88    88   \s
            88      88    88 88  ooo 88  ooo 88~~~~~ 88   88      88    88 88    88    88   \s
            88booo. `8b  d8' 88. ~8~ 88. ~8~ 88.     88  .8D      `8b  d8' 88b  d88    88   \s
            Y88888P  `Y88P'   Y888P   Y888P  Y88888P Y8888D'       `Y88P'  ~Y8888P'    YP   \s
                                                                                            \s
                                                                                            \s
            """;
   
    System.out.println(artWork);
}
private static void registerUser() {
    try {
        String username = "";
        String password = "";

        
        while (username.trim().isEmpty()) {
            System.out.print("Enter username: ");
            username = scanner.nextLine();
            if (username.trim().isEmpty()) {
                System.out.println("Please fill the username.");
            }
        }

        
        while (password.trim().isEmpty()) {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
            if (password.trim().isEmpty()) {
                System.out.println("Please fill the password.");
            }
        }

        users.add(new User(username, password));
        System.out.println("Registration successful! You can now log in.");

    } catch (Exception e) {
        System.out.println("Error during registration: " + e.getMessage());
        e.printStackTrace();
    }
}

private static boolean loginUser() {
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();
    
    for (User user : users) {
        if (user.getUsername().equals(username) && user.checkPassword(password)) {
            loggedInUser = user;
            System.out.println("Login successful! please don't forget the password ");
            return true;
        }
    }
    System.out.println("Invalid credentials. Try again.");
    return false;
}
    private static void bookFlight() {
        try {
            System.out.print("Enter flight number: ");
            String flightNumber = scanner.nextLine();
            Flight flight = flightManager.findFlight(flightNumber);

            if (flight != null) {
                String name;
                do {
                    System.out.print("Enter your name: ");
                    name = scanner.nextLine();
                    if (name.trim().isEmpty()) {
                        System.out.println("Name cannot be empty. Please enter your name.");
                    }
                } while (name.trim().isEmpty());

                int age;
                while (true) {
                    try {
                        System.out.print("Enter your age: ");
                        age = scanner.nextInt();
                        scanner.nextLine();
                        if (age <= 0) {
                            System.out.println("Age must be a positive number.");
                            continue;
                        }
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input! Please enter a valid age.");
                        scanner.nextLine();
                    }
                }

                System.out.print("Enter ticket type (PremiumEconomy, Business, Economy): ");
                String ticketType = scanner.nextLine();
                
                flight.bookSeat(name, age, flight.getDestination(), ticketType);
            } else {
                System.out.println("Flight not found!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid details.");
            scanner.nextLine();
        }
    }

    private static void cancelBooking() {
        try {
            System.out.print("Enter flight number: ");
            String flightNumber = scanner.nextLine();
            Flight flight = flightManager.findFlight(flightNumber);

            if (flight != null) {
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();
                flight.cancelSeat(name);
            } else {
                System.out.println("Flight not found!");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while canceling booking.");
        }
    }

    private static void searchFlight() {
        try {
            System.out.print("Enter destination: ");
            String destination = scanner.nextLine();
            boolean found = false;

            for (Flight flight : flightManager.getFlights()) {
                if (flight.getDestination().equalsIgnoreCase(destination)) {
                    flight.displayFlightInfo();
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No flights available to this destination.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while searching for flights.");
        }
    }

    private static void displayBookings() {
        try {
            System.out.print("Enter flight number to view bookings: ");
            String flightNumber = scanner.nextLine();
            Flight flight = flightManager.findFlight(flightNumber);

            if (flight != null) {
                flight.displayPassengerList();
            } else {
                System.out.println("Flight not found! Please enter a valid flight number.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while displaying bookings.");
        }
    }
}

