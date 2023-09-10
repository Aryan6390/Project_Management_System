package com.content.projectmanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.projectmanagement.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // Add custom query methods if needed
}
