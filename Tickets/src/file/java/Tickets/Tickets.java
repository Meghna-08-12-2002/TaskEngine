package file.java.Tickets;

public class Tickets {
    String src;
    String desc;
    double cost;
    Passenger[] seats;

    public Tickets(String src,String desc,double cost,Passenger[] seats) {
        this.src = src;
        this.desc = desc;
        this.cost = cost;
        this.seats = seats;
    }
        public void displayDetails(){
            System.out.println("src:"+src+"desc:"+desc+"cost:"+cost);

       for(Passenger passenger:seats){
           passenger.display();}
        }


}
