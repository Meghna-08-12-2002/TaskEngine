package file.java.Weather;

import java.util.Objects;

public class Climate {

    public Climate(Weather weather) {
        System.out.println("Running constructor in Climate");
        if (Objects.nonNull(weather)) {
            weather.forecast();
        } else {
            System.out.println("Null value detected");
        }
    }

    public void temperature() {
        System.out.println("Temperature is rising");
    }


}
