package file.java.Umbrella;

public class UmbrellaRunner {
    public static void main(String[] args) {
        Umbrella umbrella = new Umbrella ();
        Rain rain = new Rain(umbrella);
        rain.fall();
    }

}
