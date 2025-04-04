package file.java.Kidney;

public class KidneyRunner {
    public static void main(String[] args) {
        Kidney kidney = new Kidney();
        Urine urine = new Urine(kidney);
        urine.pass();
    }

}
