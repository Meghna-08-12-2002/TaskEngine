package file.java.Village;

public class Village {
    String name;
    String head;
    int houses;
    Water[] waters;

    public Village(String name, String head, int houses, Water[] waters) {
        this.name = name;
        this.head = head;
        this.houses = houses;
        this.waters = waters;
    }

    public void displayDetails() {
        System.out.println("Village Name: " + name + "Head: " + head + "No. of Houses: " + houses);
        for (Water w : waters) {
            w.display();
        }
    }
}