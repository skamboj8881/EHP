package com.ehp.user.entities;

import java.time.LocalTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class User {
	@Id
	private Long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String mobile;
	
	@ManyToMany
	private Set<Role> role;
	
	@Column
	private LocalTime createdDate;
	@Column
	private LocalTime updatedDate;
}
