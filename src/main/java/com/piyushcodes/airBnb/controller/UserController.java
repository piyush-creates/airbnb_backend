package com.piyushcodes.airBnb.controller;

import com.piyushcodes.airBnb.dto.BookingDto;
import com.piyushcodes.airBnb.dto.GuestDto;
import com.piyushcodes.airBnb.dto.ProfileUpdateRequestDto;
import com.piyushcodes.airBnb.dto.UserDto;
import com.piyushcodes.airBnb.service.BookingService;
import com.piyushcodes.airBnb.service.GuestService;
import com.piyushcodes.airBnb.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/users"})
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final BookingService bookingService;
    private final GuestService guestService;

    @PatchMapping({"/profile"})
    public ResponseEntity<Void> updateProfile(@RequestBody ProfileUpdateRequestDto profileUpdateRequestDto) {
        this.userService.updateProfile(profileUpdateRequestDto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping({"/myBookings"})
    public ResponseEntity<List<BookingDto>> getMyBookings() {
        return ResponseEntity.ok(bookingService.getMyBookings());
    }

    @GetMapping({"/profile"})
    public ResponseEntity<UserDto> getMyProfile() {
        return ResponseEntity.ok(userService.getMyProfile());
    }

    @GetMapping({"/guests"})
    public ResponseEntity<List<GuestDto>> getAllGuests() {
        return ResponseEntity.ok(guestService.getAllGuests());
    }

    @PostMapping({"/guests"})
    public ResponseEntity<GuestDto> addNewGuest(@RequestBody GuestDto guestDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(guestService.addNewGuest(guestDto));
    }

    @PutMapping({"guests/{guestId}"})
    public ResponseEntity<Void> updateGuest(@PathVariable Long guestId, @RequestBody GuestDto guestDto) {
        this.guestService.updateGuest(guestId, guestDto);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping({"guests/{guestId}"})
    public ResponseEntity<Void> deleteGuest(@PathVariable Long guestId) {
        this.guestService.deleteGuest(guestId);
        return ResponseEntity.noContent().build();
    }
}
