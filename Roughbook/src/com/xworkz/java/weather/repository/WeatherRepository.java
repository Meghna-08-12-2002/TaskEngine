package com.xworkz.java.weather.repository;

import com.xworkz.java.weather.dto.WeatherDto;

public interface WeatherRepository {
    public abstract boolean parser(WeatherDto weatherDto);
}