package com.ehp.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ehp.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
