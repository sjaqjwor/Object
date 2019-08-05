package chap1;

public class Theater {

    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller){
        this.ticketSeller= ticketSeller;
    }
//
//    public void enter(Audience audience){
//        // 코드대로 설명하자면 Theater가 관람객의 가방에서 티켓이 있는지 확인을 한다.
//        if(audience.getBag().hasInvitation()){
//            //판매원이 판매점에서 티켓을 가져온다
//            Ticket ticket= ticketSeller.getTicketOffice().getTicket();
//            // Theater가 관람객의 가방에 티켓을 넣는다
//            audience.getBag().setTicket(ticket);
//        }else{
//            //판매원이 판매점에서 티켓을 가져온다
//            Ticket ticket = ticketSeller.getTicketOffice().getTicket();
//            // 극장이 관람객 가방에서 티켓 가격만큼 뺀다.
//            audience.getBag().minusAmount(ticket.getFee());
//            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
//            // 극장이 관람객 가방에 티켓을 넣는다.
//            audience.getBag().setTicket(ticket);
//        }
//    }
//

    public void enter(Audience audience){
        ticketSeller.sellTicket(audience);
    }
}
