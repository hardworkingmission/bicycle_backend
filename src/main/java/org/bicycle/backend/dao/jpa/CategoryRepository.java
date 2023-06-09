package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
