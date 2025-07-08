package com.xworkz.java.weather.service;

import com.xworkz.java.weather.dto.WeatherDto;

public class WeatherServiceImpl implements WeatherService {

    @Override
    public boolean save(WeatherDto weatherDto) {
        if (weatherDto != null) {

            String loc = weatherDto.getLocation();
            if (loc == null || loc.length() <= 3) {
                System.out.println("Invalid location entered");
                return false;
            } else {
                System.out.println("Valid location entered");
            }

            String weather = weatherDto.getWeather();
            if (weather == null || weather.isEmpty()) {
                System.out.println("Invalid weather entered");
                return false;
            } else {
                System.out.println("Valid weather entered");
            }

            int maxtemp = weatherDto.getMaxtemp();
            if (maxtemp > 150 || maxtemp < -50) {
                System.out.println("Invalid maximum temperature entered");
                return false;
            } else {
                System.out.println("Valid maximum temperature entered");
            }

            int mintemp = weatherDto.getMintemp();
            if (mintemp > 150 || mintemp < -50) {
                System.out.println("Invalid minimum temperature entered");
                return false;
            } else {
                System.out.println("Valid minimum temperature entered");
            }

            int humidity = weatherDto.getHumidity();
            if (humidity > 100 || humidity < 0) {
                System.out.println("Invalid humidity entered");
                return false;
            } else {
                System.out.println("Valid humidity entered");
            }

            int cloud = weatherDto.getCloud();
            if (cloud > 100 || cloud < 0) {
                System.out.println("Invalid cloud percentage entered");
                return false;
            } else {
                System.out.println("Valid cloud percentage entered");
            }

            String sunrise = weatherDto.getSunrise();
            if (sunrise == null || sunrise.isEmpty()) {
                System.out.println("Invalid sunrise time entered");
                return false;
            } else {
                System.out.println("Valid sunrise time entered");
            }

            String sunset = weatherDto.getSunset();
            if (sunset == null || sunset.isEmpty()) {
                System.out.println("Invalid sunset time entered");
                return false;
            } else {
                System.out.println("Valid sunset time entered");
            }

            String moonrise = weatherDto.getMoonrise();
            if (moonrise == null || moonrise.isEmpty()) {
                System.out.println("Invalid moonrise time entered");
                return false;
            } else {
                System.out.println("Valid moonrise time entered");
            }

            String moonset = weatherDto.getMoonset();
            if (moonset == null || moonset.isEmpty()) {
                System.out.println("Invalid moonset time entered");
                return false;
            } else {
                System.out.println("Valid moonset time entered");
            }

            String rainstart = weatherDto.getRainstart();
            if (rainstart == null || rainstart.isEmpty()) {
                System.out.println("Invalid rain start time entered");
                return false;
            } else {
                System.out.println("Valid rain start time entered");
            }

            String rainstop = weatherDto.getRainstop();
            if (rainstop == null || rainstop.isEmpty()) {
                System.out.println("Invalid rain stop time entered");
                return false;
            } else {
                System.out.println("Valid rain stop time entered");
            }

            int precipitation = weatherDto.getPrecipitation();
            if (precipitation < 0) {
                System.out.println("Invalid precipitation entered");
                return false;
            } else {
                System.out.println("Valid precipitation entered");
            }

            return true;
        }

        System.out.println("DTO is null");
        return false;
    }
}
