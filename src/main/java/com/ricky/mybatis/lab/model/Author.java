package com.ricky.mybatis.lab.model;

public class Author {
	private long id;
	private String uid;
	private String nickname;
	private String password;
	private int gender;	//1.男性、2.女性
	private int age;
	private String register_time;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getRegisterTime() {
		return register_time;
	}
	public void setRegisterTime(String register_time) {
		this.register_time = register_time;
	}
	
}
