
import java.util.Scanner;

class Hackathon213 {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

   
    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    
    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    
    double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    
    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    
    void displayBill() {
        System.out.println("\n--- CINEMA TICKET BILL ---");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: %.2f%n", calculateTotal());
        System.out.printf("Discount: %.2f%n", calculateDiscount());
        System.out.printf("Final Amount: %.2f%n", calculateFinalAmount());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        if (price < 0 || tickets <= 0) {
            System.out.println("Invalid ticket price or number of tickets.");
        } else {
            MovieTicket ticket = new MovieTicket(name, price, tickets);
            ticket.displayBill();
        }

        sc.close();
    }
}