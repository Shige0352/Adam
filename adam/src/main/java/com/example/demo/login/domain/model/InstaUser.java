package com.example.demo.login.domain.model;

import java.sql.Timestamp;

import lombok.Data;


@Data
public class InstaUser {

	private String userId;
	private String post;
	private String follow;
	private String follower;
	private Timestamp createdAt;
}
