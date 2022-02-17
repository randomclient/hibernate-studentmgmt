package com.exercise.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercise.dto.StudentDto;
import com.exercise.dto.UserDto;

@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private EntityManager entityManager;

	@Override
	public int insert(StudentDto dto) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(dto);
		return 1;
	}

	@Override
	public int update(StudentDto dto) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(dto);
		return 1;
	}

	@Override
	public int delete(String id) {
		Session currentSession = entityManager.unwrap(Session.class);
		StudentDto userObj = currentSession.get(StudentDto.class, id);
		currentSession.delete(userObj);
		return 1;
	}

	@Override
	public StudentDto selectOne(String id) {
		Session currentSession = entityManager.unwrap(Session.class);
		StudentDto studentObj = currentSession.get(StudentDto.class, id);
		return studentObj;
	}

	@Override
	public List<StudentDto> selectAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		List<StudentDto> list = currentSession.createQuery("from StudentDto", StudentDto.class).getResultList();
		return list;
	}

}
