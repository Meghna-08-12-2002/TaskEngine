package file.java.Earth;

public class EarthRunner {
    public static void main(String[] args) {
        Earth earth = new Earth();
        Nature nature = new Nature(earth);
        nature.beauty();
    }
}
