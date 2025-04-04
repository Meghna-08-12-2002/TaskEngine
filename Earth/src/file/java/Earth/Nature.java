package file.java.Earth;

import java.util.Objects;

public class Nature {
    public Nature(Earth earth) {
        System.out.println("Running constructor in Nature");
        if (Objects.nonNull(earth)) {
            earth.rotate();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void beauty() {
        System.out.println("Nature is beautiful");
    }
}
