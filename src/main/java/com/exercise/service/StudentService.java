package com.exercise.service;

import java.util.List;

import com.exercise.dto.StudentDto;

public interface StudentService {
	
	public int insert(StudentDto dto);

	public int update(StudentDto dto);

	public int delete(String id);

	public StudentDto selectOne(String id);

	public List<StudentDto> selectAll();
}
