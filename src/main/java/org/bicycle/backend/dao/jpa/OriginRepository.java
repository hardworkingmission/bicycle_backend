package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.Origin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OriginRepository extends JpaRepository<Origin, Long> {
}
