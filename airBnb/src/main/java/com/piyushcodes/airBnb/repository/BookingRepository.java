package com.piyushcodes.airBnb.repository;

import com.piyushcodes.airBnb.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
