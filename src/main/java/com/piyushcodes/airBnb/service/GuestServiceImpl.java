package com.piyushcodes.airBnb.service;

import com.piyushcodes.airBnb.dto.GuestDto;
import com.piyushcodes.airBnb.entity.Guest;
import com.piyushcodes.airBnb.entity.User;
import com.piyushcodes.airBnb.repository.GuestRepository;
import com.piyushcodes.airBnb.util.AppUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService{

    private final GuestRepository guestRepository;
    private final ModelMapper modelMapper;

    public List<GuestDto> getAllGuests() {
        User user = AppUtils.getCurrentUser();
        log.info("Fetching all guests of user with id: {}", user.getId());
        List<Guest> guests = this.guestRepository.findByUser(user);
        return (List)guests.stream().map((guest) -> (GuestDto)this.modelMapper.map(guest, GuestDto.class)).collect(Collectors.toList());
    }

    public GuestDto addNewGuest(GuestDto guestDto) {
        log.info("Adding new guest: {}", guestDto);
        User user = AppUtils.getCurrentUser();
        Guest guest = (Guest)this.modelMapper.map(guestDto, Guest.class);
        guest.setUser(user);
        Guest savedGuest = (Guest)this.guestRepository.save(guest);
        log.info("Guest added with ID: {}", savedGuest.getId());
        return (GuestDto)this.modelMapper.map(savedGuest, GuestDto.class);
    }

    public void updateGuest(Long guestId, GuestDto guestDto) {
        log.info("Updating guest with ID: {}", guestId);
        Guest guest = (Guest)this.guestRepository.findById(guestId).orElseThrow(() -> new EntityNotFoundException("Guest not found"));
        User user = AppUtils.getCurrentUser();
        if (!user.equals(guest.getUser())) {
            throw new AccessDeniedException("You are not the owner of this guest");
        } else {
            this.modelMapper.map(guestDto, guest);
            guest.setUser(user);
            guest.setId(guestId);
            this.guestRepository.save(guest);
            log.info("Guest with ID: {} updated successfully", guestId);
        }
    }

    public void deleteGuest(Long guestId) {
        log.info("Deleting guest with ID: {}", guestId);
        Guest guest = (Guest)this.guestRepository.findById(guestId).orElseThrow(() -> new EntityNotFoundException("Guest not found"));
        User user = AppUtils.getCurrentUser();
        if (!user.equals(guest.getUser())) {
            throw new AccessDeniedException("You are not the owner of this guest");
        } else {
            this.guestRepository.deleteById(guestId);
            log.info("Guest with ID: {} deleted successfully", guestId);
        }
    }
}
