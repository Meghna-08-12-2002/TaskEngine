package file.java.property;

public class Owner {
    String name;
    String contact;

    public Owner(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public void display() {
        System.out.println("Owner Name: " + name + ", Contact: " + contact);
    }
}

