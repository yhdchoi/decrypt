package com.yhdc.decrypt.model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.ToString;

@Entity
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;
	private String email;
	private String password;
	private String role;

	@OneToMany(mappedBy = "user")
	private List<Board> board;

	@OneToMany(mappedBy = "user")
	private List<Comment> comment;

	@CreationTimestamp
	private Timestamp createDate;
	@UpdateTimestamp
	private Timestamp updateDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	@JsonManagedReference
	public List<Board> getBoard() {
		return board;
	}

	public void setBoard(List<Board> board) {
		this.board = board;
	}
	
//	@JsonManagedReference
	public List<Comment> getComment() {
		return comment;
	}

	public void setComment(List<Comment> comment) {
		this.comment = comment;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}
