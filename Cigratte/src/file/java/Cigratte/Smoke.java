package file.java.Cigratte;

import java.util.Objects;

public class Smoke {
    public Smoke(Cigratte cigratte) {
        System.out.println("Running constructor in Smoke");
        if (Objects.nonNull(cigratte)) {
            cigratte.burn();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void spread() {
        System.out.println("Smoke is spreading");
    }

}
