package com.xworkz.java.service;

import com.xworkz.java.dto.HandwashDto;
import java.util.Optional;

public interface HandwashService {

    boolean save(HandwashDto handwashDto);

    default Optional<HandwashDto> findById(int id) {
        return Optional.empty();
    }
}
