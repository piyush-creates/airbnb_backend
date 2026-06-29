package com.piyushcodes.airBnb.service;


import com.piyushcodes.airBnb.dto.ProfileUpdateRequestDto;
import com.piyushcodes.airBnb.dto.UserDto;
import com.piyushcodes.airBnb.entity.User;
import org.jspecify.annotations.Nullable;

public interface UserService {

    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
