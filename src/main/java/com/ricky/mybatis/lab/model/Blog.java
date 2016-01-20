package com.ricky.mybatis.lab.model;

public class Blog {
	private long id;
	private String title;
	private String content;
	private long section_id;
	private long uid;
	private String publish_time;
	private String update_time;
	
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
	public long getSectionId() {
		return section_id;
	}
	public void setSectionId(long section_id) {
		this.section_id = section_id;
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
	public String getUpdateTime() {
		return update_time;
	}
	public void setUpdateTime(String update_time) {
		this.update_time = update_time;
	}
	
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", content=" + content
				+ ", section_id=" + section_id + ", uid=" + uid
				+ ", publish_time=" + publish_time + ", update_time="
				+ update_time + "]";
	}
	
}
