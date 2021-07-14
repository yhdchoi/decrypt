package com.yhdc.backendapi.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "boards")
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false)
	private Long id;

	@OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Board> boards;

	@Column(length = 20, nullable = false)
	private String username;
	@Column(length = 20, nullable = false)
	private String password;
	@Column(length = 20, nullable = false)
	private String email;

	@Column(length = 20, nullable = false)
	private String lastname;
	@Column(length = 20, nullable = false)
	private String firstname;

	@Column(length = 20, nullable = false)
	private String phone;
	@Column(columnDefinition = "text")
	private String address;
	// job
	@Column(length = 10, nullable = false)
	private String role;

	// default = true
	@Column(nullable = false)
	private boolean active;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:SS")
	@CreationTimestamp
	private LocalDateTime regDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:SS")
	@UpdateTimestamp
	private LocalDateTime modDate;

}
