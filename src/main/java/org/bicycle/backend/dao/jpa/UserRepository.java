package org.bicycle.backend.dao.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.bicycle.backend.models.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
