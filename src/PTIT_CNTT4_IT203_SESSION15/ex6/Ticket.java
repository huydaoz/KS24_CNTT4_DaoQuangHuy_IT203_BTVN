package PTIT_CNTT4_IT203_SESSION15.ex6;
public class Ticket {
    private int ticketNumber;
    private String issuedTime;

    public Ticket(int ticketNumber, String issuedTime) {
        this.ticketNumber = ticketNumber;
        this.issuedTime = issuedTime;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
}