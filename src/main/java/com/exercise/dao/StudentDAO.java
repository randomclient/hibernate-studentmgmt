package com.exercise.dao;

import java.util.List;

import com.exercise.dto.StudentDto;


public interface StudentDAO {

	public int insert(StudentDto dto);

	public int update(StudentDto dto);

	public int delete(String id);

	public StudentDto selectOne(String id);

	public List<StudentDto> selectAll();
}
