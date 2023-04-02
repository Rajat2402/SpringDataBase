package org.studyeasy.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class Model {
	
	@Id
	@Column(name="users_Id")
	private int userId;
	
	@Column(name="username")
	private String name;
	
	@Column(name="email")
	private String email;

	public Model() {
	}

	public Model(int userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "model [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}

}
