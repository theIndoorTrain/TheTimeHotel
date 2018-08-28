package com.xm.timeHotel.controller.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.xm.timeHotel.pojo.User;

@Mapper(componentModel="spring")
public interface UserDtoMapper {
	
	
	public User dtoToUser(UserDto userDto) ;
	@Mappings({
		@Mapping(source="password",target="password",ignore=true)
	})
	public UserDto userToDto(User user);

}
