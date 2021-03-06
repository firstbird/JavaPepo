package com.testHibernate.domain;
// Generated 2016-9-20 8:09:13 by Hibernate Tools 5.1.0.Beta1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Album generated by hbm2java
 */
public class Album implements java.io.Serializable {

	private Integer id;
	private Users users;
	private String name;
	private String descript;
	private String photo;
	private Date creTime;
	private Date updTime;
	private Set photos = new HashSet(0);

	public Album() {
	}

	public Album(Users users, String name, String descript, String photo, Date creTime, Date updTime, Set photos) {
		this.users = users;
		this.name = name;
		this.descript = descript;
		this.photo = photo;
		this.creTime = creTime;
		this.updTime = updTime;
		this.photos = photos;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescript() {
		return this.descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Date getCreTime() {
		return this.creTime;
	}

	public void setCreTime(Date creTime) {
		this.creTime = creTime;
	}

	public Date getUpdTime() {
		return this.updTime;
	}

	public void setUpdTime(Date updTime) {
		this.updTime = updTime;
	}

	public Set getPhotos() {
		return this.photos;
	}

	public void setPhotos(Set photos) {
		this.photos = photos;
	}

}
