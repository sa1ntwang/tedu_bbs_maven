package com.tedu.pojo;

public class forum {
	private Integer forumId;
	private String forumName;
	private Integer followUsers;
	private Integer pageviews;
	private Integer forumStatus;
	public forum() {
		super();
	}
	public forum(Integer forumId, String forumName, Integer followUsers, Integer pageviews, Integer forumStatus) {
		super();
		this.forumId = forumId;
		this.forumName = forumName;
		this.followUsers = followUsers;
		this.pageviews = pageviews;
		this.forumStatus = forumStatus;
	}
	public Integer getForumId() {
		return forumId;
	}
	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public Integer getFollowUsers() {
		return followUsers;
	}
	public void setFollowUsers(Integer followUsers) {
		this.followUsers = followUsers;
	}
	public Integer getPageviews() {
		return pageviews;
	}
	public void setPageviews(Integer pageviews) {
		this.pageviews = pageviews;
	}
	public Integer getForumStatus() {
		return forumStatus;
	}
	public void setForumStatus(Integer forumStatus) {
		this.forumStatus = forumStatus;
	}
	@Override
	public String toString() {
		return "forum [forumId=" + forumId + ", forumName=" + forumName + ", followUsers=" + followUsers
				+ ", pageviews=" + pageviews + ", forumStatus=" + forumStatus + "]";
	}
	
}
