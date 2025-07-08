package ServiceImpl;

import Dto.StampedeCaseDto;
import Service.StampedeCaseService;

public class StampedeCaseServiceImpl implements StampedeCaseService {
    public StampedeCaseServiceImpl() {

        System.out.println("StampedeCaseservice implementation constructor");
    }

    @Override
    public boolean save(StampedeCaseDto stampedeCaseDto) {
        System.out.println("StampedeCaseDto saved in StampedeCaseServiceImpl");
        if (stampedeCaseDto != null) {
            System.out.println("StampedeCaseDto is not null");
        } else {
            System.out.println("StampedeCaseDto is null");
            return false;
        }

        String event = stampedeCaseDto.getEvent();
        if (event != null && event.length() >= 3 && event.length() <= 20) {
            System.out.println("event is valid");
        } else {
            System.out.println("event is invalid");
            return false;
        }

        int deaths = stampedeCaseDto.getDeaths();
        if (deaths >= 0 && deaths <= 500) {
            System.out.println("deaths is valid");
        } else {
            System.out.println("deaths is invalid");
            return false;
        }

        int injuries = stampedeCaseDto.getInjuries();
        if (injuries >= 0 && injuries <= 500) {
            System.out.println("injuries is valid");
        } else {
            System.out.println("injuries is invalid");
            return false;
        }

        String location = stampedeCaseDto.getLocation();
        if (location != null && location.length() <= 500) {
            System.out.println("location is valid");
        } else {
            System.out.println("location is invalid");
            return false;
        }
        return true;
    }
}
