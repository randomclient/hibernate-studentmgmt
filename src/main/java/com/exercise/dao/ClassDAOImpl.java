package com.exercise.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercise.dto.ClassDto;

@Repository
public class ClassDAOImpl implements ClassDAO {

	@Autowired
	EntityManager entityManager;
	
	@Override
	public int insert(ClassDto dto) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(dto);
		return 1;
	}

	@Override
	public ClassDto selectOne(String id) {
		Session currentSession = entityManager.unwrap(Session.class);
		ClassDto classObj = currentSession.get(ClassDto.class, id);
		return classObj;
	}

	@Override
	public List<ClassDto> selectAll(ClassDto dto) {
		Session currentSession = entityManager.unwrap(Session.class);
		List<ClassDto> list = currentSession.createQuery("from ClassDto", ClassDto.class).getResultList();
		return list;
	}
	
}
