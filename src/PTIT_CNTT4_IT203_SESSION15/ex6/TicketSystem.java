package PTIT_CNTT4_IT203_SESSION15.ex6;
import java.util.LinkedList;
import java.util.Queue;

public class TicketSystem {
    private Queue<Ticket> ticketQueue;
    private int currentNumber;

    public TicketSystem() {
        ticketQueue = new LinkedList<>();
        currentNumber = 0;
    }

    public Ticket issueTicket(String time) {
        currentNumber++;
        Ticket t = new Ticket(currentNumber, time);
        ticketQueue.add(t);
        return t;
    }

    public Ticket callNextTicket() {
        if (ticketQueue.isEmpty()) {
            return null;
        }
        return ticketQueue.poll();
    }
}