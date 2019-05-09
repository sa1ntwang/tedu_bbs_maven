package com.tedu.pojo;

import java.util.Date;

public class Post {
	private Integer postId;
	private Integer writerId;
	private Integer inFId;
	private String postName;
	private String postBody;
	private Integer viewCount;
	private Integer writeBack;
	private Date lastUpdate;
	private String writeBackList;
	private Integer postStatus;
	private Integer showOnHome;
	private Integer recommended;
	public Post() {
		super();
	}
	public Post(Integer postId, Integer writerId, Integer inFId, String postName, String postBody, Integer viewCount,
			Integer writeBack, Date lastUpdate, String writeBackList, Integer postStatus, Integer showOnHome,
			Integer recommended) {
		super();
		this.postId = postId;
		this.writerId = writerId;
		this.inFId = inFId;
		this.postName = postName;
		this.postBody = postBody;
		this.viewCount = viewCount;
		this.writeBack = writeBack;
		this.lastUpdate = lastUpdate;
		this.writeBackList = writeBackList;
		this.postStatus = postStatus;
		this.showOnHome = showOnHome;
		this.recommended = recommended;
	}
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getWriterId() {
		return writerId;
	}
	public void setWriterId(Integer writerId) {
		this.writerId = writerId;
	}
	public Integer getInFId() {
		return inFId;
	}
	public void setInFId(Integer inFId) {
		this.inFId = inFId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostBody() {
		return postBody;
	}
	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}
	public Integer getViewCount() {
		return viewCount;
	}
	public void setViewCount(Integer viewCount) {
		this.viewCount = viewCount;
	}
	public Integer getWriteBack() {
		return writeBack;
	}
	public void setWriteBack(Integer writeBack) {
		this.writeBack = writeBack;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	public String getWriteBackList() {
		return writeBackList;
	}
	public void setWriteBackList(String writeBackList) {
		this.writeBackList = writeBackList;
	}
	public Integer getPostStatus() {
		return postStatus;
	}
	public void setPostStatus(Integer postStatus) {
		this.postStatus = postStatus;
	}
	public Integer getShowOnHome() {
		return showOnHome;
	}
	public void setShowOnHome(Integer showOnHome) {
		this.showOnHome = showOnHome;
	}
	public Integer getRecommended() {
		return recommended;
	}
	public void setRecommended(Integer recommended) {
		this.recommended = recommended;
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", writerId=" + writerId + ", inFId=" + inFId + ", postName=" + postName
				+ ", postBody=" + postBody + ", viewCount=" + viewCount + ", writeBack=" + writeBack + ", lastUpdate="
				+ lastUpdate + ", writeBackList=" + writeBackList + ", postStatus=" + postStatus + ", showOnHome="
				+ showOnHome + ", recommended=" + recommended + "]";
	}
}
