package org.company.repositories;

import java.util.List;

import org.company.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {

    List<User> findByNameLike(String name);

}

