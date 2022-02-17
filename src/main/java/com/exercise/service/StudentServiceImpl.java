package com.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.dao.StudentDAO;
import com.exercise.dto.StudentDto;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Transactional
	@Override
	public int insert(StudentDto dto) {
		return studentDAO.insert(dto);
	}

	@Transactional
	@Override
	public int update(StudentDto dto) {
		return studentDAO.update(dto);
	}

	@Transactional
	@Override
	public int delete(String id) {
		return studentDAO.delete(id);
	}

	@Transactional
	@Override
	public StudentDto selectOne(String id) {
		return studentDAO.selectOne(id);
	}

	@Transactional
	@Override
	public List<StudentDto> selectAll() {
		return studentDAO.selectAll();
	}

}
