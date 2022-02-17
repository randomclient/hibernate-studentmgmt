package com.exercise.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.dao.ClassDAO;
import com.exercise.dto.ClassDto;

@Service
public class ClassServiceImpl implements ClassService{

	@Autowired
	private ClassDAO classDAO;
		
	@Transactional
	@Override
	public int insert(ClassDto dto) {
		return classDAO.insert(dto);
	}

	@Transactional
	@Override
	public ClassDto selectOne(String id) {
		return classDAO.selectOne(id);
	}

	@Transactional
	@Override
	public List<ClassDto> selectAll(ClassDto dto) {
		return classDAO.selectAll(dto);
	}

}
