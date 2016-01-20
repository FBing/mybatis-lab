package com.ricky.mybatis.lab.model;

public class Comment {
	private long id;
	private String title;
	private String content;
	private long blog_id;
	private long uid;
	private String publish_time;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getBlogId() {
		return blog_id;
	}
	public void setBlogId(long blog_id) {
		this.blog_id = blog_id;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getPublishTime() {
		return publish_time;
	}
	public void setPublishTime(String publish_time) {
		this.publish_time = publish_time;
	}
	
}
