package com.piyushcodes.airBnb.repository;

import com.piyushcodes.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
