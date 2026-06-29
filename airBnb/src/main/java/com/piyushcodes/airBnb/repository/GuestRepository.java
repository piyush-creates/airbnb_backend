package com.piyushcodes.airBnb.repository;

import com.piyushcodes.airBnb.entity.Guest;
import com.piyushcodes.airBnb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GuestRepository extends JpaRepository<Guest, Long> {
    List<Guest> findByUser(User user);
}
