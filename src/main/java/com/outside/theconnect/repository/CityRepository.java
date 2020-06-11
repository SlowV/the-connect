package com.outside.theconnect.repository;

import com.outside.theconnect.domain.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<Province, Long> {
}
