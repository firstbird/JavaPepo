package com.testHibernate.domain;
// Generated 2016-9-20 8:09:13 by Hibernate Tools 5.1.0.Beta1

/**
 * Localcity generated by hbm2java
 */
public class Localcity implements java.io.Serializable {

	private Integer lcId;
	private String lcName;
	private Integer lcLpId;

	public Localcity() {
	}

	public Localcity(String lcName, Integer lcLpId) {
		this.lcName = lcName;
		this.lcLpId = lcLpId;
	}

	public Integer getLcId() {
		return this.lcId;
	}

	public void setLcId(Integer lcId) {
		this.lcId = lcId;
	}

	public String getLcName() {
		return this.lcName;
	}

	public void setLcName(String lcName) {
		this.lcName = lcName;
	}

	public Integer getLcLpId() {
		return this.lcLpId;
	}

	public void setLcLpId(Integer lcLpId) {
		this.lcLpId = lcLpId;
	}

}