package com.exercise.dao;

import java.util.List;

import com.exercise.dto.UserDto;


public interface UserDAO {

	public int insert(UserDto dto);

	public int update(UserDto dto);

	public int delete(int id);

	public UserDto selectOne(int id);

	public List<UserDto> selectAll();

}
