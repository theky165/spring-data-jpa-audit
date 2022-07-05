package com.example.springdatajpaauditing.repository;

import com.example.springdatajpaauditing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
