package com.xworkz.java.service;

import com.xworkz.java.dto.HandwashDto;
import com.xworkz.java.repository.HandwashRepo;
import com.xworkz.java.repository.HandwashRepoImpl;

import java.util.Optional;

public class HandwashServiceImpl implements HandwashService {

    @Override
    public boolean save(HandwashDto handwashDto) {
        boolean valid = true;

        if (handwashDto == null) {
            System.out.println("DTO is null");
            return false;
        }

        if (handwashDto.getDate() == null) {
            System.out.println("Invalid date");
            valid = false;
        }

        if (handwashDto.getCount() <= 0) {
            System.out.println("Invalid count");
            valid = false;
        }

        if (!handwashDto.isSoapUsed()) {
            System.out.println("Soap is not used");
            valid = false;
        }

        if (handwashDto.getLocation() == null) {
            System.out.println("Invalid location");
            valid = false;
        }

        if (handwashDto.getDuration() <= 0) {
            System.out.println("Invalid duration");
            valid = false;
        }

        if (handwashDto.getRemarks() == null) {
            System.out.println("Invalid remarks");
            valid = false;
        }

        if (valid) {
            System.out.println("Data is valid, saving to DB using repository...");
            HandwashRepo handwashRepo = new HandwashRepoImpl();
            return handwashRepo.persist(handwashDto);
        }

        return false;
    }

    @Override
    public Optional<HandwashDto> findById(int id) {
        System.out.println("Running findById in HandwashServiceImpl...");
        if (id > 0) {
            System.out.println("ID is valid: " + id);
            HandwashRepo handwashRepo = new HandwashRepoImpl();
            return handwashRepo.findById(id);
        }
        return Optional.empty();
    }
}
