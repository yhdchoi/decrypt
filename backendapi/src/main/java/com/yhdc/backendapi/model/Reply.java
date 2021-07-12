package com.yhdc.backendapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
@ToString(exclude = { "comment", "member" })
public class Reply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(targetEntity = Member.class)
	@JoinColumn(name = "member_id", referencedColumnName = "ID")
	private Member member;

	@ManyToOne(targetEntity = Comment.class)
	@JoinColumn(name = "comment_id", referencedColumnName = "ID")
	private Comment comment;

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
