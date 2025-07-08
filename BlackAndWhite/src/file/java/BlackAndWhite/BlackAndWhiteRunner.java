package file.java.BlackAndWhite;

public class BlackAndWhiteRunner {
    public static void main(String[] args) {
        Black black = new Black();
        White white = new White(black);
        white.lightShade();
    }
}
