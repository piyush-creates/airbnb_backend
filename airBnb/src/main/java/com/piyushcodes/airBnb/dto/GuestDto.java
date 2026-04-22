package com.piyushcodes.airBnb.dto;

import com.piyushcodes.airBnb.entity.User;
import com.piyushcodes.airBnb.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
