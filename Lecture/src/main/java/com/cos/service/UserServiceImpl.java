package com.cos.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cos.domain.LectureVO;
import com.cos.domain.UserVO;
import com.cos.persistence.LectureDAO;
import com.cos.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{

	@Inject
	private UserDAO dao;
	
	@Override
	public UserVO select(String userID) throws Exception {
		return dao.select(userID);
	}
	@Override
	public void insert(UserVO user) throws Exception {
		dao.insert(user);
	}
	@Override
	public int login(UserVO user) throws Exception {
		return dao.login(user);
	}
}
