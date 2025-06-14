package com.xworkz.java.handwash.repository;

import com.xworkz.java.handwash.dto.HandwashDto;

public interface HandwashRepository {
    boolean persist(HandwashDto handwashDto);
}

