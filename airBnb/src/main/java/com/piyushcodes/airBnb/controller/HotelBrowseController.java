package com.piyushcodes.airBnb.controller;

import com.piyushcodes.airBnb.dto.HotelDto;
import com.piyushcodes.airBnb.dto.HotelInfoDto;
import com.piyushcodes.airBnb.dto.HotelPriceDto;
import com.piyushcodes.airBnb.dto.HotelSearchRequest;
import com.piyushcodes.airBnb.service.HotelService;
import com.piyushcodes.airBnb.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

    @PostMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        var page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
