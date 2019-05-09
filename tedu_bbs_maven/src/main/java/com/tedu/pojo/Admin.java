package com.tedu.pojo;

public class Admin {
	private Integer aId;
	private String aName;
	private String aPhone;
	private Integer fId;
	private Integer uId;
	private Integer examine;
	public Admin() {
		super();
	}
	public Admin(Integer aId, String aName, String aPhone, Integer fId, Integer uId, Integer examine) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aPhone = aPhone;
		this.fId = fId;
		this.uId = uId;
		this.examine = examine;
	}
	public Integer getaId() {
		return aId;
	}
	public void setaId(Integer aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getaPhone() {
		return aPhone;
	}
	public void setaPhone(String aPhone) {
		this.aPhone = aPhone;
	}
	public Integer getfId() {
		return fId;
	}
	public void setfId(Integer fId) {
		this.fId = fId;
	}
	public Integer getuId() {
		return uId;
	}
	public void setuId(Integer uId) {
		this.uId = uId;
	}
	public Integer getExamine() {
		return examine;
	}
	public void setExamine(Integer examine) {
		this.examine = examine;
	}
	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aName=" + aName + ", aPhone=" + aPhone + ", fId=" + fId + ", uId=" + uId
				+ ", examine=" + examine + "]";
	}
	
}
