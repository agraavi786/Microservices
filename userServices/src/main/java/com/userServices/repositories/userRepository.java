package com.userServices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.userServices.entities.User;

public interface userRepository extends JpaRepository<User, String> {

}
