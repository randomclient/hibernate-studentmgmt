package com.exercise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.exercise.dao.UserDAO;
import com.exercise.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Transactional
	@Override
	public int insert(UserDto dto) {
		return userDAO.insert(dto);
	}

	@Transactional
	@Override
	public int update(UserDto dto) {
		return userDAO.update(dto);
	}

	@Transactional
	@Override
	public int delete(int id) {
		return userDAO.delete(id);
	}

	@Override
	public UserDto selectOne(int id) {
		return userDAO.selectOne(id);
	}

	@Transactional
	@Override
	public List<UserDto> selectAll() {
		return userDAO.selectAll();
	}

}
