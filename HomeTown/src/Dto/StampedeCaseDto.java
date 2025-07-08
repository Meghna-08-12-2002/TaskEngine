package Dto;

public class StampedeCaseDto {
    public StampedeCaseDto() {
        System.out.println("StampedeCaseDto running in Dto");
    }

    private String event;
    private int deaths;
    private int injuries;
    private String location;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getInjuries() {
        return injuries;
    }

    public void setInjuries(int injuries) {
        this.injuries = injuries;
    }

    @Override
    public String toString() {
        return "StampedeCaseDto{" +
                "event='" + event + '\'' +
                ", deaths=" + deaths +
                ", injuries=" + injuries +
                ", location='" + location + '\'' +
                '}';
    }
}
