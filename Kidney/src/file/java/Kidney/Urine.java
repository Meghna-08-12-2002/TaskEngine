package file.java.Kidney;

import java.util.Objects;


public class Urine {


    public Urine(Kidney kidney) {
        System.out.println("Running constructor in Urine");
        if (Objects.nonNull(kidney)) {
            kidney.filter();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void pass() {
        System.out.println("Urine is passing out");
    }
}