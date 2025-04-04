package file.java.Umbrella;

import java.util.Objects;

public class Rain {
    public Rain(Umbrella umbrella) {
        System.out.println("Running constructor in Rain");
        if (Objects.nonNull(umbrella)) {
            umbrella.open();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void fall() {
        System.out.println("Rain is falling");
    }
}
