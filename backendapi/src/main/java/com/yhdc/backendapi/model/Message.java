package com.yhdc.backendapi.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.yhdc.backendapi.model.enums.PrivacyType;

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
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private Long recieverId;

	@Column(length = 50)
	private String title;

	@Column(columnDefinition = "text")
	private String content;

	@Enumerated(EnumType.STRING)
	private PrivacyType privacy;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@CreationTimestamp
	private Timestamp regDate;

}
