package chap1;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice){
        this.ticketOffice=ticketOffice;
    }
    public TicketOffice getTicketOffice(){
        return ticketOffice;
    }

    public void sellTicket(Audience audience){
        Ticket ticket = getTicket();
        Long amount = audience.buyTicket(ticket);
        ticketOffice.getAmount(audience);

    }
    private Ticket getTicket(){
        return ticketOffice.getTicket();
    }
}
