package com.xworkz.java.repository;

import com.xworkz.java.dto.ApplicationDto;

import java.util.List;

public interface ApplicationRepository {
    List<ApplicationDto> findAll();
}
