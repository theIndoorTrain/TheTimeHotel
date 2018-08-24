package com.xm.timeHotel.controller.dto;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.xm.timeHotel.pojo.User;

@Mapper(componentModel="spring")
public interface UserDtoMapper {
	
	
	public User dtoToUser(UserDto userDto) ;
	public UserDto userToDto(User user);

}
