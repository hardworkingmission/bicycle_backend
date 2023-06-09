package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
