package file.java.Cigratte;

public class CigratteRunner {
    public static void main(String[] args) {
        Cigratte cigratte = new Cigratte();
        Smoke smoke = new Smoke(cigratte);
        smoke.spread();
    }
}
