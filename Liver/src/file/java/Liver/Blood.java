package file.java.Liver;

import java.util.Objects;

public class Blood {

    public Blood(Liver liver) {
        System.out.println("Running constructor in Blood");
        if (Objects.nonNull(liver)) {
            liver.detoxify();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void circulate() {
        System.out.println("Blood is circulating");
    }

}
