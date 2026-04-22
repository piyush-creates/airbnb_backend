package com.piyushcodes.airBnb.service;

import com.piyushcodes.airBnb.dto.HotelDto;
import com.piyushcodes.airBnb.dto.HotelInfoDto;
import org.jspecify.annotations.Nullable;

public interface HotelService {
    HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
