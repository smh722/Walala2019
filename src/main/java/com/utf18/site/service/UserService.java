package com.utf18.site.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utf18.site.dao.UserDAO;
import com.utf18.site.vo.UserVO;

@Service
public class UserService {
	
	@Autowired
	private UserDAO dao;

	
	public void insertUser(UserVO vo) {
		dao.insert(vo);
	}
	/*
	public UserVO getuservo(UserVO vo) {
		return dao.getuservo(vo);
	}
	*/
}
