package com.spring.location.respos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.location.entity.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
