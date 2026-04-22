package com.piyushcodes.airBnb.service;

import com.piyushcodes.airBnb.dto.BookingDto;
import com.piyushcodes.airBnb.dto.BookingRequest;
import com.piyushcodes.airBnb.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
