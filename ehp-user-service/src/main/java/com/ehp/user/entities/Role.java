package com.ehp.user.entities;

import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Role {

	@Id
	private Long id;
	@Column
	private String name;
	@Column
	private boolean active;
	@Column
	private LocalTime createdDate;
	@Column
	private LocalTime updatedDate;
}
