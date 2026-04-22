package com.piyushcodes.airBnb.repository;

import com.piyushcodes.airBnb.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
