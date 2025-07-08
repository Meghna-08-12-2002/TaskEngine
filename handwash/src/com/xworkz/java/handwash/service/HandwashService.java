package com.xworkz.java.handwash.service;

import com.xworkz.java.handwash.dto.HandwashDto;

import java.util.Optional;

public interface HandwashService {
     boolean save(HandwashDto handwashDto);
     default Optional<HandwashDto> findById(int handwashId){
          return Optional.empty();
     }
}
