package com.piyushcodes.airBnb.service;

import com.piyushcodes.airBnb.dto.HotelDto;
import com.piyushcodes.airBnb.dto.HotelPriceDto;
import com.piyushcodes.airBnb.dto.HotelSearchRequest;
import com.piyushcodes.airBnb.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
