package file.java.Earbud;

public class EarbudRunner {
    public static void main(String[] args) {
        Earbud earbud = new Earbud();
        Audio audio = new Audio(earbud);
        audio.volumeUp();
    }
}

