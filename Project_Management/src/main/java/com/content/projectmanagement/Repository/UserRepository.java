package com.content.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.projectmanagement.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
