package file.java.Liver;

public class LiverRunner {
    public static void main(String[] args) {
        Liver liver = new Liver();
        Blood blood = new Blood(liver);

        blood.circulate();
    }
}
