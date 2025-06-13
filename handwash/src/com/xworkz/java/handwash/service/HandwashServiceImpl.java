package com.xworkz.java.handwash.service;

import com.xworkz.java.handwash.dto.HandwashDto;
import com.xworkz.java.handwash.repository.HandwashRepository;
import com.xworkz.java.handwash.repository.HandwashRepositoryImpl;

public class HandwashServiceImpl implements HandwashService{
    @Override
    public boolean save(HandwashDto handwashDto) {
        if (handwashDto == null) {
            System.out.println("DTO is null");
            return false;
        }

        String date = handwashDto.getDate();
        if (date == null || date.trim().isEmpty()) {
            System.out.println("Invalid date");
            return false;
        }
        System.out.println("valid date");
        int count = handwashDto.getCount();
        if (count < 0) {
            System.out.println("Invalid count");
            return false;
        }
        System.out.println("valid count");
        boolean soapUsed = handwashDto.isSoapUsed();
        if (!soapUsed) {
            System.out.println("Soap must be used");
            return false;
        }
        System.out.println("valid");
        String location = handwashDto.getLocation();
        if (location == null || location.trim().isEmpty()) {
            System.out.println("Invalid location");
            return false;
        }
        System.out.println("valid location");

        int duration = handwashDto.getDuration();
        if (duration < 0) {
            System.out.println("Invalid duration");
            return false;
        }
        System.out.println("valid duration");
        String remarks = handwashDto.getRemarks();
        if (remarks != null && remarks.trim().length() > 0 && remarks.trim().length() < 3) {
            System.out.println("Remarks too short");
            return false;

    }
        System.out.println("valid remarks");

        HandwashRepository handwashRepository=new HandwashRepositoryImpl();
        handwashRepository.parser(handwashDto);
        return true;
    }
}

