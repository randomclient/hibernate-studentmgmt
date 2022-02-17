package com.exercise.service;

import java.util.List;

import com.exercise.dto.ClassDto;

public interface ClassService {
	
	public int insert(ClassDto dto);

	public ClassDto selectOne(String id);

	public List<ClassDto> selectAll(ClassDto dto);
}
