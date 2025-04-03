package file.java.gold;

import java.util.Objects;

public class Metal {

    public Metal(Gold gold) {
        System.out.println("Running constructor in Metal");
        if (Objects.nonNull(gold)) {
            gold.shine();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void melt() {
        System.out.println("Executing melt method in Metal");
    }
}
