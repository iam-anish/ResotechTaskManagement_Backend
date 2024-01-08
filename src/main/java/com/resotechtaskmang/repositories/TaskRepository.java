package com.resotechtaskmang.repositories;

import com.resotechtaskmang.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}

