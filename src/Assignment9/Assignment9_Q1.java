package Assignment9;

import java.util.ArrayList;
import java.util.Scanner;

class Ticket {
    int ticketNo;
    String trainName;
    String passengerName;
    String source;
    String destination;

    public Ticket(int tNo, String tName, String pName, String source, String dest) {
        this.ticketNo = tNo;
        this.trainName = tName;
        this.passengerName = pName;
        this.source = source;
        this.destination = dest;
    }

}

class RailwayBooking {
    ArrayList<Ticket> tickets = new ArrayList<>();

    int ticketCount = 1;

    public int bookTicket() {

        Scanner inputHelper = new Scanner(System.in);

        System.out.println("Enter the train name");
        String trainName = inputHelper.nextLine();
        System.out.println("Enter the passenger name");
        String passengerName = inputHelper.nextLine();
        System.out.println("Enter the source");
        String source = inputHelper.nextLine();
        System.out.println("Enter the destination");
        String destination = inputHelper.nextLine();

        if (isTrainFull()) {
            System.out.println("No seats available");
            return -1;
        } else {
            Ticket ticket = new Ticket(ticketCount++, trainName, passengerName, source, destination);
            tickets.add(ticket);
            return ticket.ticketNo;
        }

    }

    private boolean isTrainFull() {
        if (ticketCount >= 100)
            return true;
        return false;
    }

    public boolean cancelTicket(int ticketNumber) {
        for (int i = 0; i < tickets.size(); i++) {
            if (tickets.get(i).ticketNo == ticketNumber) {
                tickets.remove(i);
                return true;
            }
        }
        return false;
    }

    public void displayTickets() {
        for (Ticket ticket : tickets)
            System.out.println("\nAssignment9.Ticket No: " + ticket.ticketNo + "\nTrain name: " + ticket.trainName + "\nPassenger name: " + ticket.passengerName
                    + "\nSource: " + ticket.source + "\nDestination: " + ticket.destination);
    }
}

class Assignment9_Q1 {

    public static void main(String[] args) {

        Scanner inputHelper = new Scanner(System.in);
        RailwayBooking railwayBooking = new RailwayBooking();

        int choice = 1;
        while (choice != 0) {
            System.out.println();
            System.out.println();
            System.out.println("MENU");
            System.out.println("1. Book ticket");
            System.out.println("2. Cancel ticket");
            System.out.println("3. Display all tickets");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = inputHelper.nextInt();

            switch (choice) {
                case 1: {
                    int ticketNumber = railwayBooking.bookTicket();
                    if (ticketNumber != -1)
                        System.out.println("Assignment9.Ticket booked with number: " + ticketNumber);
                }
                break;
                case 2: {
                    System.out.println("Enter ticket number to cancel ticket: ");
                    int ticketNumber = inputHelper.nextInt();
                    if (railwayBooking.cancelTicket(ticketNumber))
                        System.out.println("Assignment9.Ticket cancelled.");
                    else
                        System.out.println("Assignment9.Ticket cancellation failed.");
                }
                break;
                case 3:
                    railwayBooking.displayTickets();
                    break;
                case 4:
                    choice = 0;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

    }
}