package file.java.Village;

public class VillageRunner {
    public static void main(String[] args) {
        Water water1 = new Water("Krishna", 67.87);
        Water water2 = new Water("Kaveri", 98.99);
        Village village = new Village("belur", "Shridevi", 12, new Water[]{water1, water2});
        village.displayDetails();
    }








}
