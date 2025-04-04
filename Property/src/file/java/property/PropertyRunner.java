package file.java.property;

public class PropertyRunner {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Ravi", "9876543210");
        Owner owner2 = new Owner("Leela", "9123456789");
        Property property = new Property( "Chennai", "Flat", 4500000, new Owner[]{owner1, owner2 });
        property.displayDetails();
    }
}
