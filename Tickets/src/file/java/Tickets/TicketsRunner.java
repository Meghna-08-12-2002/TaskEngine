package file.java.Tickets;

public class TicketsRunner {
    public static void main(String[] args) {
        Passenger passenger1=new Passenger("Amar",90);
        Passenger passenger2=new Passenger("aira",61);
        Tickets tickets=new Tickets("BNG","BGK",980,new Passenger[]{passenger1,passenger2});
        tickets.displayDetails();
    }



}
