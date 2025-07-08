package com.xworkz.java.handwash.service;

import com.xworkz.java.handwash.dto.HandwashDto;
import com.xworkz.java.handwash.repository.HandwashRepository;
import com.xworkz.java.handwash.repository.HandwashRepositoryImpl;

import java.util.Optional;

public class HandwashServiceImpl implements HandwashService {

    private final HandwashRepository handwashRepository;

    public HandwashServiceImpl() {
        this.handwashRepository = new HandwashRepositoryImpl();
    }

    @Override
    public boolean save(HandwashDto handwashDto) {
        if (handwashDto == null) {
            System.out.println("DTO is null");
            return false;
        }

        System.out.println("Handwash dto is not null");

        String date = handwashDto.getDate();
        if (date == null || date.trim().isEmpty()) {
            System.out.println("Invalid date");
            return false;
        }

        int count = handwashDto.getCount();
        if (count < 0) {
            System.out.println("Invalid count");
            return false;
        }

        boolean soapUsed = handwashDto.isSoapUsed();
        if (!soapUsed) {
            System.out.println("Soap must be used");
            return false;
        }

        String location = handwashDto.getLocation();
        if (location == null || location.trim().isEmpty()) {
            System.out.println("Invalid location");
            return false;
        }

        int duration = handwashDto.getDuration();
        if (duration < 0) {
            System.out.println("Invalid duration");
            return false;
        }

        String remarks = handwashDto.getRemarks();
        if (remarks != null && remarks.trim().length() > 0 && remarks.trim().length() < 3) {
            System.out.println("Remarks too short");
            return false;
        }

        System.out.println("Validation Done. All fields are correct");
        return handwashRepository.persist(handwashDto);
    }

    @Override
    public Optional<HandwashDto> findById(int handwashId) {
        System.out.println("findById method in handwash service implementation");

        if (handwashId > 0) {
            System.out.println("HandwashId is valid");
            return handwashRepository.findById(handwashId); // ✅ return actual result
        }

        System.out.println("Invalid handwashId");
        return Optional.empty();
    }
}
