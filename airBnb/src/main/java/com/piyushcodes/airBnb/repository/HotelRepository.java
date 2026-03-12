package com.piyushcodes.airBnb.repository;

import com.piyushcodes.airBnb.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
