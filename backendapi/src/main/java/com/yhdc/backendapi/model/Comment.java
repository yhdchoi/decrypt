package com.yhdc.backendapi.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
@ToString(exclude = "board")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "board_id")
	@JsonIgnore
	private Board board;

	@OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Reply> replies;

	@Column(length = 50)
	private String writer;

	@Column(columnDefinition = "text")
	private String content;

	@Column(nullable = false)
	private boolean privacy;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:SS")
	@CreationTimestamp
	private LocalDateTime regDate;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:SS")
	@UpdateTimestamp
	private LocalDateTime modDate;

	public void changeContent(String content) {
		this.content = content;
	}

	public void changePrivacy(boolean privacy) {
		this.privacy = privacy;
	}
}
