package com.example.demo.login.domain.repository;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.example.demo.login.domain.model.InstaUser;

public interface InstaUserDao {

    public List<InstaUser> selectMany() throws DataAccessException;
}
