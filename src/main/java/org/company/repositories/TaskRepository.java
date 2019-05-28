package org.company.repositories;

import java.util.List;

import org.company.entities.Task;
import org.company.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long>{

    List<Task> findByUser(User user);

}
