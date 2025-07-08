package com.xworkz.java.repository;

import com.xworkz.java.dto.HandwashDto;
import java.util.Optional;

public interface HandwashRepo {
    boolean persist(HandwashDto handwashDto);

    default Optional<HandwashDto> findById(int id) {
        return Optional.empty();
    }
}
