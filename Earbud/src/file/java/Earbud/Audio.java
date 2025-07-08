package file.java.Earbud;

import java.util.Objects;

public class Audio {
    public Audio(Earbud earbud) {
        System.out.println("Running constructor in Audio");
        if (Objects.nonNull(earbud)) {
            earbud.playSound();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void volumeUp() {
        System.out.println("Volume is increased");
    }
}
