package org.bicycle.backend.dao.jpa;

import org.bicycle.backend.models.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
