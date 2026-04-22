package com.piyushcodes.airBnb.dto;

import com.piyushcodes.airBnb.entity.HotelContactInfo;
import lombok.Data;

@Data
public class HotelDto {

    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private Boolean active;

}
