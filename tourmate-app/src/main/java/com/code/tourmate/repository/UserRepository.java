package com.code.tourmate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.tourmate.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}