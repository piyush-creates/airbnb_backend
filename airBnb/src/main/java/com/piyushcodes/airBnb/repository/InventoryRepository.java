package com.piyushcodes.airBnb.repository;

import com.piyushcodes.airBnb.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}
