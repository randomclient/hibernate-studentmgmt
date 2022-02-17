package com.exercise.dao;

import java.util.List;

import com.exercise.dto.ClassDto;


public interface ClassDAO {
	
	public int insert(ClassDto dto);

	public ClassDto selectOne(String id);

	public List<ClassDto> selectAll(ClassDto dto);
}
