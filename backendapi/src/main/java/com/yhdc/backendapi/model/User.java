package com.yhdc.backendapi.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.yhdc.backendapi.model.enums.StatusType;
import com.yhdc.backendapi.model.enums.GenderType;
import com.yhdc.backendapi.model.enums.RoleType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false)
	private Long id;

	@Column(length = 20, unique = true)
	private String username;

	@Column(length = 20, unique = true)
	private String email;

	@Column(length = 100)
	private String password;
	
	@Column(length = 20)
	private String firstname;
	
	@Column(length = 20)
	private String lastname;
	
	@Column(length = 30)
	private String phone;
	
	@Column(columnDefinition = "text")
	private String intro;
	
	@Enumerated(EnumType.STRING)
	@ColumnDefault("EMPTY")
	private GenderType gender;

	@Enumerated(EnumType.STRING)
	@ColumnDefault("USER")
	private RoleType role;

	@Enumerated(EnumType.STRING)
	@ColumnDefault("ACTIVE")
	private StatusType status;

	@CreationTimestamp
	private Timestamp regDate;

	@UpdateTimestamp
	private Timestamp modDate;

}
