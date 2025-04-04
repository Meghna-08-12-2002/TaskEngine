package file.java.Village;

public class Water {
    String source;
    double capacity;

    public Water(String source, double capacity) {
        this.source = source;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Water Source: " + source + ", Capacity: " + capacity);
    }
}
