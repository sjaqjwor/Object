package chap1;

public class Audience {
    private Bag bag;

    public Audience(Bag bag){
        this.bag = bag;
    }

    public Bag getBag(){
        return bag;
    }

    public long buyTicket(Ticket ticket){
        return bag.buyTicket(ticket);
    }
}
