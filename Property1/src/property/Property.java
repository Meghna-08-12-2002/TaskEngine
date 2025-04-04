package property;

public class Property {
    String location;
    double price;
    String type;
    Owner[] owners;

    public Property(String location, String type, double price, Owner[] owners) {
        this.location = location;
        this.type = type;
        this.price = price;
        this.owners = owners;
    }

    public void displayDetails() {
        System.out.println("Location: " + location + ", Type: " + type + ", Price: " + price);
        for (Owner owner : owners) {
            owner.display();

        }
    }
}
