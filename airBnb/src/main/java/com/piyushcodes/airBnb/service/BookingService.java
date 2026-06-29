package com.piyushcodes.airBnb.service;

import com.piyushcodes.airBnb.dto.BookingDto;
import com.piyushcodes.airBnb.dto.BookingRequest;
import com.piyushcodes.airBnb.dto.GuestDto;
import com.piyushcodes.airBnb.dto.HotelReportDto;
import com.stripe.exception.StripeException;
import com.stripe.model.Event;
import org.jspecify.annotations.Nullable;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);

    String initiatePayments(Long bookingId) throws StripeException;

    void capturePayment(Event event);

    void cancelBooking(Long bookingId);

    String getBookingStatus(Long bookingId);

    List<BookingDto> getAllBookingsByHotelId(Long hotelId);

    HotelReportDto getHotelReport(Long hotelId, LocalDate startDate, LocalDate endDate);

    List<BookingDto> getMyBookings();
}
