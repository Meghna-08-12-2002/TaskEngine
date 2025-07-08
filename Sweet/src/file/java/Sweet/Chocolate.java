package file.java.Sweet;

import java.util.Objects;

public class Chocolate {

    public Chocolate(Sweet sweet) {
        System.out.println("Running constructor in Chocolate");
        if (Objects.nonNull(sweet)) {
            sweet.taste();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void flavor() {
        System.out.println("Chocolate flavor is rich");
    }
}
