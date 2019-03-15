package com.example.demo.login.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.login.domain.model.InstaUser;
import com.example.demo.login.domain.repository.InstaUserDao;

@Transactional
@Service
public class InstaUserServise {

	@Autowired
    @Qualifier("InstaUserDaoJdbcImpl")
    InstaUserDao dao;


	public List<InstaUser> selectMany() {
		return dao.selectMany();
	}

}
