package com.example.demo.login.domain.repository.jdbc;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.model.InstaUser;
import com.example.demo.login.domain.repository.InstaUserDao;

@Repository("InstaUserDaoJdbcImpl")
public class InstaUserDaoJdbcImpl implements InstaUserDao{

	@Autowired
    JdbcTemplate jdbc;

	@Override
	public List<InstaUser> selectMany() throws DataAccessException {
		List<Map<String, Object>> getList = jdbc.queryForList("SELECT * FROM user_data");
        List<InstaUser> instaUserList = new ArrayList<>();

        for (Map<String, Object> map : getList) {
            InstaUser instaUser = new InstaUser();

            instaUser.setUserId((String) map.get("userId"));
            instaUser.setPost((String) map.get("post"));
            instaUser.setFollow((String) map.get("follow"));
            instaUser.setFollower((String) map.get("follower"));
            instaUser.setCreatedAt((Timestamp) map.get("createdAt"));

            instaUserList.add(instaUser);
        }
        return instaUserList;
	}

}
