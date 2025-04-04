package file.java.BlackAndWhite;

import java.util.Objects;

public class White {
    public White(Black black) {
        System.out.println("Running constructor in White");
        if (Objects.nonNull(black)) {
            black.darkShade();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void lightShade() {
        System.out.println("White is a light shade");
    }
}
