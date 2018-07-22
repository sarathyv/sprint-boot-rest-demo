package com.example.sprintbootrestdemo.repository;

import com.example.sprintbootrestdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJpaRepository extends JpaRepository<User, Integer> {
}
