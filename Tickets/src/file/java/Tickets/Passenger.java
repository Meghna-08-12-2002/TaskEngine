package file.java.Tickets;

public class Passenger {
    String name;
    int seat_no;
    public Passenger(String name,int seat_no){
        this.name=name;
        this.seat_no=seat_no;
    }
    public void display() {
        System.out.println("Passenger Name: " + name + ", Seat No: " + seat_no);
    }
}
