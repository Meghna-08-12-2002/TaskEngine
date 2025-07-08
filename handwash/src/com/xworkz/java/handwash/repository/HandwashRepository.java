package com.xworkz.java.handwash.repository;

import com.xworkz.java.handwash.dto.HandwashDto;

import java.util.Optional;

public interface HandwashRepository {
    boolean persist(HandwashDto handwashDto);
    default Optional<HandwashDto> findById(int handwashId)
    {
        return Optional.empty();
    }
}

