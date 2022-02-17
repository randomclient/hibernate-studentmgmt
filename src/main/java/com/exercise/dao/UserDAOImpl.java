package com.exercise.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exercise.dto.UserDto;

@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	EntityManager entityManager;

	@Override
	public int insert(UserDto dto) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(dto);
		return 1;
	}

	@Override
	public int update(UserDto dto) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.update(dto);
		return 1;
	}

	@Override
	public int delete(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		UserDto userObj = currentSession.get(UserDto.class, id);
		currentSession.delete(userObj);
		return 1;
	}

	@Override
	public UserDto selectOne(int id) {
		System.out.println("hi");
		Session currentSession = entityManager.unwrap(Session.class);
		UserDto userObj = currentSession.get(UserDto.class, id);
		return userObj;
	}

	@Override
	public List<UserDto> selectAll() {
		Session currentSession = entityManager.unwrap(Session.class);
		List<UserDto> list = currentSession.createQuery("from UserDto", UserDto.class).getResultList();
		return list;
	}

}
