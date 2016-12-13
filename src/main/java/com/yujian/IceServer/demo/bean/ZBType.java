package com.yujian.IceServer.demo.bean;

import java.util.Date;

public class ZBType {

	private Long id;
	private String roomIds; 
	private Long teamType; //团队类型
	private String teamName; //团队名称
	private Integer winCustomer;//赢在大户室
	private Integer winTrade;//赢在交易
	private String serverId;//平台
	private Integer delStatus;
	private Date dtCreateTime;
	private String creatUser;
	private Date dtUpdateTime;
	private String updateUser;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRoomIds() {
		return roomIds;
	}
	public void setRoomIds(String roomIds) {
		this.roomIds = roomIds;
	}
	public Long getTeamType() {
		return teamType;
	}
	public void setTeamType(Long teamType) {
		this.teamType = teamType;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getWinCustomer() {
		return winCustomer;
	}
	public void setWinCustomer(Integer winCustomer) {
		this.winCustomer = winCustomer;
	}
	public Integer getWinTrade() {
		return winTrade;
	}
	public void setWinTrade(Integer winTrade) {
		this.winTrade = winTrade;
	}
	public String getServerId() {
		return serverId;
	}
	public void setServerId(String serverId) {
		this.serverId = serverId;
	}
	public Integer getDelStatus() {
		return delStatus;
	}
	public void setDelStatus(Integer delStatus) {
		this.delStatus = delStatus;
	}
	public Date getDtCreateTime() {
		return dtCreateTime;
	}
	public void setDtCreateTime(Date dtCreateTime) {
		this.dtCreateTime = dtCreateTime;
	}
	public String getCreatUser() {
		return creatUser;
	}
	public void setCreatUser(String creatUser) {
		this.creatUser = creatUser;
	}
	public Date getDtUpdateTime() {
		return dtUpdateTime;
	}
	public void setDtUpdateTime(Date dtUpdateTime) {
		this.dtUpdateTime = dtUpdateTime;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	
}
