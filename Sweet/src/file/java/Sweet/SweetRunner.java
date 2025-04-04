package file.java.Sweet;

public class SweetRunner {
    public static void main(String[] args) {
        Sweet sweet = new Sweet();
        Chocolate chocolate = new Chocolate(sweet);
        chocolate.flavor();
    }
}
